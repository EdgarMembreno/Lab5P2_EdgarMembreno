/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_edgarmembrenoo;

/**
 *
 * @author edgarmembreno
 */
public class Jugadores {

    private String nombre;
    private String apellido;
    private int edad;
    private int numero;
    private int partidos_jug;
    private int copas;
    private int tarjetasR;
    private int tarjetaA;
    private int aContrato;
    private String nacionalidad;

    public Jugadores() {
    }

    public Jugadores(String nombre, String apellido, int edad, int numero, int partidos_jug, int copas, int tarjetasR, int tarjetaA, int aContrato, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numero = numero;
        this.partidos_jug = partidos_jug;
        this.copas = copas;
        this.tarjetasR = tarjetasR;
        this.tarjetaA = tarjetaA;
        this.aContrato = aContrato;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPartidos_jug() {
        return partidos_jug;
    }

    public void setPartidos_jug(int partidos_jug) {
        this.partidos_jug = partidos_jug;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public int getTarjetasR() {
        return tarjetasR;
    }

    public void setTarjetasR(int tarjetasR) {
        this.tarjetasR = tarjetasR;
    }

    public int getTarjetaA() {
        return tarjetaA;
    }

    public void setTarjetaA(int tarjetaA) {
        this.tarjetaA = tarjetaA;
    }

    public int getaContrato() {
        return aContrato;
    }

    public void setaContrato(int aContrato) {
        this.aContrato = aContrato;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
