import java.util.Observable;
import java.util.Observer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Carlos
 */
public class Regar implements Observer {
    private float agua = 30;
    private float humedad = 0;

    public Regar(Observable obs) {
        obs.addObserver(this);
    }
    

    @Override
    public void update(Observable obs, Object o1) {
        if (obs instanceof Mediator) {
           Mediator mediador = (Mediator)obs;
            riega();
        }
    }
    
    public void riega(){
        //Manda comando a un pic o parecido para activar el riego
        System.out.println("La planta se regó... :p");
    }
    
}
