/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Carlos
 */
public class Main {
    public static void main(String arg[]){
        Maceta maceta = new Maceta();
        Plantas planta = Plantas.ORQ;
        
        Mediator mediador = new Mediator(maceta);
        
        /*Regar regar = new Regar(maceta);
        Usuario usuario = new Usuario(maceta);*/
        
        maceta.setParametros(60, 20, planta);
    }
    
}
