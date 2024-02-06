package com.mycompany.holamundo;
//PASO1: Importo la clase java.util
import java.util.Scanner;

public class SumaPideValores {
	
    public static void main(String[] args) {
        //Para solicitar datos a los usuarios por consola
        //necesitamso usar un Objeto (Sera una variable, por ahora) Scanner
        
        //PASO2:Declaro el Scanner
        Scanner datos=new Scanner(System.in);
        
         System.out.println ("Dame el primer sumando");
         //PASO3: declaro una variable y la inicializo
         //a lo que introduzca el usuario por consola
         
         int s1=datos.nextInt();
         System.out.println("s1=" + s1);
         
         System.out.println ("Dame el segundo sumando");
         
         int s2=datos.nextInt();
         System.out.println("s2=" + s2);
         int resultado=s1+s2;
                 
         System.out.println("El resultado es:" + resultado);
         
         //OPCION 1: cON VARIABLE RESDULTADO
        resultado=s1+s2;
        System.out.println("El avlor de la variable resultado es:" + resultado);
        
        //OPCION 2: Sin variable resultado
        
        System.out.println("El resultado de la suma es "+ s1+s2);
         
           
    }
}
