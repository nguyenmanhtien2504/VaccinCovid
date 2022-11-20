/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Vaccin {
    private int id;
    private int mavaccin;
    private String vaccin;
    private String price;

    public Vaccin() {
    }


    
    public Vaccin(int id, int mavaccin, String vaccin) {
        this.id = id;
        this.mavaccin = mavaccin;
        this.vaccin = vaccin;
    }
    public Vaccin(int mavaccin, String vaccin, String price) {
        this.mavaccin = mavaccin;
        this.vaccin = vaccin;
        this.price = price;
    }
    
    public Vaccin(int mavaccin, String vaccin) {
        this.mavaccin = mavaccin;
        this.vaccin = vaccin;
    }
    
    
    public int getMavaccin() {
        return mavaccin;
    }

    public void setMavaccin(int mavaccin) {
        this.mavaccin = mavaccin;
    }

    public String getVaccin() {
        return vaccin;
    }

    public void setVaccin(String vaccin) {
        this.vaccin = vaccin;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vaccin{" + "id=" + id + ", mavaccin=" + mavaccin + ", vaccin=" + vaccin + ", price=" + price + '}';
    }

    
    
}
