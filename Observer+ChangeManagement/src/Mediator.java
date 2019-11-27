
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
public class Mediator extends Observable implements Observer {
    private float agua;
    private float humedad;
    private Plantas planta;
    
    public Mediator(){}
    
    public Mediator(Observable obs) {
        obs.addObserver(this);
    }
    
    public void mediar(){
        
    }
    

    @Override
    public void update(Observable obs, Object o1) {
        if (obs instanceof Maceta) {
           Maceta maceta = (Maceta)obs;
           planta=maceta.getPlanta();
           agua=maceta.getAgua();
           humedad=maceta.getHumedad();
            System.out.println("Hasta aquí jala"+planta+agua+humedad+planta.getHumedad());
            //Hasta aquí jala ORQ 60.0 20.0 50
           if(humedad < planta.getHumedad()){
               Mediator mediador = new Mediator();
               Regar regar = new Regar(mediador);
               Cambios();
           }
        }
    }
    
    public void Cambios() {
        setChanged();
        notifyObservers();
        System.out.println("\njala");
    }
}
