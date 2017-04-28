/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garcia_franklin_lab1;

import java.util.ArrayList;
import java.util.Scanner;

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
                                + "Alumnos \n");
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
                                nombre = lectura.nextLine();
                                System.out.println("Ingrese id");
                                id = lectura.nextInt();
                                System.out.println("Ingrese edad");
                                edad = lectura.nextInt();
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
                            }
                            break;
                            case "2": {
                                String alias;
                                int edad;
                                String casta;
                                int resistencia;
                                String tipo_arma = "";
                                System.out.println("Ingrese alias");
                                alias = lectura.nextLine();
                                System.out.println("Ingrese edad");
                                edad = lectura.nextInt();
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
                                grado_academico = lectura.nextLine();
                                System.out.println("Ingrese apodo");
                                apodo = lectura.next();
                                System.out.println("Ingrese numero de cuenta");
                                numero_cuenta = lectura.nextInt();
                                System.out.println("ingrese edad");
                                edad = lectura.nextInt();
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
                            }
                            break;
                        }
                    }
                }
                break;
                case "2": {

                }
                break;
                case "3": {

                }
                break;
                case "4": {

                }
                break;
                case "5": {

                }
                break;
            }
        }
    }

}
