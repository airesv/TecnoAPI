/*
 * Acerta o Rumo, edicao 2013/14
 * Programação Avançada de Java.
 *
 *  Vitor Aires
 */
package objetEntities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Aires
 */
public class Sell {

    private Long idSell;
    private Date actualdate;
    private Date delivery;
    private Long idClient;
    private List<SellProduct> sellProductList;

    public Sell() {
    }

    /**
     * @return the idSell
     */
    public Long getIdSell() {
        return idSell;
    }

    /**
     * @param idSell the idSell to set
     */
    public void setIdSell(Long idSell) {
        this.idSell = idSell;
    }

    public Date getActualdate() {
        return actualdate;
    }

    public void setActualdate(Date actualdate) {
        this.actualdate = actualdate;
    }

    public Date getDelivery() {
        return delivery;
    }

    public void setDelivery(Date delivery) {
        this.delivery = delivery;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public List<SellProduct> getSellProductList() {
        return sellProductList;
    }

    public void setSellProductList(List<SellProduct> sellProductList) {
        this.sellProductList = sellProductList;
    }

}
