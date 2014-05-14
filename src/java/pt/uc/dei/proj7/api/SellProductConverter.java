/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uc.dei.proj7.api;

import java.util.ArrayList;
import java.util.List;
import objetEntities.SellProduct;

/**
 *
 * @author Elsa
 */
public class SellProductConverter {

    public SellProductConverter() {
    }

    public static List<SellProduct> converterSellProductList(List<pt.uc.aor.webservice.api.SellProduct> listSellProduct) {
        List<SellProduct> listSellProductPOJO = new ArrayList<>();
        for (pt.uc.aor.webservice.api.SellProduct sellproduct : listSellProduct) {
            SellProduct s = new SellProduct();
            s.setIdSellProduct(sellproduct.getIdSellProduct());
            s.setQuantity(sellproduct.getQuantity());
            s.setProduct(sellproduct.getProduct().getIdProduct());
            s.setSell(sellproduct.getSell().getIdOrder());
            listSellProductPOJO.add(s);
        }
        return listSellProductPOJO;
    }

}
