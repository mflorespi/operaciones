
package Ejercicio3;

import java.util.Scanner;

public class OperacionServicio {
    
    public void crearOperacion(Operacion operacion) {
        Scanner scan = new Scanner (System.in); 
        System.out.println("Ingrese el primer número.");
        operacion.setnumero1(scan.nextDouble()); 
        System.out.println("Ingrese el segundo número.");
        operacion.setnumero2(scan.nextDouble()); 
    }
    
    
    public void sumar (Operacion operacion){
        double suma = operacion.getnumero1() + operacion.getnumero2();
        System.out.println("La suma de los números es: " + suma);
    }
    
    
    public void restar (Operacion operacion){
        double resta =  operacion.getnumero1() - operacion.getnumero2();
        System.out.println("La resta de los números es: " + resta);
    }
    
    
    public void multiplicar (Operacion operacion){      
        double multiplicacion = 0;
                            
        if (multiplicacion == 0) {
            
            System.out.println("La multiplicación de los números es: " + multiplicacion + " Por favor ingrese un número distinto de cero.");
        
        } else {
                
            System.out.println("La multiplicación de los números es: " + operacion.getnumero1() * operacion.getnumero2());
        
        }
    }
    
    public void dividir (Operacion operacion){
       double division = 0;
        
         if (operacion.getnumero1() == 0 ||operacion.getnumero2() == 0) {
             
            System.out.println("La división de los números es: " + division + " Por favor ingrese un número distinto de cero.");
        
         } else {
                    
            System.out.println("La división de los números es: " + operacion.getnumero1() / operacion.getnumero2());
    }
}

}