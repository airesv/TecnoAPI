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
public class SellDTO {

    private Long idSell;
    private String delivery;
    private String apiKey;

    public SellDTO() {
    }

    /**
     * @return the idSell
     */
    public Long getIdSell() {
        return idSell;
    }

    /**
     * @param idSell the idSell to set
     */
    public void setIdSell(Long idSell) {
        this.idSell = idSell;
    }

    /**
     * @return the apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @param apiKey the apiKey to set
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return the delivery
     */
    public String getDelivery() {
        return delivery;
    }

    /**
     * @param delivery the delivery to set
     */
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

}
