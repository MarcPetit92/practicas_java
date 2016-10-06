/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_asignaturas;

/**
 *
 * @author 1001489.joan23
 */
public class Asignatura {
        
    private String nom;
    private double nota;

    public Asignatura(String nom, double nota) {
        this.nom = nom;
        this.nota = nota;
    }

    public Asignatura() {
    }

    public String getNom() {
        return nom;
    }

    public double getNota() {
        return nota;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    

   
    }


    
    

