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
public class Usuario implements Observer{

    public Usuario(Observable obs) {
        obs.addObserver(this);
    }
    

    @Override
    public void update(Observable obs, Object o1) {
       if (obs instanceof Mediator) {
            Mediator maceta = (Mediator)obs;
            notifica();
        }
    }
    
    public void notifica(){
        //Manda comando que notifique cambio de agua
        System.out.println("Tu planta necesita más agua... :p");
    }
    
}
