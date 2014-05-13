/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uc.dei.proj7.api;

import java.util.List;
import javax.persistence.NoResultException;
import javax.ws.rs.ClientErrorException;
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
    private static final String BASE_URI = "http://localhost:8080/WebServiceAPI/webresources";

    public RESTImpl() {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    //Métodos da entidade Product:
    public List<Product> findAllProducts() throws NoResultException {
        WebTarget webTargetProduct = webTarget.path("product");
        List<Product> result;
        result = webTargetProduct
                .path("all")
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Product>>() {
                });
        client.close();
        return result;
    }

    public List<Product> findProductByCategory(Long idCategory) throws NoResultException, ClientErrorException {
        WebTarget webTargetProduct = webTarget.path("product");
        List<Product> result;
        result = webTargetProduct
                .path(java.text.MessageFormat.format("category/{0}", new Object[]{idCategory}))
                .queryParam("idCategory", idCategory)
                .request(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Product>>() {
                });
        client.close();
        return result;
    }

    public List<Product> searchByProduct(String column, String word) throws NoResultException {
        WebTarget webTargetProduct = webTarget.path("product");
        List<Product> result;
        result = webTargetProduct
                .path(java.text.MessageFormat.format("search/{0}/{1}", new Object[]{column, word}))
                .queryParam("column", column)
                .queryParam("word", word)
                .request(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Product>>() {
                });
        client.close();
        return result;
    }

    public Product findProductById(Long id) throws NoResultException {
        WebTarget webTargetProduct = webTarget.path("product");
        Product result;
        result = webTargetProduct
                .path(java.text.MessageFormat.format("{0}", new Object[]{id}))
                .queryParam("id", id)
                .request(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .get(Product.class);
        client.close();
        return result;
    }

    public Product findProductByDesignation(String brand, String model, String version) throws NoResultException {
        WebTarget webTargetProduct = webTarget.path("product");
        Product result;
        result = webTargetProduct
                .path(java.text.MessageFormat.format("findDesignation/{0}/{1}/{2}", new Object[]{brand, model, version}))
                .queryParam("brand", brand)
                .queryParam("model", model)
                .queryParam("version", version)
                .request(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .get(Product.class);
        client.close();
        return result;
    }

    public List<Category> findAllCategory() throws NoResultException {
        WebTarget webTargetCategory = webTarget.path("category");
        List<Category> result;
        result = webTargetCategory
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Category>>() {
                });
        client.close();
        return result;
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
