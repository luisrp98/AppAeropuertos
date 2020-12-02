/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaeropuertos;

import grafos.Grafo;
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

    public static Grafo gr = new Grafo();

    public static int convHoraMin(String a) {
        String hora[] = a.split(":");
        int h = Integer.parseInt(hora[0]) * 60;
        int m = Integer.parseInt(hora[1]);
        int costo = h + m;
        // System.out.println("Costo: " + costo);
        return costo;

    }

    public static String espacio(String a) {
        a = a.trim();
        a = a.toUpperCase();
        a = a.replace(" ", "");
        return a;
    }

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

        //Switch para leer el archivo de vuelos de el dia seleccionado
        switch (dia) {
            case 0:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Domingo.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        if (row.startsWith("Numero")) {
                            System.out.println("Primera linea" + row);
                        } else {
                            row = espacio(row);
                            String[] linea = row.split(",");
                            gr.addNodo(linea[1]);
                            gr.addNodo(linea[2]);
                            gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                        }

                    }

                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 1:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Lunes.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        if (row.startsWith("Numero")) {
                            System.out.println("Primera linea" + row);
                        } else {
                            String[] linea = row.split(",");
                            gr.addNodo(linea[1]);
                            gr.addNodo(linea[2]);
                            gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                        }

                    }

                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 2:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Martes.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        if (row.startsWith("Numero")) {
                            System.out.println("Primera linea" + row);
                        } else {
                            String[] linea = row.split(",");
                            gr.addNodo(linea[1]);
                            gr.addNodo(linea[2]);
                            gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                        }

                    }

                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 3:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Miercoles.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        if (row.startsWith("Numero")) {
                            System.out.println("Primera linea" + row);
                        } else {
                            String[] linea = row.split(",");
                            gr.addNodo(linea[1]);
                            gr.addNodo(linea[2]);
                            gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                        }

                    }

                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 4:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Jueves.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        if (row.startsWith("Numero")) {
                            System.out.println("Primera linea" + row);
                        } else {
                            String[] linea = row.split(",");
                            gr.addNodo(linea[1]);
                            gr.addNodo(linea[2]);
                            gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                        }

                    }

                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 5:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Viernes.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        if (row.startsWith("Numero")) {
                            System.out.println("Primera linea" + row);
                        } else {
                            String[] linea = row.split(",");
                            gr.addNodo(linea[1]);
                            gr.addNodo(linea[2]);
                            gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                        }

                    }

                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 6:
                try (BufferedReader lunes = new BufferedReader(new FileReader("D:\\Programación\\AppAeropuertos\\src\\InfoVuelos\\Sabado.csv"))) {
                    String row;
                    while ((row = lunes.readLine()) != null) {
                        if (row.startsWith("Numero")) {
                            System.out.println("Primera linea" + row);
                        } else {
                            String[] linea = row.split(",");
                            gr.addNodo(linea[1]);
                            gr.addNodo(linea[2]);
                            gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                        }

                    }

                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }

//    public static void Dijkstra(String O, String D) {
//        ArrayList<Arista> array = new ArrayList<>();
//
//        ArrayList<ArrayList<Arista>> ArrayDeCaminos = new ArrayList();
//
//        System.out.println("Funcion BuscaFinal");
//        gr.BuscaFinal(O, D, array, ArrayDeCaminos);
//
//        System.out.println("Array De Caminos");
//        System.out.println(ArrayDeCaminos);
//        System.out.println(" ");
//
//        // COSTOS
//        if (!ArrayDeCaminos.isEmpty()) {
//
//            int min = 9999999;
//            String Ccorto = null;
//            for (int i = 0; i < ArrayDeCaminos.size(); i++) {
//                int s = 0;
//                System.out.println(ArrayDeCaminos.get(i));
//                for (int j = 0; j < ArrayDeCaminos.get(i).size(); j++) {
//                    System.out.println("    --->" + ArrayDeCaminos.get(i).get(j).costo);
//                    s = ArrayDeCaminos.get(i).get(j).costo + s;
//
//                }
//
//                System.out.println(s);
//
//                if (s < min) {
//                    min = s;
//                    Ccorto = ArrayDeCaminos.get(i).toString();
//
//                }
//
//                System.out.println("");
//
//            }
//
//            System.out.println("El camino minimo de " + O + " a " + D + " cuesta "
//                    + min + " y la ruta es " + Ccorto);
//
//        } else {
//            System.out.println("No hay camino de " + O + " a " + D);
//        }
//    }
}
