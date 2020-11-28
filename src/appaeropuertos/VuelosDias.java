/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaeropuertos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisr
 */
public class VuelosDias {

    public static void diaToSwitch(String d) {
        int dia = 0;
        //Domingo 0
        //Lunes 1
        //Martes 2
        //Miercoles 3
        //ueves 4
        //Viernes 5
        //Sabado 6
        if (d.equals("Sun")) {
            dia = 0;
        } else if (d.equals("Mon")) {
            dia = 1;
        } else if (d.equals("Tue")) {
            dia = 2;
        } else if (d.equals("Wed")) {
            dia = 3;
        } else if (d.equals("Thu")) {
            dia = 4;
        } else if (d.equals("Fri")) {
            dia = 5;
        } else if (d.equals("Sat")) {
            dia = 6;
        }

        //Switch para leer el archivo de vuelos de x dia
        switch (dia) {
            case 0:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Domingo.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        System.out.println(row); //Bandera para ver que se imprimen
                        //AQUI SE CREARIAN LOS NODOS
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 1:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Lunes.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        System.out.println(row); //Bandera para ver que se imprimen
                        //AQUI SE CREARIAN LOS NODOS
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Martes.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        System.out.println(row); //Bandera para ver que se imprimen
                        //AQUI SE CREARIAN LOS NODOS
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Miercoles.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        System.out.println(row); //Bandera para ver que se imprimen
                        //AQUI SE CREARIAN LOS NODOS
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Jueves.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        System.out.println(row); //Bandera para ver que se imprimen
                        //AQUI SE CREARIAN LOS NODOS
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 5:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Viernes.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        System.out.println(row); //Bandera para ver que se imprimen
                        //AQUI SE CREARIAN LOS NODOS
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 6:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Sabado.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        System.out.println(row); //Bandera para ver que se imprimen
                        //AQUI SE CREARIAN LOS NODOS
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }

}
