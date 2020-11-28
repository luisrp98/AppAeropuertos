/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;


public class Grafo {

    public static NodoDoble puntero;
    public static NodoG inicio;
    public static String nombre;
    public static String descripcion;

    public Grafo() {
        inicio = null;
    }

    public Grafo(String nombre) {
        this.nombre = nombre;
    }

    public Grafo(NodoG inicio) {
        this.inicio = inicio;
    }

    public static boolean vacio() {
        return inicio == null;
    }

    public static NodoG veUltimo() {
        if (!vacio()) {
            NodoG temp = inicio;
            while (temp.sigHermano != null) {
                temp = temp.sigHermano;
            }
            return temp;
        }
        return null;
    }

    public static NodoG busca(String n) {
        if (!vacio()) {
            NodoG temp = inicio;
            while (temp.sigHermano != null && temp.nombre.compareTo(n) != 0) {
                temp = temp.sigHermano;
            }
            if (temp.nombre.compareTo(n) == 0) {
                return temp;
            }
        }
        return null;
    }

    public static void addNodo(String n) {
        if (busca(n) == null) {
            NodoG temp = veUltimo();
            if (temp == null) {
                inicio = new NodoG(n);
            } else {
                temp.sigHermano = new NodoG(n);
            }
            System.out.println("Nodo: " + n + " Agregado");
        } else {
            System.out.println("Nodo: " + n + " Ya Existe");
        }
    }

    public static boolean addArista(String origen, String destino, int costo) {
        NodoG o = busca(origen);
        NodoG d = busca(destino);
        if (o != null && d != null) {
            Arista temp = new Arista(costo, d);
            Arista Aristatemp = o.primeraArista;
            if (Aristatemp != null) {
                while (Aristatemp.sigArista != null) {
                    Aristatemp = Aristatemp.sigArista;
                }
                Aristatemp.sigArista = temp;
            } else {
                o.primeraArista = temp;
            }
            return true;
        } else {
            return false;
        }

    }

    public ArrayList BuscaFinal(String origen, String destino, ArrayList al, ArrayList ArrDeCaminos) {
        System.out.println(origen);
        NodoG miNodo = busca(origen);
        System.out.println(miNodo);
        System.out.println(miNodo.primeraArista);
        Arista ar = miNodo.primeraArista;

        ArrayList<Arista> camino = new ArrayList<>();
        camino = (ArrayList<Arista>) al.clone();
        ArrayList<Arista> base = new ArrayList<>();
        base = (ArrayList<Arista>) camino.clone();

        if (!camino.contains(ar)) {
            while (ar != null) {

                NodoG Nodotemp = busca(ar.conector.nombre);
                camino.add(ar);

                if (destino.equals(ar.conector.nombre)) {
                    System.out.println("llegué al destino");
                    System.out.println(camino);
                    System.out.println(" ");
                    ArrDeCaminos.add(camino);

                } else {
                    if (Nodotemp.primeraArista != null) {
                        BuscaFinal(ar.conector.nombre, destino, camino, ArrDeCaminos);
                    }

                }
                ar = ar.sigArista;
                camino = (ArrayList<Arista>) base.clone();
            }
        }
        return camino;
    }

    public int costos(ArrayList arr) {
        int suma = 0;
        return suma;
    }

    public void probando2(String o, String d) {
        NodoG miNodo = inicio;

        do {
            System.out.println("******  " + miNodo.nombre + "  ******");
            Arista ar = miNodo.primeraArista;

            while (ar != null) {
                System.out.println(ar.conector.nombre);
                System.out.println(ar.costo);

                ar = ar.sigArista;

            }

            miNodo = miNodo.sigHermano;

        } while (miNodo.sigHermano != null);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(nombre + "\n");
        if (inicio != null) {
            NodoG temp = inicio;
            sb.append(temp + "\n");
            while (temp.sigHermano != null) {
                temp = temp.sigHermano;
                sb.append(temp + "\n");
            }
        }

        return sb.toString();
    }
}
