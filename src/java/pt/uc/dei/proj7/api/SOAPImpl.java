/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uc.dei.proj7.api;

import java.util.HashMap;
import java.util.List;
import javax.xml.ws.WebServiceRef;
import objetEntities.Category;
import objetEntities.Product;
import objetEntities.Sell;
import objetEntities.SellProduct;
import pt.uc.aor.webservice.api.SOAP;
import pt.uc.aor.webservice.api.SOAPService;

/**
 *
 * @author Elsa
 */
public class SOAPImpl implements APInterface {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SOAPService/SOAP.wsdl")
    private SOAPService service;
    private SOAP port;

    public SOAPImpl() {
        service = new SOAPService();
        port = service.getSOAPPort();
    }

    /**
     * Procura todos os Produtos da Aplicacao
     *
     * @return Lista de produtos
     */
    @Override
    public List<Product> findAllProducts() {
        return ProductConverter.converterProductorList(port.findAllProducts());
    }

    /**
     * Procura todos os Produtos da Aplicacao de uma determinda categoria
     *
     * @param arg0 Long, correspone à Pk da Caterogira
     * @return
     */
    @Override
    public List<Product> findProductByCategory(java.lang.Long arg0) {
        return ProductConverter.converterProductorList(port.findProductByCategory(arg0));
    }

    @Override
    public Product findProductByDesignation(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return ProductConverter.converterProduct(port.findProductByDesignation(arg0, arg1, arg2));
    }

    @Override
    public Product findProductById(java.lang.Long arg0) {
        return ProductConverter.converterProduct(port.findProductById(arg0));
    }

    public List<Product> searchByProduct(java.lang.String arg0, java.lang.String arg1) {
        return ProductConverter.converterProductorList(port.searchByProduct(arg0, arg1));
    }

    @Override
    public List<Category> findAllCategory() {
        return CategoryConverter.converterCategoryList(port.findAllCategory());
    }

    public void addProductSell(long arg0, long arg1, java.lang.String arg2, int arg3) {
        port.addProductSell(arg0, arg1, arg2, arg3);
    }

    public List<SellProduct> detailBySell(java.lang.Long arg0) {
        return SellProductConverter.converterSellProductList(port.detailBySell(arg0));
    }

    public List<SellProduct> detailSell(java.lang.Long arg0) {
        return SellProductConverter.converterSellProductList(port.detailSell(arg0));
    }

    public void editProductSell(long arg0, long arg1, java.lang.String arg2, int arg3) {
        port.editProductSell(arg0, arg1, arg2, arg3);
    }

    public void makeSell(pt.uc.aor.webservice.api.MakeSell.Arg0 arg0, java.lang.String arg1) {
        port.makeSell(arg0, arg1);
    }

    public void removeProductSell(long arg0, long arg1, java.lang.String arg2) {
        port.removeProductSell(arg0, arg1, arg2);
    }

    public void removeSell(long arg0, java.lang.String arg1) {
        port.removeSell(arg0, arg1);
    }

    public List<Sell> sellsByUser(java.lang.Long arg0) {
        return SellConverter.converterSellList(port.sellsByUser(arg0));
    }

    @Override
    public void makeSell(HashMap<Integer, Integer> hashmap, String apkKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
