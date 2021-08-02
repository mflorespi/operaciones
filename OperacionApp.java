/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;


public class OperacionApp {

    public static void main(String[] args) {
        
       Operacion Operacion1 = new Operacion();
       
       OperacionServicio Operacion2 = new OperacionServicio();
       
       Operacion2.crearOperacion(Operacion1);
       
       Operacion2.sumar(Operacion1);
       
       Operacion2.restar(Operacion1);
       
       Operacion2.multiplicar(Operacion1);
       
       Operacion2.dividir(Operacion1);
    }
    
}