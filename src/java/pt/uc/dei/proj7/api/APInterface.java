/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uc.dei.proj7.api;

import java.util.HashMap;
import java.util.List;
import javax.persistence.NoResultException;
import objetEntities.Category;
import objetEntities.Product;
import objetEntities.Sell;
import objetEntities.SellProduct;

/**
 *
 * @author Elsa
 */
public interface APInterface {

//Métodos da entidade Product:
    public List<Product> findAllProducts() throws NoResultException;

    public List<Product> findProductByCategory(Long idCategory) throws NoResultException;

//    public List<Product> searchByProduct(String column, String word) throws NoResultException;
    public Product findProductById(Long id) throws NoResultException;

    public Product findProductByDesignation(String brand, String model, String version) throws NoResultException;

    public List<Category> findAllCategory() throws NoResultException;

//Métodos da entidade Sell:
    public void makeSell(HashMap<Integer, Integer> hashmap, String apkKey);

    public void removeSell(long id, String apkKey);

    public List<Sell> sellsByUser(Long idUser) throws NoResultException;

    public List<SellProduct> detailBySell(Long idSell) throws NoResultException;

//Métodos da entidade SellProduct:
    public void addProductSell(long idProduct, long idSell, String apkKey, int quantity);

    public void editProductSell(long idProduct, long idSell, String apkKey, int quantity);

    public void removeProductSell(long idProduct, long idSell, String apkKey);

    public List<SellProduct> detailSell(Long idSell) throws NoResultException;
}
