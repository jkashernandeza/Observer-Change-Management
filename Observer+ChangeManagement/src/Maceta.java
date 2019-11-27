
import java.util.Observable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Carlos
 */
public class Maceta extends Observable {
    private float agua;
    private float humedad;
    private Plantas planta;
    
    public Maceta(){}
    
    public void setParametros(float agua, float humedad, Plantas planta) {
        this.agua = agua;
        this.humedad = humedad;
        this.planta = planta;
        Cambios();
    }
    
    public void Cambios() {
        setChanged();
        notifyObservers();
    }

    public float getAgua() {
        return agua;
    }

    public float getHumedad() {
        return humedad;
    }

    public Plantas getPlanta() {
        return planta;
    }
    
    
}
