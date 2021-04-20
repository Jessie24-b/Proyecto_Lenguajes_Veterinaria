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
public class Clothes extends Product{
    
    private int size;
    private String color;
    private boolean availability;

    public Clothes(int size, String color, boolean availability, String code, String name, int price, String description, String type_animal) {
        super(code, name, price, description, type_animal);
        this.size = size;
        this.color = color;
        this.availability = availability;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Clothes{" + "size=" + size + ", color=" + color + ", availability=" + availability + '}';
    }

}
