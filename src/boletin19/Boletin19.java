/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int salir = 0;
        Utils util = new Utils();
        Buzon buzon = new Buzon();
        // Para poder probar el porgrama agregamos una serie de correos
        buzon.agregarpruebas();
        // Fin de agregar correos de prueba
        util.imprime("Bienvenido al buzon del correo electronico\n  Quieres ver el numero de correos? (Opcion 1)\n  Quieres añadir un correo? (Opcion 2)\n  Quieres ver cuantos correos quedan por leer? (Opcion 3)\n  Quieres leer el primero correo no leido? (Opcion 4)\n  Quieres ver un correo en concreto? (Opcion 5)\n  Quieres eliminar un correo? (Opcion 6)\n  Quieres salir del correo? (Opcion 0)");
        do {
        util.imprime("Elige tu opcion");
        Scanner OpcionTeclado = new Scanner(System.in);
        int Opcion = OpcionTeclado.nextInt();
        switch (Opcion){
            case 1:
                buzon.numeroDeCorreos();
                break;
            case 2:
                util.imprime("Introduce el texto del correo electronico");
                Scanner correoETeclado = new Scanner(System.in);
                String correoE = correoETeclado.nextLine();
                buzon.agregar(correoE, 1);
                // No leido = 1 || Leido = 0
                break;
            case 3:
                buzon.porLeer();
                break;
            case 4:
                buzon.primeroNoLeido();
                break;
            case 5:
                util.imprime("Que numero de correo quieres ver?");
                Scanner ncorreoTeclado = new Scanner(System.in);
                int ncorreo = ncorreoTeclado.nextInt();
                buzon.leer(ncorreo);
                break;
            case 6:
                util.imprime("Que numero de correo quieres eliminar?");
                Scanner ecorreoTeclado = new Scanner(System.in);
                int ecorreo = ecorreoTeclado.nextInt();
                buzon.eliminar(ecorreo);
                break;
            case 0:
                util.imprime("Gracias por ver el correo\nAdios!");
                salir = 1;
                break;
            default:     
                util.imprime("Opcion incorrecta, vuelve a probar gracias");
                break;    
                
            
        } } while (salir==0);
    }
    
}
