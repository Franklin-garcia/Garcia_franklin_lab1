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
        ArrayList<rusos> rusos = new ArrayList();
        ArrayList<alemanes> alemanes = new ArrayList();
        ArrayList<alumnos> alumnos = new ArrayList();
        ArrayList muertos = new ArrayList();
        while (!opcion.equalsIgnoreCase("6")) {
            System.out.println("Ingrese opcion \n"
                    + "1.Reclutar \n"
                    + "2.Modificar \n"
                    + "3.Dar de alta \n"
                    + "4.Simulacion \n"
                    + "5.Reportes \n"
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
                                while (edad < 18) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese rango");
                                rango = lectura.nextInt();
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                while (resistencia < edad * 8) {
                                    System.out.println("Ingrese resistencia");
                                    resistencia = lectura.nextInt();
                                }
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
                                while (edad < 25 && tipo_arma.equals("RPG-7")) {
                                    System.out.println("Elija tipo de arma \n "
                                            + " 1.AK-47 \n"
                                            + " 2.Revolver Navant \n "
                                            + " 3.RPG-7 \n");
                                    arma = lectura.next();
                                    if (arma.equals("1")) {
                                        tipo_arma = "AK-47";
                                    } else if (arma.equals("2")) {
                                        tipo_arma = "Revolver Navant";
                                    } else if (arma.equals("3")) {
                                        tipo_arma = "RPG-7";
                                    }
                                }
                                rusos.add(new rusos(nombre, id, edad, rango, resistencia, tipo_arma));
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
                                while (edad < 0) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 0 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese casta");
                                casta = lectura.next();
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                while (resistencia < edad * 8) {
                                    System.out.println("Ingrese resistencia");
                                    resistencia = lectura.nextInt();
                                }
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
                                alemanes.add(new alemanes(alias, edad, casta, resistencia, tipo_arma));
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
                                while (edad < 16) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                while (resistencia < edad * 8) {
                                    System.out.println("Ingrese resistencia");
                                    resistencia = lectura.nextInt();
                                }
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
                                alumnos.add(new alumnos(grado_academico, apodo, numero_cuenta, edad, resistencia, tipo_arma));
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
                                while (edad < 18) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese rango");
                                rango = lectura.nextInt();
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                while (resistencia < edad * 8) {
                                    System.out.println("Ingrese resistencia");
                                    resistencia = lectura.nextInt();
                                }
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

                                ((rusos) rusos.get(pos)).setEdad(edad);
                                ((rusos) rusos.get(pos)).setId(id);
                                ((rusos) rusos.get(pos)).setNombre(nombre);
                                ((rusos) rusos.get(pos)).setRango(rango);
                                ((rusos) rusos.get(pos)).setResistencia(resistencia);
                                ((rusos) rusos.get(pos)).setTipo_arma(tipo_arma);
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
                                while (edad < 0) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese casta");
                                casta = lectura.next();
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                while (resistencia < 8 * edad) {
                                    System.out.println("Ingrese resistencia");
                                    resistencia = lectura.nextInt();
                                }
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

                                ((alemanes) alemanes.get(pos)).setAlias(alias);
                                ((alemanes) alemanes.get(pos)).setCasta(casta);
                                ((alemanes) alemanes.get(pos)).setEdad(edad);
                                ((alemanes) alemanes.get(pos)).setResistencia(resistencia);
                                ((alemanes) alemanes.get(pos)).setTipo_arma(tipo_arma);
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
                                while (edad < 16) {
                                    System.out.println("Edad no valida \n"
                                            + "Ingrese edad mayor de 18 años \n");
                                    edad = lectura.nextInt();
                                }
                                System.out.println("Ingrese resistencia");
                                resistencia = lectura.nextInt();
                                while (resistencia < 8 * edad) {
                                    System.out.println("Ingrese resistencia");
                                    resistencia = lectura.nextInt();
                                }
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
                                ((alumnos) alumnos.get(pos)).setApodo(apodo);
                                ((alumnos) alumnos.get(pos)).setEdad(edad);
                                ((alumnos) alumnos.get(pos)).setGrado_academico(grado_academico);
                                ((alumnos) alumnos.get(pos)).setNumero_cuenta(numero_cuenta);
                                ((alumnos) alumnos.get(pos)).setResistencia(resistencia);
                                ((alumnos) alumnos.get(pos)).setTipo_arma(tipo_arma);
                                System.out.println("Se modifico con exito");
                            }
                            break;
                        }
                    }
                }
                break;
                case "3": {
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
                                System.out.println("Ingrese posicion a eliminar");
                                int pos = lectura.nextInt();
                                rusos.remove(pos);
                                System.out.println("Se elimino con exito");
                            }
                            break;
                            case "2": {
                                System.out.println("Ingrese posicion a eliminar");
                                int pos = lectura.nextInt();
                                alemanes.remove(pos);
                                System.out.println("Se elimino con exito");
                            }
                            break;
                            case "3": {
                                System.out.println("Ingrese posicion a eliminar");
                                int pos = lectura.nextInt();
                                alumnos.remove(pos);
                                System.out.println("Se elimino con exito");
                            }
                            break;
                        }
                    }
                }
                break;
                case "4": {
                    boolean vive = true;
                    int cont = 0;
                    int daño = 0;
                    String gano = "";
                    while (vive = true) {
                        if (cont == 0) {
                            System.out.println("Turno de rusos");
                            int con = 0;
                            int res = 0;
                            for (alemanes a : alemanes) {
                                if (rusos.get(con).getTipo_arma().equals("AK-47")) {
                                    res = a.getResistencia() - 27;
                                    a.setResistencia(res);
                                    con++;
                                } else if (rusos.get(con).getTipo_arma().equals("Revolver Navant")) {
                                    res = a.getResistencia() - 13;
                                    a.setResistencia(res);
                                    con++;
                                } else if (rusos.get(con).getTipo_arma().equals("RPG-7")) {
                                    res = a.getResistencia() - 57;
                                    a.setResistencia(res);
                                    con++;
                                }
                            }
                            for (alumnos a : alumnos) {
                                if (rusos.get(con).getTipo_arma().equals("AK-47")) {
                                    res = a.getResistencia() - 27;
                                    a.setResistencia(res);
                                    con++;
                                } else if (rusos.get(con).getTipo_arma().equals("Revolver Navant")) {
                                    res = a.getResistencia() - 13;
                                    a.setResistencia(res);
                                    con++;
                                } else if (rusos.get(con).getTipo_arma().equals("RPG-7")) {
                                    res = a.getResistencia() - 57;
                                    a.setResistencia(res);
                                    con++;
                                }
                            }
                            cont++;
                        } else if (cont == 1) {
                            System.out.println("Turno de alemanes");
                            int con = 0;
                            int res = 0;
                            for (rusos r : rusos) {
                                if (alemanes.get(con).getTipo_arma().equals("MP 40")) {
                                    res = r.getResistencia() - 25;
                                    r.setResistencia(res);
                                    con++;
                                } else if (alemanes.get(con).getTipo_arma().equals("Ametralladora MG42")) {
                                    res = r.getResistencia() - 32;
                                    r.setResistencia(res);
                                    con++;
                                } else if (alemanes.get(con).getTipo_arma().equals("Pistolas Walther P38")) {
                                    res = r.getResistencia() - 11;
                                    r.setResistencia(res);
                                    con++;
                                }
                            }
                            for (alumnos r : alumnos) {
                                if (alemanes.get(con).getTipo_arma().equals("MP 40")) {
                                    res = r.getResistencia() - 25;
                                    r.setResistencia(res);
                                    con++;
                                } else if (alemanes.get(con).getTipo_arma().equals("Ametralladora MG42")) {
                                    res = r.getResistencia() - 32;
                                    r.setResistencia(res);
                                    con++;
                                } else if (alemanes.get(con).getTipo_arma().equals("Pistolas Walther P38")) {
                                    res = r.getResistencia() - 11;
                                    r.setResistencia(res);
                                    con++;
                                }
                            }

                            cont++;
                        } else if (cont == 2) {
                            System.out.println("Truno de alumnos");
                            int con = 0;
                            int res = 0;
                            for (rusos r : rusos) {
                                if (alumnos.get(con).getTipo_arma().equals("Discos duros")) {
                                    res = r.getResistencia() - 23;
                                    r.setResistencia(res);
                                    con++;
                                } else if (alumnos.get(con).getTipo_arma().equals("Controles de Wii")) {
                                    res = r.getResistencia() - 47;
                                    r.setResistencia(res);
                                    con++;
                                } else if (alumnos.get(con).getTipo_arma().equals("Laptos")) {
                                    res = r.getResistencia() - 76;
                                    r.setResistencia(res);
                                    con++;
                                }
                            }
                            for (alemanes r : alemanes) {
                                if (alumnos.get(con).getTipo_arma().equals("Discos duros")) {
                                    res = r.getResistencia() - 23;
                                    r.setResistencia(res);
                                    con++;
                                } else if (alumnos.get(con).getTipo_arma().equals("Controles de Wii")) {
                                    res = r.getResistencia() - 47;
                                    r.setResistencia(res);
                                    con++;
                                } else if (alumnos.get(con).getTipo_arma().equals("Laptos")) {
                                    res = r.getResistencia() - 76;
                                    r.setResistencia(res);
                                    con++;
                                }
                            }
                            cont = 0;
                        }
                        int conff = 0;
                        for (rusos r : rusos) {
                            if (r.getResistencia() <= 0) {
                                muertos.add(rusos.get(conff));
                                rusos.remove(r);
                            }
                            conff++;
                        }
                        int conf = 0;
                        for (alemanes a : alemanes) {
                            if (a.getResistencia() <= 0) {
                                muertos.add(rusos.get(conf));
                                alemanes.remove(a);
                            }
                            conf++;
                        }
                        int conv = 0;
                        for (alumnos a : alumnos) {
                            if (a.getResistencia() <= 0) {
                                muertos.add(rusos.get(conv));
                                alumnos.remove(a);
                            }
                            conv++;
                        }
                        if (alemanes_viven(alemanes) == false && alumnos_viven(alumnos) == false) {
                            gano = "gano rusia";
                            break;

                        } else if (rusos_viven(rusos) == false && alumnos_viven(alumnos) == false) {
                            gano = "gano alemanes";
                            break;
                        } else if (rusos_viven(rusos) == false && alemanes_viven(alemanes) == false) {
                            gano = "gano alumnos";
                            break;
                        }
                    }
                    System.out.println(gano);
                }
                break;
                case "5": {
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
            }
        }
    }

    public static boolean rusos_viven(ArrayList rusos) {
        if (rusos.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean alemanes_viven(ArrayList alemanes) {
        if (alemanes.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean alumnos_viven(ArrayList alumnos) {
        if (alumnos.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

}
