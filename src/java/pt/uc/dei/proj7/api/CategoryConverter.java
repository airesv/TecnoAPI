/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uc.dei.proj7.api;

import java.util.ArrayList;
import java.util.List;
import objetEntities.Category;

/**
 *
 * @author Elsa
 */
public class CategoryConverter {

    public CategoryConverter() {
    }

    public static List<Category> converterCategoryList(List<pt.uc.aor.webservice.api.Category> listCategory) {
        List<Category> listCategoryPOJO = new ArrayList<>();
        for (pt.uc.aor.webservice.api.Category category : listCategory) {
            Category c = new Category();
            c.setIdCategory(category.getIdCategory());
            c.setCategory(category.getCategory());
            listCategoryPOJO.add(c);
        }
        return listCategoryPOJO;
    }
}
