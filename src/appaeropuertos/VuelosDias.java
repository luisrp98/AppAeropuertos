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
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisr
 */
public class VuelosDias {

    public static int numeroDeVuelo;

    public static Grafo gr = new Grafo();

    public static int convHoraMin(String a) {
        String hora[] = a.split(":");
        int h = Integer.parseInt(hora[0]) * 60;
        int m = Integer.parseInt(hora[1]);
        int costo = h + m;
        // System.out.println("Costo: " + costo);
        return costo;

    }

    public static String limpiarAcentos(String cadena) {
        String limpio = null;
        if (cadena != null) {
            String valor = cadena;
            valor = valor.toUpperCase();
            // Normalizar texto para eliminar acentos, dieresis, cedillas y tildes
            limpio = Normalizer.normalize(valor, Normalizer.Form.NFD);
            // Quitar caracteres no ASCII excepto la enie, interrogacion que abre, exclamacion que abre, grados, U con dieresis.
            limpio = limpio.replaceAll("[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]", "");
            // Regresar a la forma compuesta, para poder comparar la enie con la tabla de valores
            limpio = Normalizer.normalize(limpio, Normalizer.Form.NFC);
        }
        return limpio;
    }

    public static String espacio(String a) {
        a = a.trim();
        a = a.toUpperCase();
        a = limpiarAcentos(a);
        a = a.replace(" ", "");
        return a;
    }

    public static boolean existe(ArrayList a, ArrayList b, String n1, String n2) {
        for (int i = 0; i < a.size(); i++) {
            if (n1.equals(a.get(i))) {
                if (n2.equals(b.get(i))) {
                    System.out.println("Conexion repetida " + i + " " + a.get(i) + "   " + b.get(i) + "  " + n1 + "    " + n2);
                    return true;
                }
            }

        }
        return false;
    }

    public static void diaToSwitch(String d) {

        ArrayList<String> nodos1 = new ArrayList<String>();
        ArrayList<String> nodos2 = new ArrayList<String>();
        int c = 0;
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
                            if (nodos1.isEmpty()) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                            } else if (existe(nodos1, nodos2, linea[1], linea[2]) != true) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                                System.out.println(linea[1] + " " + linea[2] + " " + convHoraMin(linea[3]));
                            }
                        }

                    }
                    System.out.println("grafo" + gr);
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
                            row = espacio(row);
                            String[] linea = row.split(",");
                            if (nodos1.isEmpty()) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                            } else if (existe(nodos1, nodos2, linea[1], linea[2]) != true) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                                System.out.println(linea[1] + " " + linea[2] + " " + convHoraMin(linea[3]));
                            }
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
                            row = espacio(row);
                            String[] linea = row.split(",");
                            if (nodos1.isEmpty()) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                            } else if (existe(nodos1, nodos2, linea[1], linea[2]) != true) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                                System.out.println(linea[1] + " " + linea[2] + " " + convHoraMin(linea[3]));
                            }
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
                            row = espacio(row);
                            String[] linea = row.split(",");
                            if (nodos1.isEmpty()) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                            } else if (existe(nodos1, nodos2, linea[1], linea[2]) != true) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                                System.out.println(linea[1] + " " + linea[2] + " " + convHoraMin(linea[3]));
                            }
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
                            row = espacio(row);
                            String[] linea = row.split(",");
                            if (nodos1.isEmpty()) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                            } else if (existe(nodos1, nodos2, linea[1], linea[2]) != true) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                                System.out.println(linea[1] + " " + linea[2] + " " + convHoraMin(linea[3]));
                            }
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
                            row = espacio(row);
                            String[] linea = row.split(",");
                            if (nodos1.isEmpty()) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                            } else if (existe(nodos1, nodos2, linea[1], linea[2]) != true) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                                System.out.println(linea[1] + " " + linea[2] + " " + convHoraMin(linea[3]));
                            }
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
                            row = espacio(row);
                            String[] linea = row.split(",");
                            if (nodos1.isEmpty()) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                            } else if (existe(nodos1, nodos2, linea[1], linea[2]) != true) {
                                nodos1.add(linea[1]);
                                nodos2.add(linea[2]);
                                gr.addNodo(linea[1]);
                                gr.addNodo(linea[2]);
                                gr.addArista(linea[1], linea[2], convHoraMin(linea[3]));
                                System.out.println(linea[1] + " " + linea[2] + " " + convHoraMin(linea[3]));
                            }
                        }

                    }
                } catch (IOException ex) {
                    Logger.getLogger(Ventana1.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }

}
