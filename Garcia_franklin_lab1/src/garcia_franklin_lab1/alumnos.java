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
public class alumnos {

private String apodo;
private int numero_cuenta;
private int edad;
private int resistencia;
private String tipo_arma;
private String grado_academico;

    public alumnos() {
    }

    public alumnos(String grado_academico,String apodo, int numero_cuenta, int edad, int resistencia, String tipo_arma ) {
        this.grado_academico=grado_academico;
        this.apodo = apodo;
        this.numero_cuenta = numero_cuenta;
        this.edad = edad;
        this.resistencia = resistencia;
        this.tipo_arma = tipo_arma;
        
    }

    public String getGrado_academico() {
        return grado_academico;
    }

    public void setGrado_academico(String grado_academico) {
        this.grado_academico = grado_academico;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
        return "alumno{" + "apodo=" + apodo + ", numero_cuenta=" + numero_cuenta + ", edad=" + edad + ", resistencia=" + resistencia + ", tipo_arma=" + tipo_arma + ", grado_academico=" + grado_academico + '}';
    }



}
