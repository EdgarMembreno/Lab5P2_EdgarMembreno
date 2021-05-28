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
public class Psicologo {
    public String nombre;
    public String apellido;
    public String nacionalidad;
    public int edad;
    public String titulo;
    public int id;
    public String especialidad;
    public int informes;
    public int jugadoresAtendidos;

    public Psicologo() {
    }

    public Psicologo(String nombre, String apellido, String nacionalidad, int edad, String titulo, int id, String especialidad, int informes, int jugadoresAtendidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.titulo = titulo;
        this.id = id;
        this.especialidad = especialidad;
        this.informes = informes;
        this.jugadoresAtendidos = jugadoresAtendidos;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getInformes() {
        return informes;
    }

    public void setInformes(int informes) {
        this.informes = informes;
    }

    public int getJugadoresAtendidos() {
        return jugadoresAtendidos;
    }

    public void setJugadoresAtendidos(int jugadoresAtendidos) {
        this.jugadoresAtendidos = jugadoresAtendidos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
            
    
}
