package cr.ac.ucr.proyecto_veterinaria.domain;

import java.sql.Blob;
import java.util.LinkedList;

/*  @author Luis Leiton
    Objeto cliente.
    Extiende del usuario y cuenta con la lista de registros de mascota.
*/
public class Client extends User{

     private LinkedList<Register> animals;

    public Client(int id, String name, String surname, String password,String mail, String phone, String address, Blob picture) {
        super(id, name, surname, password, mail, phone, address, picture);
        this.animals = new LinkedList<>();
    }

    public LinkedList<Register> getAnimals() {
        return animals;
    }

    public void setAnimals(LinkedList<Register> animals) {
        this.animals = animals;
    }
     
}