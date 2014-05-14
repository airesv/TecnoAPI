/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uc.dei.proj7.api;

import java.util.HashMap;
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
import objetEntities.Sell;
import objetEntities.SellProduct;

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
    public List<Product> findAllProducts() throws NoResultException, ClientErrorException {
        WebTarget webTargetProduct = webTarget.path("product");
        List<Product> result;
        result = webTargetProduct
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Product>>() {
                });
        client.close();
        return result;
    }

    public List<Product> findAllProductsREST(String column, String word) throws NoResultException, ClientErrorException {
        WebTarget webTargetProduct = webTarget.path("product");
        List<Product> result;
        result = webTargetProduct
                .request(MediaType.APPLICATION_JSON)
                .header("column", column)
                .header("word", word)
                .get(new GenericType<List<Product>>() {
                });
        client.close();
        return result;
    }

    public List<Product> findProductByCategory(Long idCategory) throws NoResultException, ClientErrorException {
        WebTarget webTargetProduct = webTarget.path("product");
        List<Product> result;
        result = webTargetProduct
                //                .path(java.text.MessageFormat.format("category/{0}", new Object[]{idCategory}))
                .request(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .header("idCategory", idCategory)
                .get(new GenericType<List<Product>>() {
                });
        client.close();
        return result;
    }

    public Product findProductById(Long id) throws NoResultException, ClientErrorException {
        WebTarget webTargetProduct = webTarget.path("product");
        Product result;
        result = webTargetProduct
                .path(java.text.MessageFormat.format("{0}", new Object[]{id}))
                .request(javax.ws.rs.core.MediaType.APPLICATION_JSON)
                .get(Product.class);
        client.close();
        return result;
    }

    public List<Category> findAllCategory() throws NoResultException, ClientErrorException {
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
    public void createSell(Object requestEntity) throws ClientErrorException {
//        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void removeSell(String idSell) throws ClientErrorException {
        webTarget.path("sell")
                .path(java.text.MessageFormat.format("{0}", new Object[]{idSell}))
                .request()
                .delete();
        client.close();
    }

    public <T> T sellsByUser(Class<T> responseType, String idUser) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("sellsUser/{0}", new Object[]{idUser}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T detailBySell(Class<T> responseType, String idSell) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{idSell}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

//Métodos da entidade SellProduct:
    public void addProductSell(long idProduct, long idSell, String apkKey, int quantity) {
        addProductSell(idProduct, idSell, apkKey, quantity);
    }

    public void editProductSell(long idProduct, long idSell, String apkKey, int quantity) {
        editProductSell(idProduct, idSell, apkKey, quantity);
    }

    public void removeProductSell(long idProduct, long idSell, String apkKey) {
        removeProductSell(idProduct, idSell, apkKey);
    }

    public List<SellProduct> detailSell(String idSell) throws NoResultException {
        WebTarget webTargetSellProduct = webTarget.path("sellproduct");
        List<SellProduct> result;
        result = webTargetSellProduct
                .request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<SellProduct>>() {
                });
        client.close();
        return result;
    }

    @Override
    public void makeSell(HashMap<Integer, Integer> hashmap, String apkKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeSell(long id, String apkKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sell> sellsByUser(Long idUser) throws NoResultException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SellProduct> detailBySell(Long idSell) throws NoResultException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SellProduct> detailSell(Long idSell) throws NoResultException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product findProductByDesignation(String brand, String model, String version) throws NoResultException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
