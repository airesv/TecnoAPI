/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uc.dei.proj7.api;

import java.util.ArrayList;
import java.util.List;
import objetEntities.Sell;

/**
 *
 * @author Elsa
 */
public class SellConverter {

    public SellConverter() {
    }

    public static List<Sell> converterSellList(List<pt.uc.aor.webservice.api.Sell> listSell) {
        List<Sell> listSellPOJO = new ArrayList<>();
        for (pt.uc.aor.webservice.api.Sell sell : listSell) {
            Sell s = new Sell();
            s.setIdSell(sell.getIdOrder());
            s.setActualdate(sell.getActualdate().toGregorianCalendar().getTime());
            s.setDelivery(sell.getDeliverydate().toGregorianCalendar().getTime());
            s.setIdClient(sell.getClientidClient().getIdClient());
            listSellPOJO.add(s);
        }
        return listSellPOJO;
    }

    public static Sell converterSell(pt.uc.aor.webservice.api.Sell sell) {
        Sell s = new Sell();
        s.setIdSell(sell.getIdOrder());
        s.setActualdate(sell.getActualdate().toGregorianCalendar().getTime());
        s.setDelivery(sell.getDeliverydate().toGregorianCalendar().getTime());
        s.setIdClient(sell.getClientidClient().getIdClient());
        return s;
    }
}
