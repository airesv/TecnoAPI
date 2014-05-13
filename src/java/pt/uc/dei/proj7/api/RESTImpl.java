/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uc.dei.proj7.api;

import java.util.List;
import javax.persistence.NoResultException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import objetEntities.Category;
import objetEntities.Product;

/**
 *
 * @author Elsa
 */
public class RESTImpl implements APInterface {

    private Client client;
    private WebTarget webTarget;
    private static final String BASE_URI = "http://localhost:8080/WebServiceAPI";

    public RESTImpl() {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    //Métodos da entidade Product:
    public List<Product> findAllProducts() throws NoResultException {
        WebTarget webTargetProduct = client.target(BASE_URI).path("product");
        List<Product> result;
        result = webTargetProduct
                .path("all")
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Product>>() {
                });
        client.close();
        return result;
    }

    public List<Product> findProductByCategory(Long idCategory) throws NoResultException {
        return findProductByCategory(idCategory);
    }

    public List<Product> searchByProduct(String column, String word) throws NoResultException {
        return searchByProduct(column, word);
    }

    public Product findProductById(Long id) throws NoResultException {
        return findProductById(id);
    }

    public Product findProductByDesignation(String brand, String model, String version) throws NoResultException {
        return findProductByDesignation(brand, model, version);
    }

    public List<Category> findAllCategory() throws NoResultException {
        return findAllCategory();
    }

//Métodos da entidade Sell:
//    public void makeSell(HashMap<Integer, Integer> hashmap, String apkKey) {
//        makeSell(hashmap, apkKey);
//    }
//
//    public void removeSell(long id, String apkKey) {
//        removeSell(id, apkKey);
//    }
//
//    public List<Sell> sellsByUser(Long idUser) throws NoResultException {
//        return sellsByUser(idUser);
//    }
//
//    public List<SellProduct> detailBySell(Long idSell) throws NoResultException {
//        return detailBySell(idSell);
//    }
//
////Métodos da entidade SellProduct:
//    public void addProductSell(long idProduct, long idSell, String apkKey, int quantity) {
//        addProductSell(idProduct, idSell, apkKey, quantity);
//    }
//
//    public void editProductSell(long idProduct, long idSell, String apkKey, int quantity) {
//        editProductSell(idProduct, idSell, apkKey, quantity);
//    }
//
//    public void removeProductSell(long idProduct, long idSell, String apkKey) {
//        removeProductSell(idProduct, idSell, apkKey);
//    }
//
//    public List<SellProduct> detailSell(Long idSell) throws NoResultException {
//        return detailSell(idSell);
//    }
}
