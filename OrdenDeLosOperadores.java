
package com.mycompany.holamundo;
public class OrdenDeLosOperadores {
    public static void main(String[] args) {
    
        
        double resultado=3*4+5;
        System.out.println(resultado);
           //LOS OPERADORES ARITMETICOS SE EJECUTAN POR ORDEN PURAMENTE MATEMATICO
           //En el caso de arriba se resuelve primero la multiplicacio y luego la suma
           //Si queremos que se resuelva antes la suma usamos el `parentesis
           resultado=3*(4+5);
           System.out.println(resultado);
           //Prueba de operadores incremento y decremento
           int z=0;
           System.out.println("El valor de z antes de incrementar es:" + z);
           z++;
           //En este caso primero iguala y luego incrementa
           System.out.println("El valor despues de incrementar es: " + z);
           int otra=z;
           otra=++z;
           
           
           
        
        
        
        
        
        
    }
    
}
