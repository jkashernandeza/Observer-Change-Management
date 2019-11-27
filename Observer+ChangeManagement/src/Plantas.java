/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Carlos
 */
public enum Plantas {
    HEL("Helecho", 30),
    ROS("Rosal", 40),
    ORQ("Orquídea", 50),
    OTRA("", 0);
    private String nombre;
    private int humedad;

    private Plantas(String nombre, int humedad) {
        this.nombre = nombre;
        this.humedad = humedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setNombre(String nombre) {
        if(this.nombre==""){
            this.nombre = nombre;
        }else{System.out.println("Selección invalida");}
    }

    public void setHumedad(int humedad) {
        if(this.nombre==""){
            this.humedad = humedad;
        }else{System.out.println("Selección invalida");}
    }   
}

