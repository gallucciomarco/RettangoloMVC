/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rettangolomvc;

/**
 *
 * @author Marco
 */

//classe model
public class RettangoloModel {
    
    //attributi privati
    private double base;
    private double altezza;

    //costruttore vuoto
    public RettangoloModel() {
    }

    //costruttore con parametri
    public RettangoloModel(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    //getter base
    public double getBase() {
        return base;
    }

    //setter base
    public void setBase(double base) {
        this.base = base;
    }

    //getter altezza
    public double getAltezza() {
        return altezza;
    }

    //setter altezza
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    
    //metodo calcola perimetro
    public double calcolaPerimetro(){
        double perimetro = (base + altezza) * 2;
        return perimetro; 
    }
    
    //metodo calcola area
    public double calcolaArea(){
        double area = base * altezza;
        return area;
    }
}
