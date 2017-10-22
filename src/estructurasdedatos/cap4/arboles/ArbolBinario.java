/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estarbol;

import java.awt.BorderLayout;

/**
 *
 * @author jeycoff
 */
public class ArbolBinario {
    
    private NodoArbol raiz;
    
    

    public void insertar (NodoArbol subArbol, NodoArbol nuevoNodo){
        if(subArbol == null){
            subArbol = nuevoNodo;
        }
        else{
            if(subArbol.getDato()>nuevoNodo.getDato()){
                this.insertar(subArbol.gethIzquierdo(), nuevoNodo);
            }
            else{
                this.insertar(subArbol.gethDerecho(), nuevoNodo);
            }
        }
    }
        
    public void buscar(NodoArbol subarbol, int valor){
        boolean b = false;
         if(subarbol!=null){
             if(valor == subarbol.getDato()){
                 b = true;
             }
             buscar(subarbol.gethIzquierdo(), valor);
             buscar(subarbol.gethDerecho(),valor);
         }
         if(b==false){
             System.out.println("El dato no se ecuentra en el Ã¡rbol");   
         }
         else{
             System.out.println("El dato existe en el Ã¡rbol");
         }
    }
    
    public void listarPre(NodoArbol n){
        if(n!=null){
            System.out.println(n.getDato());
            listarPre(n.gethIzquierdo());
            listarPre(n.gethDerecho());
        }
    }
    
    public void listarIn(NodoArbol n){
        if(n!=null){
            listarIn(n.gethIzquierdo());
            System.out.println(n.getDato());
            listarIn(n.gethDerecho());
        }
    }
    
    public void listarPos(NodoArbol n){
        if(n!=null){
            listarPos(n.gethIzquierdo());
            listarPos(n.gethDerecho());
            System.out.println(n.getDato());
        }
    }
    
    

    /**
     * @return the raiz
     */
    public NodoArbol getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }   
    
    
    
}



