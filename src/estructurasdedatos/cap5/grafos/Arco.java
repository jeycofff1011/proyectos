
package grafos;

/**
 *
 * @author utp
 */
public class Arco {
    private int peso;
    private String Nombre;
    private Vertice v1;
    private Vertice v2;

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the v1
     */
    public Vertice getV1() {
        return v1;
    }

    /**
     * @param v1 the v1 to set
     */
    public void setV1(Vertice v1) {
        this.v1 = v1;
    }

    /**
     * @return the v2
     */
    public Vertice getV2() {
        return v2;
    }

    /**
     * @param v2 the v2 to set
     */
    public void setV2(Vertice v2) {
        this.v2 = v2;
    }
    
    
    
}
