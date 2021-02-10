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
public class RettangoloMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        RettangoloModel model = new RettangoloModel(10, 13);
        RettangoloView view = new RettangoloView();
        
        RettangoloControl control = new RettangoloControl(model, view);
        
        control.aggiornaDati(model.getBase(), model.getAltezza());
        control.aggiornaPerimetro(model.calcolaPerimetro());
        control.aggiornaArea(model.calcolaArea());
        
        
    }
    
}
