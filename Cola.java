/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

/**
 *
 * @author tusk
 */
package cola;

/**
 *
 * @author jeycoff
 */
public class ColaPP {
    
    private int NodoPprimero;
    private int NodoPultimo;
    private int NodoPactual;
    private int tam = 0;
    private int NodoP;
    
    public void crearCola(){
        
    this.NodoPprimero = null;
    this.NodoPultimo = null;
}
    
    public void hacerCola (Persona dato){
        this.NodoP n = new NodoP ();
        n.setPer(dato);
        if((this.NodoPprimero==null)&&(this.NodoPultimo== null)){
            this.NodoPprimero = n;
            this.NodoPultimo = n;
        }
        else{
            this.ultimo.setSiguiente(n);
            this.ultimo = n;
        }
    }
    
    public void atender(){
        this.NodoPprimero = this.NodoPprimero.getSiguiente();
    }
    
    public void listar(){
        this.NodoPactual = this.NodoPprimero;
        while(this.NodoPactual!=null){
            System.out.print("  " + this.NodoPactual.getPer().getNombre() + "  ");
            this.NodoPactual = this.NodoPactual.getSiguiente();
        }
        System.out.println("");
    }

    /**
     * @return the tam
     */
    public int getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(int tam) {
        this.tam = tam;
    }

  
    }
    
