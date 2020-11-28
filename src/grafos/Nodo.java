package grafos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author marianaare
 */
public class Nodo {
    public  Nodo apuntador;
    public  String texto;
    public  int valor;
    public  Object transporte;
    public Nodo(){
    }
    public Nodo(String t,int n){
        texto=t;
        valor=n;
    }
    @Override
    public String toString() {
        return "Nodo{" +
                "apuntador=" + apuntador +
                ", texto='" + texto + '\'' +
                ", valor=" + valor +
                ", Objeto=" + transporte +
                '}';
    }
}
