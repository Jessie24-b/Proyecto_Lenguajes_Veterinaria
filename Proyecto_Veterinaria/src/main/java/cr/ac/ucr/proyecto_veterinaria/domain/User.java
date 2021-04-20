package cr.ac.ucr.proyecto_veterinaria.domain;

import java.sql.Blob;

/*  @author Luis Leiton
 */
public class User {

    private int id;
    private String name;
    private String lastName;
    private String surname;
    private String mail;
    private String phone;
    private String address;
    private Blob picture;
    private String password;

    public User(int id, String name, String lastName, String surname, String password, String mail, String phone, String address, Blob picture) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
        this.password = password;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
        this.picture = picture;
    }
    
      public User(int id, String name, String lastName, String surname, String password, String mail, 
              String phone, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
        this.password = password;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", surname=" + surname + ", mail=" + mail + ", phone=" + phone + ", address=" + address + ", picture=" + picture + ", password=" + password + '}';
    }
    
    

}
