/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garcia_franklin_lab1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin Garcia
 */
public class Garcia_franklin_lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String opcion = "";
        ArrayList lista = new ArrayList();
        ArrayList muertos = new ArrayList();
        while (!opcion.equalsIgnoreCase("6")) {
            System.out.println("Ingrese opcion \n"
                    + "1.Reclutar \n"
                    + "2.Modificar \n"
                    + "3.Dar de alta \n"
                    + "4.Reportes \n"
                    + "5.Simulacion \n"
                    + "6-Salir \n");
            opcion = lectura.next();
            switch (opcion) {
                case "1": {
                    String opcion_ejercito = "";
                    while (!opcion_ejercito.equalsIgnoreCase("4")) {
                        System.out.println("Ingrese opcion de ejrcito \n"
                                + "1-Rusos \n"
                                + "2-alemanes \n"
                                + "3.Alumnos \n"
                                + "4.Salir \n");
                        opcion_ejercito = lectura.next();
                        switch (opcion_ejercito) {
                            case "1": {
                                String nombre;
                                int id;
                                int edad;
                                int rango;
                                int resistencia;
                                String tipo_arma = "";
                                System.out.println("Ingrese nombre");
                                nombre = lectura.next();
                                System.out.println("Ingrese id");
                                id = lectura.nextInt();
                                System.out.println("Ingrese edad");
                                edad = lectura.nextInt();
                                while (edad > 18) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese rango");
                                rango = lectura.nextInt();
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                System.out.println("Elija tipo de arma \n "
                                        + " 1.AK-47 \n"
                                        + " 2.Revolver Navant \n "
                                        + " 3.RPG-7 \n");
                                String arma = lectura.next();
                                if (arma.equals("1")) {
                                    tipo_arma = "AK-47";
                                } else if (arma.equals("2")) {
                                    tipo_arma = "Revolver Navant";
                                } else if (arma.equals("3")) {
                                    tipo_arma = "RPG-7";
                                }
                                lista.add(new rusos(nombre, id, edad, rango, resistencia, tipo_arma));
                                System.out.println("Se agrego con exito");
                            }
                            break;
                            case "2": {
                                String alias;
                                int edad;
                                String casta;
                                int resistencia;
                                String tipo_arma = "";
                                System.out.println("Ingrese alias");
                                alias = lectura.next();
                                System.out.println("Ingrese edad");
                                edad = lectura.nextInt();
                                while (edad > 0) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 0 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese casta");
                                casta = lectura.next();
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                System.out.println("Ingrese opcion de arma \n"
                                        + "1.MP 40 \n "
                                        + "2.Ametralladora MG42 \n"
                                        + "3.Pistolas Walther P38 \n");
                                String opcion_arma = lectura.next();
                                if (opcion_arma.equals("1")) {
                                    tipo_arma = "MP 40";
                                } else if (tipo_arma.equals("2")) {
                                    tipo_arma = "Ametralladora MG42";
                                } else if (tipo_arma.equals("3")) {
                                    tipo_arma = "Pistolas Walther P38";
                                }
                                lista.add(new alemanes(alias, edad, casta, resistencia, tipo_arma));
                                System.out.println("Se agrego con exito");
                            }
                            break;
                            case "3": {
                                String grado_academico;
                                String apodo;
                                int numero_cuenta;
                                int edad;
                                int resistencia;
                                String tipo_arma = "";
                                System.out.println("Ingrese grado academico");
                                grado_academico = lectura.next();
                                System.out.println("Ingrese apodo");
                                apodo = lectura.next();
                                System.out.println("Ingrese numero de cuenta");
                                numero_cuenta = lectura.nextInt();
                                System.out.println("ingrese edad");
                                edad = lectura.nextInt();
                                while (edad > 16) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                System.out.println("Ingrese tipo de arama \n"
                                        + "1.Discos duros \n"
                                        + "2.Controles de Wii \n"
                                        + "3.Laptops \n");
                                String opcion_arma = lectura.next();
                                if (opcion_arma.equals("1")) {
                                    tipo_arma = "Discos duros";
                                } else if (opcion_arma.equals("2")) {
                                    tipo_arma = "Controles de Wii";
                                } else if (opcion_arma.equals("3")) {
                                    tipo_arma = "Laptops";
                                }
                                lista.add(new alumnos(grado_academico, apodo, numero_cuenta, edad, resistencia, tipo_arma));
                                System.out.println("Se agrego con exito");
                            }
                            break;
                        }
                    }
                }
                break;
                case "2": {
                    String opcion_ejercito = "";
                    while (!opcion_ejercito.equalsIgnoreCase("4")) {
                        System.out.println("Ingrese opcion de ejrcito \n"
                                + "1-Rusos \n"
                                + "2-alemanes \n"
                                + "3.Alumnos \n"
                                + "4.Salir \n");
                        opcion_ejercito = lectura.next();
                        switch (opcion_ejercito) {
                            case "1": {
                                System.out.println("Ingrese posicion a modifiar");
                                int pos = lectura.nextInt();
                                String nombre;
                                int id;
                                int edad;
                                int rango;
                                int resistencia;
                                String tipo_arma = "";
                                System.out.println("Ingrese nombre");
                                nombre = lectura.next();
                                System.out.println("Ingrese id");
                                id = lectura.nextInt();
                                System.out.println("Ingrese edad");
                                edad = lectura.nextInt();
                                while (edad > 18) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese rango");
                                rango = lectura.nextInt();
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                System.out.println("Elija tipo de arma \n "
                                        + " 1.AK-47 \n"
                                        + " 2.Revolver Navant \n "
                                        + " 3.RPG-7 \n");
                                String arma = lectura.next();
                                if (arma.equals("1")) {
                                    tipo_arma = "AK-47";
                                } else if (arma.equals("2")) {
                                    tipo_arma = "Revolver Navant";
                                } else if (arma.equals("3")) {
                                    tipo_arma = "RPG-7";
                                }

                                ((rusos) lista.get(pos)).setEdad(edad);
                                ((rusos) lista.get(pos)).setId(id);
                                ((rusos) lista.get(pos)).setNombre(nombre);
                                ((rusos) lista.get(pos)).setRango(rango);
                                ((rusos) lista.get(pos)).setResistencia(resistencia);
                                ((rusos) lista.get(pos)).setTipo_arma(tipo_arma);
                                System.out.println("Se modifico con exito");
                            }
                            break;
                            case "2": {
                                System.out.println("Ingrese posicion a modificar");
                                int pos = lectura.nextInt();
                                String alias;
                                int edad;
                                String casta;
                                int resistencia;
                                String tipo_arma = "";
                                System.out.println("Ingrese alias");
                                alias = lectura.next();
                                System.out.println("Ingrese edad");
                                edad = lectura.nextInt();
                                while (edad > 0) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese casta");
                                casta = lectura.next();
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                System.out.println("Ingrese opcion de arma \n"
                                        + "1.MP 40 \n "
                                        + "2.Ametralladora MG42 \n"
                                        + "3.Pistolas Walther P38 \n");
                                String opcion_arma = lectura.next();
                                if (opcion_arma.equals("1")) {
                                    tipo_arma = "MP 40";
                                } else if (tipo_arma.equals("2")) {
                                    tipo_arma = "Ametralladora MG42";
                                } else if (tipo_arma.equals("3")) {
                                    tipo_arma = "Pistolas Walther P38";
                                }

                                ((alemanes) lista.get(pos)).setAlias(alias);
                                ((alemanes) lista.get(pos)).setCasta(casta);
                                ((alemanes) lista.get(pos)).setEdad(edad);
                                ((alemanes) lista.get(pos)).setResistencia(resistencia);
                                ((alemanes) lista.get(pos)).setTipo_arma(tipo_arma);
                                System.out.println("Se modifico con exito");

                            }
                            break;
                            case "3": {
                                System.out.println("Ingrese posicion a modificar");
                                int pos = lectura.nextInt();
                                String grado_academico;
                                String apodo;
                                int numero_cuenta;
                                int edad;
                                int resistencia;
                                String tipo_arma = "";
                                System.out.println("Ingrese grado academico");
                                grado_academico = lectura.next();
                                System.out.println("Ingrese apodo");
                                apodo = lectura.next();
                                System.out.println("Ingrese numero de cuenta");
                                numero_cuenta = lectura.nextInt();
                                System.out.println("ingrese edad");
                                edad = lectura.nextInt();
                                while (edad > 16) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                System.out.println("Ingrese tipo de arama \n"
                                        + "1.Discos duros \n"
                                        + "2.Controles de Wii \n"
                                        + "3.Laptops \n");
                                String opcion_arma = lectura.next();
                                if (opcion_arma.equals("1")) {
                                    tipo_arma = "Discos duros";
                                } else if (opcion_arma.equals("2")) {
                                    tipo_arma = "Controles de Wii";
                                } else if (opcion_arma.equals("3")) {
                                    tipo_arma = "Laptops";
                                }
                                ((alumnos) lista.get(pos)).setApodo(apodo);
                                ((alumnos) lista.get(pos)).setEdad(edad);
                                ((alumnos) lista.get(pos)).setGrado_academico(grado_academico);
                                ((alumnos) lista.get(pos)).setNumero_cuenta(numero_cuenta);
                                ((alumnos) lista.get(pos)).setResistencia(resistencia);
                                ((alumnos) lista.get(pos)).setTipo_arma(tipo_arma);
                                System.out.println("Se modifico con exito");
                            }
                            break;
                        }
                    }
                }
                break;
                case "3": {
                    String e = "";
                    for (Object t : lista) {
                        e = "\n" + lista.indexOf(t) + " " + t;
                        System.out.println(e);
                    }
                    System.out.println("Ingrese opcion para eliminar");
                    int pos = lectura.nextInt();
                    lista.remove(pos);
                    System.out.println("Se elimino con exito");
                }
                break;
                case "4": {
                    System.out.println("Ingrese opcion \n"
                            + "1.rusos \n"
                            + "2.Alemanes \n"
                            + "3.alumnos \n");
                    String opcion_listar = lectura.next();
                    if (opcion_listar.equals("1")) {
                        String e = "";
                        for (Object t : muertos) {
                            if (t instanceof rusos) {
                                e += "\n" + muertos.indexOf(t) + " " + t;
                            }
                        }
                        System.out.println(e);
                    } else if (opcion_listar.equals("2")) {
                        String e = "";
                        for (Object t : muertos) {
                            if (t instanceof alemanes) {
                                e += "\n" + muertos.indexOf(t) + " " + t;
                            }
                        }
                        System.out.println(e);
                    } else if (opcion_listar.equals("3")) {
                        String e = "";
                        for (Object t : muertos) {
                            if (t instanceof alumnos) {
                                e += "\n" + muertos.indexOf(t) + " " + t;
                            }
                        }
                        System.out.println(e);
                    }
                }
                break;
                case "5": {

                }
                break;
            }
        }
    }

}
