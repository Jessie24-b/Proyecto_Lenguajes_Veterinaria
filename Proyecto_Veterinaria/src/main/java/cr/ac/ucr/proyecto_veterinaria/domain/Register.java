package cr.ac.ucr.proyecto_veterinaria.domain;
import java.util.LinkedList;

/*  @author Luis Leiton
    Este es el objeto expediente. 
    Cuenta con el animal y su lista de servicios recibidos.  
*/

public class Register {
    private Animal animal;
    private int id;
    private LinkedList<ReceivedService> services;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<ReceivedService> getServices() {
        return services;
    }

    public void setServices(LinkedList<ReceivedService> services) {
        this.services = services;
    }
    
}