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
    
    
    public RettangoloControl() {
    }
    
    public RettangoloControl(RettangoloModel model, RettangoloView view) {
        this.model = model;
        this.view = view;
    }
    
    
   
    
    
}
