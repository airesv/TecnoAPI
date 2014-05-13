/*
 * Acerta o Rumo, edicao 2013/14
 * Programação Avançada de Java.
 *
 *  Vitor Aires
 */

package objetEntities;

/**
 *
 * @author Aires
 */
public class ProductQtd {

    private Product product;
    private int quantity;

    public ProductQtd() {
    }

    public ProductQtd(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
