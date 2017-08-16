/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

/**
 * @author jerycoff
 */
public class Ciclos {
    public void ciclo1(){
        System.out.println("este es un contador que va desde 0 a 100:");
        
      
for(int i=0;i<=100;i++)// ciclo de 0 a 100
        {
        System.out.println(i);//muestra los numeros de 0 a 100
        }
    
    }
    public void ciclo2(){
        System.out.println("este es un contador que va desde 100 a 0");
        for(int j=100;j>=0;j--)// ciclo de 100 a 0
        {
        System.out.println(j);// muestra los numeros de 100 a 0
        }
    }
    public void ciclo3(){
        System.out.println("este programa realiza la tabla de multiplicar del numero escogido por el usuario");
         Scanner teclado = new Scanner (System.in);
        int x;//declaracion de variables
          int num;//declaracion de variables
          System.out.println("ingrese un numero");//
          num = teclado.nextInt();//solicitar un numero por teclado
          for(x=1;x<=10;x++){        //ciclo for que hace un contador de 1 a 10           
    
          System.out.print(num);//muestra el mismo numero con la operacion de multiplicacion del contador
          System.out.print("*");
          System.out.print(x);
          System.out.print("=");
          System.out.println(num*x);
          }
    }
    public void ciclo4(){
        System.out.println("este programa indica el factorial de un numero");
        Scanner teclado = new Scanner (System.in);
        int num,num2; // declaracion de variables
          System.out.println("introduce un numero ");// solicita al usuario un numero
          num = teclado.nextInt(); // ingresa el numero por teclado
          num2=num; // verifica si en caso tal el numero sea 1 el factorial es el mismo numero
          while(num2!=1){ // ciclo para sacar el factorial
              num2=num2-1; 
              num=num*num2;
          }
          System.out.println("el factorial es ");// muestra el resultado del factorial
          System.out.println(num);
    }
}
