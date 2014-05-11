/*
 * Acerta o Rumo, edicao 2013/14
 * Programação Avançada de Java.
 *
 *  Vitor Aires
 */

package objetEntities;

import java.util.Date;

/**
 *
 * @author Aires
 */
public class Product {

    private int idProduct;
    private String brand;
    private String description;
    private String model;
    private Double price;
    private Integer quantity;
    private Date repositiondate;
    private String version;
    private int idCategory;

    public Product(int idProduct, String brand, String description, String model, Double price, Integer quantity, Date repositiondate, String version, int idCategory) {
        this.idProduct = idProduct;
        this.brand = brand;
        this.description = description;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.repositiondate = repositiondate;
        this.version = version;
        this.idCategory = idCategory;
    }

    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the repositiondate
     */
    public Date getRepositiondate() {
        return repositiondate;
    }

    /**
     * @param repositiondate the repositiondate to set
     */
    public void setRepositiondate(Date repositiondate) {
        this.repositiondate = repositiondate;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the idCategory
     */
    public int getIdCategory() {
        return idCategory;
    }

    /**
     * @param idCategory the idCategory to set
     */
    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

}
