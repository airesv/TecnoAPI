package pt.uc.dei.proj7.client;


/*
 * Acerta o Rumo, edicao 2013/14
 * Programação Avançada de Java.
 *
 *  Vitor Aires
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import objetEntities.Product;

/**
 *
 * @author Aires
 */
@Named
@SessionScoped
public class SessaoController implements Serializable {

    private List<Product> encomenda;
    private Boolean isSoap;
    private int sizeEncomenda;
    private double total;

    public SessaoController() {
        encomenda = new ArrayList<>();
        isSoap = true;
        sizeEncomenda = 0;
    }

    public void incrementa(Product product) {
        for (Product pro : encomenda) {
            if (pro.equals(product)) {
                pro.setQtyBuy(product.getQtyBuy() + 1);
            }
        }
        
    }

    public void changeWS() {
        setIsSoap(!isSoap);
        System.out.println("--->" + isSoap);
    }

    public void caltotal() {
        double value = 0;
        for (Product product : encomenda) {
            value += product.getQuantity() * product.getPrice();
        }

        setTotal(value);
    }

    public void insert(Product prod) {
        getEncomenda().add(prod);
        setSizeEncomenda(encomenda.size());
    }

    public void remove(Product prod) {
        getEncomenda().remove(prod);
        setSizeEncomenda(encomenda.size());
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
     * @return the isSoap
     */
    public Boolean getIsSoap() {
        return isSoap;
    }

    /**
     * @param isSoap the isSoap to set
     */
    public void setIsSoap(Boolean isSoap) {
        this.isSoap = isSoap;
    }

    /**
     * @return the sizeEncomenda
     */
    public int getSizeEncomenda() {

        return sizeEncomenda;
    }

    /**
     * @param sizeEncomenda the sizeEncomenda to set
     */
    public void setSizeEncomenda(int sizeEncomenda) {
        this.sizeEncomenda = sizeEncomenda;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        caltotal();
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

}
