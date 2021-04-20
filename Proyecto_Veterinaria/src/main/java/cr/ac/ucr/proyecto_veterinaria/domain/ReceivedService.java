
package cr.ac.ucr.proyecto_veterinaria.domain;

import java.sql.Date;

/*  @author Luis Leiton
    Esta es la clase de servicio recibido
    Se guardara en los registros de la mascota.
 */
public class ReceivedService {
    private String id;
    private Date date;
    private String description;
    private int price;

    public ReceivedService(String id, Date date, String description, int price) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
