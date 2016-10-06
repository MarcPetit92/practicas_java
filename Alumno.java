/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_asignaturas;

import java.util.ArrayList;

/**
 *
 * @author 1001489.joan23
 */
public class Alumno {
    
    private String nombre;
    private String apellido;
    //private Asignatura asignatura;
    
    private ArrayList<Asignatura> listaAsignatura;

    

    public Alumno(String nombre, String apellido, ArrayList<Asignatura> listaAsignatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaAsignatura = listaAsignatura;
    }

    
    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Asignatura> getListaAsignatura() {
        return listaAsignatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setListaAsignatura(ArrayList<Asignatura> listaAsignatura) {
        this.listaAsignatura = listaAsignatura;
    }
    
    
    
    
    
    
    
}
