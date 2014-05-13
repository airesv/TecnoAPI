/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetEntities;

/**
 *
 * @author Elsa
 */
public class SellProduct {

    private Long idSellProduct;
    private Integer quantity;
    private Sell sell;
    private Product product;

    public SellProduct() {
    }

    public Long getIdSellProduct() {
        return idSellProduct;
    }

    public void setIdSellProduct(Long idSellProduct) {
        this.idSellProduct = idSellProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
