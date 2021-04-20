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
public class Product {
    
    private String code;
    private String name;
    private int price;
    private String description;
    private String type_animal;

    public Product(String code, String name, int price, String description, String type_animal) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.description = description;
        this.type_animal = type_animal;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType_animal() {
        return type_animal;
    }

    public void setType_animal(String type_animal) {
        this.type_animal = type_animal;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name=" + name + ", price=" + price + ", description=" + description + ", type_animal=" + type_animal + '}';
    }

}
