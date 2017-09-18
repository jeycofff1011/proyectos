/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoSimple;

/**
 *
 * @author tusk
 */
public class ListaSimple {
    private NodoSimple inicio;
    private int size;
    public void Lista(){
    inicio=null;
    size=0;
}
    public int getsize(){
        return size;
    }
    public void addfin(int Dato){
        NodoSimple nuevo=new NodoSimple(){
            nuevo.setDato(Dato);
                        
            if (ListVac(){
                inicio=nuevo;
            
            } else{
            NodoSimple aux=inicio;
            while(aux.getSiguiente()!=null){
                aux=getSiguiente();
            }
            aux.setsiguiente(nuevo);
        }
            size++;
        }
                
public void agregarinicio (int Dato){
                    NodoSimple nuevo=new NodoSimple();
                    nuevo.setDato(Dato);
                    if (ListVac()){
                        inicio=nuevo;
                    }else{ nuevo.setsiguiente(inicio);
                    inicio=nuevo;
                    }
                    size++;
                    }
                
public void insertar(int Dato){
    NodoSimple nuevo=new NodoSimple();
    nuevo=setDato(Dato);
}
public void buscar(int buscador){
    NodoSimple aux=inicio;
    boolean ubicado=false;
    while(aux !=null && ubicado!= true){
        if (buscador == aux getDato()){
        ubicado=true;
    }
        else {aux = aux.getsiguiente();}
    
    }
    return (ubicado);
}
}
                
                
    }

