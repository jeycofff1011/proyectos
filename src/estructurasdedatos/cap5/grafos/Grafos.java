package grafos;

import java.util.List;

/**
 *
 * @author utp
 */
public class Grafos {

    List <Vertice> v1;
    List <Arco> arco;
   
public void insertarVertice (String Dato){
    Vertice nuevoVertice = new Vertice();
    nuevoVertice.setDato(Dato);
    this.v1.add(nuevoVertice);
    }
public void insertarArco(Vertice V1){
    Arco nuevoArco = new Arco();
    nuevoArco.setV1((Vertice) v1);
    nuevoArco.setV1 (V1);
    this.arco.add(nuevoArco);
}
public void eliminarVertice ();
}

