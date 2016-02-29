/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;

/**
 *
 * @author MotherFoquita
 */
public class Buzon {
    ArrayList<Correo> buzon = new ArrayList<>();
    Utils util = new Utils();
      
    public void numeroDeCorreos(){
       util.imprime("El numero de correos almacenados es: " +buzon.size());
    }
    
    public void agregar(String correo, int leido){
        buzon.add(new Correo(correo, leido));
    }
    
    public void porLeer(){
        int pleer=0;
        for (int i=0;i<buzon.size();i++){
            if (buzon.get(i).leido == 1){
            pleer++;    
            }
        }
        util.imprime("El numero de correos por leer son: "+pleer); 
    }
    
    public void primeroNoLeido(){
        for (int i=0;i<buzon.size();i++){
            if (buzon.get(i).leido == 1){
            util.imprime("El primer correo no leido es: \n "+buzon.get(i).correo);
            buzon.set(i, new Correo(buzon.get(i).correo,0));
            break;
            }
        }
    }
    
    public void leer(int id){
        try {
        util.imprime("El correo numero "+id +" es :\n"+buzon.get(id).correo);
        if (buzon.get(id).leido == 1){
        buzon.set(id, new Correo(buzon.get(id).correo,0));   
        }
        }
        catch (Exception error2){
            util.imprime("No se ha podido leer ese correo o no existe");
        }
    }
    
    public void eliminar(int id){
        try {
        buzon.remove(id);
        System.out.println("El correo numero "+id+" ha sido eliminado");
        } 
        catch (Exception error1) {
            util.imprime("No se ha podido borrar ese registro o no existe");
        }
    }

    void agregarpruebas() {
        agregar("Este es el primer correo", 1);
        agregar("Este es el segundo correo", 1);
        agregar("Este es el tercer correo", 1);
        agregar("Este es el cuarto correo", 1);
        agregar("Este es el quinto correo", 1);
        agregar("Este es el sexto correo", 1);
    }
}