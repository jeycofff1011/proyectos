/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

import java.util.Scanner;

/**
 
 * @author jeycoff
 */
public class Matriz {
    private int tfila;
    private int tcolumna;
    private int Matriz[][];
    //private Integer Matriz1[][];
    
    public Matriz(int nfila, int ncolumna){
       this.tfila=nfila;
       this.tcolumna=ncolumna;
       this.Matriz=new int [nfila][ncolumna];
}
public void insertar (int t, int c,int dato, int nfila, int ncolumna){
if (nfila<tfila&&ncolumna<tcolumna) {
    this.Matriz[t][c]=dato;
}
else {System.out.println ("dato ingresado correctamente");
    }
  }
 
public void listar(){
    for (int i=0;i<=tfila;i++){
        for (int k=0;k<=tcolumna;k++){
            System.out.print (this.Matriz[i][k]);
        }
    }
 
    }
public int buscar(int nfila, int ncolumna,int dato){
    if (nfila<=tfila&&ncolumna<=tcolumna){
        return (dato);
    }
    else{System.out.print("numero errado");
}
   return 0;     
}
public void actualizar(int nfila, int ncolumna,int newdato){
    if (nfila<=tfila&&ncolumna<=tcolumna)
        this.Matriz[nfila][ncolumna]=newdato;
}
     
public void borrar (int nfila,int ncolumna){
    if (nfila<=tfila&&ncolumna<=tcolumna){
    this.Matriz[nfila][ncolumna]=0;
 } else {System.out.print("numero invalido");}
}
}
