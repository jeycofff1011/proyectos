/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author tusk
 */
public class NodoSimple {
    private int Dato;
    private NodoSimple siguiente;
    
    public void NodoSimple(){
        this.Dato=0;
        this.siguiente=null;
        
    }
public int getDato(){
    return Dato;
}    
public int setDato(int Dato){
    this.Dato=Dato;
        return 0;
}
public NodoSimple getSiguiente(){
    return siguiente;
}
public void setsiguiente (NodoSimple siguiente){
    this.siguiente=siguiente;
}

}
