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

//classe control
public class RettangoloControl {
    
    //implemento model e view
    RettangoloModel model;
    RettangoloView view;
    
    
    public RettangoloControl(RettangoloModel model, RettangoloView view) {
        this.model = model;
        this.view = view;
    }
    
    public double getBase() {
        return model.getBase();
    }

    public void setBase(double base) {
        model.setBase(base);
    }

    public double getAltezza() {
        return model.getAltezza();
    }

    public void setAltezza(double altezza) {
        model.setAltezza(altezza);
    }
    
    public double calcolaPerimetro(){
        return model.calcolaPerimetro();
    }
    
    public double calcolaArea(){
        return model.calcolaArea();
    }
    
    
    public void aggiornaDati(double base, double altezza){
        view.mostraDati(base, altezza);;
    }
    
    public void aggiornaPerimetro(double perimetro){
        view.mostraPerimetro(perimetro);
    }
    
    public void aggiornaArea(double area){
        view.mostraArea(area);
    }
}
