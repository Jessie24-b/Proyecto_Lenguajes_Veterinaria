/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.ucr.proyecto_veterinaria.domain;

/**
 * 
 * @author Jennifer Granados Martinez B83547
 */
public class Aliment extends Product{
    
    private String brand;

    public Aliment(String brand, String code, String name, int price, String description, String type_animal) {
        super(code, name, price, description, type_animal);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}
