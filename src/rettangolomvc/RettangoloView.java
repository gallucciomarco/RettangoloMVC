package rettangolomvc;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marco
 */

//classe view
public class RettangoloView {
    
    //metodo mostra dati
    public void mostraDati(double base, double altezza){
        JOptionPane.showMessageDialog(null, "Base: "+base+"\nAltezza: "+altezza);
    }
    
    //metodo mostra perimetro
    public void mostraPerimetro(double perimetro){
        JOptionPane.showMessageDialog(null, "Perimetro: "+perimetro);
    }
    
    //metodo mostra area
    public void mostraArea(double area){
        JOptionPane.showMessageDialog(null, "Area: "+area);
    }
    
}
