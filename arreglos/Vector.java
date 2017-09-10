/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;
import java.util.Scanner;
/**
 *
 * @author tusk
 */
public class Vector {
    private int filas; // 
    private int Vector;
    private final int[] vector;
    
    public Vector (int nfilas){
        this.filas=nfilas;
        this.vector=new int [nfilas];
    }
    public void insert (int nfilas,int e,int dato){
        if (nfilas<=filas&&filas>0){
            this.vector[e]=dato;
        }
        else{System.out.print("campo errado");}
   }
    public void listar (){
        for(int i=0;i<=filas;i++){
            int e = 0;
            System.out.print(this.vector[e]);
        }
    }
    
    public int buscar (int nfilas){
        int contador;
        for (int i=0;i<nfilas;i++){
            for (int j=i;j<nfilas;j++){
                if(nfilas[i] < nfilas[j]){
                    contador=nfilas[i];
                    nfilas[i]=nfilas[j];
                    nfilas[j]=contdor:
                }
            }
        }
        
    }
    static boolean busqueda(int vector, int dato){
        for(int i=0;i<vector;i++){
            if (vector[i]==dato){
                return true;
            }
            
        return false;
}
    }
    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
