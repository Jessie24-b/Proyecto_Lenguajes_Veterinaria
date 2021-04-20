package cr.ac.ucr.proyecto_veterinaria.domain;

import java.sql.Blob;
import java.util.LinkedList;

/*  @author Luis Leiton
    Objeto cliente.
    Extiende del usuario y cuenta con la lista de registros de mascota.
 */
public class Client extends User {

    private LinkedList<Register> animals;
    private String cardNumber;

    public Client(int id, String name, String lastName, String surname,
            String password, String mail, String phone, String address, Blob picture, String cardNumber) {
        super(id, name, lastName, surname, password, mail, phone, address, picture);
        this.animals = new LinkedList<>();
        this.cardNumber = cardNumber;
    }

    public LinkedList<Register> getAnimals() {
        return animals;
    }

    public void setAnimals(LinkedList<Register> animals) {
        this.animals = animals;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
