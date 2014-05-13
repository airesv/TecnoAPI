/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uc.dei.proj7.api;

import java.util.ArrayList;
import java.util.List;
import objetEntities.Product;

/**
 *
 * @author Elsa
 */
public class ProductConverter {

    public ProductConverter() {
    }

    public static List<Product> converterProductorList(List<pt.uc.aor.webservice.api.Product> listProduct) {
        List<Product> listProductPOJO = new ArrayList<>();
        for (pt.uc.aor.webservice.api.Product product : listProduct) {
            Product p = new Product();
            p.setIdProduct(product.getIdProduct());
            p.setBrand(product.getBrand());
            p.setDescription(product.getDescription());
            p.setModel(product.getModel());
            p.setPrice(product.getPrice());
            p.setQuantity(product.getQuantity());
            p.setRepositiondate(product.getRepositiondate().toGregorianCalendar().getTime());
            p.setVersion(product.getVersion());
            p.setIdCategory(product.getIdCategory().getIdCategory());
            listProductPOJO.add(p);
        }
        return listProductPOJO;
    }

    public static Product converterProduct(pt.uc.aor.webservice.api.Product product) {
        Product p = new Product();
        p.setIdProduct(product.getIdProduct());
        p.setBrand(product.getBrand());
        p.setDescription(product.getDescription());
        p.setModel(product.getModel());
        p.setPrice(product.getPrice());
        p.setQuantity(product.getQuantity());
        p.setRepositiondate(product.getRepositiondate().toGregorianCalendar().getTime());
        p.setVersion(product.getVersion());
        p.setIdCategory(product.getIdCategory().getIdCategory());
        return p;
    }

}
