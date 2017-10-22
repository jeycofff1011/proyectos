/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estarbol;

/**
 *
 * @author jeycoff
 */
public class EstArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        ArbolBinario a = new ArbolBinario();
        a.setRaiz(null);
        NodoArbol n = new NodoArbol();
        n.setDato(4);
        a.insertar(n, n);
        NodoArbol h = new NodoArbol();
        h.setDato(6);
        a.insertar(n, h);
        a.buscar(n, 4);
    }
    
}
