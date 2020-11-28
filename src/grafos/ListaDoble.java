/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author mariana.are
 */
public class ListaDoble {

    public  NodoDoble puntero;

    @Override
    public String toString() {
        return "ListaDoble{"
                + "puntero=" + puntero
                + "texto=" + puntero.texto
                + '}';
    }

    void listado() {
        if (puntero !=null){
        while (ant()) {
        }
        System.out.println(puntero.texto);
        while (sig()) {
            System.out.println(puntero.texto);
        }
        System.out.println();
    }
        else{
            System.out.println("lista vacía");
        }
    }

    void push(NodoDoble temp) {
        if (puntero == null) {
            puntero = temp;
            puntero.siguiente = null;
            puntero.anterior = null;
        } else {
            if (puntero.siguiente == null) {
                puntero.siguiente = temp;
                puntero.siguiente.siguiente = null;
                puntero.siguiente.anterior = puntero;
                puntero = puntero.siguiente;
            } else {
                puntero.siguiente.anterior = temp;
                temp.siguiente = puntero.siguiente;
                temp.anterior = puntero;
                puntero.siguiente = temp;
            }
        }
    }

    NodoDoble pop() {
        NodoDoble temp = puntero;
        
        if (puntero == null) {
            return null;
        } else {
            if (puntero.anterior == null && puntero.siguiente == null) {
                puntero = null;
                return temp;
            }
        }

        if (puntero.anterior == null) {
            puntero = puntero.siguiente;
            puntero.anterior = null;
            temp.siguiente=null;
            return temp;

        } else {

            if (puntero.siguiente == null) {
                puntero = puntero.anterior;
                puntero.siguiente = null;
                temp.anterior=null;
                return temp;

            } else {
                puntero.anterior.siguiente = temp.siguiente;
                puntero.siguiente.anterior = temp.anterior;
                puntero = temp.anterior;
                temp.anterior=null;
                temp.siguiente=null;
                return temp;
            }

        }

    }

    boolean sig() {
        if (puntero.siguiente == null) {
            System.out.println("Estas al final");
            return false;
        } else {
            puntero = puntero.siguiente;

        }
        return true;

    }

    boolean ant() {
        if (puntero.anterior == null) {
            System.out.println("estas al inicio");
            return false;

        } else {
            puntero = puntero.anterior;
        }
        return true;
    }
}
