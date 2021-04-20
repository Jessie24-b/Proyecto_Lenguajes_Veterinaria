/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.ucr.proyecto_veterinaria.domain;

import java.util.Date;

/**
 * 
 * @author Jennifer Granados Martinez B83547
 */
public class Veterinary_products extends Product{
    
    private Date expiration_date;

    public Veterinary_products(Date expiration_date, String code, String name, int price, String description, String type_animal) {
        super(code, name, price, description, type_animal);
        this.expiration_date = expiration_date;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

}
