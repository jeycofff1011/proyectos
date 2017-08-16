/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

/**
 * @author tusk
 */
public class Condicionales {

    
    public void condicionales1(){
        for(int j=0;j<=100;j++)// ciclo de 0 a 100
    {
        if(j%2==0){// condicion del modudulo de j con 2 es 0 el numero es par
            System.out.print(j); //muestra el valor de los numeros cuando se cumple la condicion anterior
            System.out.println(" y es par");// leyenda que muestra que es par
        }
    }
}
    public void condicionales2(){
        for(int i=0;i<=100;i++) // declaro la variable para el ciclo de 0 a 100
    {
        if (i%2!=0){// creo la condicion si el numero en i es diferente al modulo de la div con 2 el resultado es impar
            System.out.print(i);//muestra en pantalla el valor de i
            System.out.println(" y es impar");//muestra la leyenda que es impar
    }
        
        
    }
    }
    public void condicionales3(){
        Scanner teclado = new Scanner (System.in);
        int a;
          int b;  // declaracion de variables
          int suma;
          
          System.out.println("ingrese el primer numero");// solicita al cliente ingresar el un numero por teclado
          a = teclado.nextInt();
          System.out.println ("ingrese el segundo numero");// solicita al usuario ingresar un numero por teclado
          b = teclado.nextInt();
          if(a>b){                                         // se hace la coparacion entre los dos numeros para determinar cual es mayor
              System.out.println("el numero mayor es ");  // da las respuestas de acuerdo la condicion
              System.out.println(a);
              
          } 
          else{
              System.out.println("el numero mayor es ");  // da las respuestas de acuerdo la condicion
              System.out.println(b);}
    }
    
    
    
    }

