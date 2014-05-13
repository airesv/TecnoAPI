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
import pt.uc.aor.webservice.api.SOAPService;

/**
 *
 * @author Elsa
 */
public class SOAP implements APInterface {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SOAPService/SOAP.wsdl")
    private SOAPService service;

    public SOAP() {
    }

    public List<Product> findAllProducts() {
        pt.uc.aor.webservice.api.SOAPService service = new pt.uc.aor.webservice.api.SOAPService();
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        return ProductConverter.converterProductorList(port.findAllProducts());
    }

    public List<Product> findProductByCategory(java.lang.Long arg0) {
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        return ProductConverter.converterProductorList(port.findProductByCategory(arg0));
    }

    public Product findProductByDesignation(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        return ProductConverter.converterProduct(port.findProductByDesignation(arg0, arg1, arg2));
    }

    public Product findProductById(java.lang.Long arg0) {
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        return ProductConverter.converterProduct(port.findProductById(arg0));
    }

    public List<Product> searchByProduct(java.lang.String arg0, java.lang.String arg1) {
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        return ProductConverter.converterProductorList(port.searchByProduct(arg0, arg1));
    }

    public List<Category> findAllCategory() {
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        return CategoryConverter.converterCategoryList(port.findAllCategory());
    }

    public void addProductSell(long arg0, long arg1, java.lang.String arg2, int arg3) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        port.addProductSell(arg0, arg1, arg2, arg3);
    }

    public java.util.List<pt.uc.aor.webservice.api.SellProduct> detailBySell(java.lang.Long arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        return port.detailBySell(arg0);
    }

    public java.util.List<pt.uc.aor.webservice.api.SellProduct> detailSell(java.lang.Long arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        return port.detailSell(arg0);
    }

    public void editProductSell(long arg0, long arg1, java.lang.String arg2, int arg3) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        port.editProductSell(arg0, arg1, arg2, arg3);
    }

    public void makeSell(pt.uc.aor.webservice.api.MakeSell.Arg0 arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        port.makeSell(arg0, arg1);
    }

    public void removeProductSell(long arg0, long arg1, java.lang.String arg2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        port.removeProductSell(arg0, arg1, arg2);
    }

    public void removeSell(long arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        port.removeSell(arg0, arg1);
    }

    public java.util.List<pt.uc.aor.webservice.api.Sell> sellsByUser(java.lang.Long arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        pt.uc.aor.webservice.api.SOAP port = service.getSOAPPort();
        return port.sellsByUser(arg0);
    }

    @Override
    public void makeSell(HashMap<Integer, Integer> hashmap, String apkKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
