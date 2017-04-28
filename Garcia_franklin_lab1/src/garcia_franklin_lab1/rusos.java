/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garcia_franklin_lab1;

/**
 *
 * @author Franklin Garcia
 */
public class rusos {
private String nombre;
private int id;
private int edad;
private int rango;
private int resistencia;
private String tipo_arma;

    public rusos() {
    }

    public rusos(String nombre, int id, int edad, int rango, int resistencia, String tipo_arma) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.rango = rango;
        this.resistencia = resistencia;
        this.tipo_arma = tipo_arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    @Override
    public String toString() {
        return "alemane{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", rango=" + rango + ", resistencia=" + resistencia + ", tipo_arma=" + tipo_arma + '}';
    }
    
}
