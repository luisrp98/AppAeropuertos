/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

public class Arista {

    public int costo;
    public Arista sigArista;
    public NodoG conector;

    public Arista() {
    }

    public Arista(int costo, NodoG conector) {
        this.costo = costo;
        this.conector = conector;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Arista getSigArista() {
        return sigArista;
    }

    public NodoG getConector() {
        return conector;
    }

    @Override
    public String toString() {
        return conector.getNombre() + "-" + this.costo;
    }
}
