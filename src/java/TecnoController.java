
/*
 * Acerta o Rumo, edicao 2013/14
 * Programação Avançada de Java.
 *
 *  Vitor Aires
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import objetEntities.Category;
import objetEntities.Product;

/**
 *
 * @author Aires
 */
@Named
@RequestScoped
public class TecnoController implements Serializable {

    private List<Category> categories;

    private List<Product> products;

    private List<Product> encomenda;
    private String name;

    public void clear(Product prod) {
        encomenda.add(prod);

    }

    public void gerarInfo(Product prod) {
        setName(prod.getBrand());
    }

    public void gerarCategories() {
        for (int i = 0; i < 3; i++) {
            Category cat = new Category(i, "Category" + i);
            categories.add(cat);
        }
    }

    public void gerarProdutos() {
        products = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Product prod = new Product(i, "brand" + i, "descrip" + i, "i", i * 10.5, i, null, "1", i % 2);
            products.add(prod);
        }

    }

    public TecnoController() {
        encomenda = new ArrayList<>();
    }

    /**
     * @return the categories
     */
    public List<Category> getCategories() {
        categories = new ArrayList<>();
        Category cat1 = new Category(1, "Category" + 1);
        categories.add(cat1);
        Category cat2 = new Category(2, "Category" + 2);
        categories.add(cat2);
        Category cat3 = new Category(3, "Category" + 3);
        categories.add(cat3);

        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * @return the products
     */
    public List<Product> getProducts() {
        gerarProdutos();
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return the encomenda
     */
    public List<Product> getEncomenda() {
        return encomenda;
    }

    /**
     * @param encomenda the encomenda to set
     */
    public void setEncomenda(List<Product> encomenda) {
        this.encomenda = encomenda;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
