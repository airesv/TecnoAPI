/*
 * Acerta o Rumo, edicao 2013/14
 * Programação Avançada de Java.
 *
 *  Vitor Aires
 */
package objetEntities;

/**
 *
 * @author Aires
 */
public class Category {

    private Long idCategory;
    private String category;

    public Category() {
    }

    public Category(Long idCategory, String category) {
        this.idCategory = idCategory;
        this.category = category;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

}
