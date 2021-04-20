/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.proyecto_veterinaria.domain;

import java.sql.Blob;

/**
 *
 * @author Jennifer Granados Martinez B83547
 */
public class Employee extends User{

    private String carnet;
    private String type;

    public Employee(int id, String name, String lastName, String surname,
            String password, String mail, String phone, String address, Blob picture,String carnet, String type) {
                super(id, name, lastName, surname, password, mail, phone, address, picture);
        this.carnet = carnet;
        this.type = type;
    }
    
    public Employee(int id, String name, String lastName, String surname,
            String password, String mail, String phone, String address,String carnet, String type) {
                super(id, name, lastName, surname, password, mail, phone, address);
        this.carnet = carnet;
        this.type = type;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" + "carnet=" + carnet + ", type=" + type + '}';
    }

}
