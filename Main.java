/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_asignaturas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1001489.joan23
 */
public class Main {

    public static void main(String[] args) {
        
        //creamos una variable de tipon scanner para leer lo que el usuario
        //entra por consola
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        Double nota = entrada.nextDouble();
        
        //primero creamos un nueevo alumnos 
        //para ello primero tenemos que reservar memoria
        //Alumno alumno1 = new Alumno();
        //ahora se crea la asignatura para el alumno y se reserva memoria
        Asignatura asignatura1 = new Asignatura();
        Asignatura asignatura2 = new Asignatura();
        //ahora se introducen los valores
        //alumno1.setNombre("Marc");
        //alumno1.setApellido("Petit");
        //ahora hay que darle valor a la asignatura      
        asignatura1.setNom("Programacion");
        asignatura1.setNota(7.5);
        asignatura2.setNom("Programacion2");
        asignatura2.setNota(5);
        
        ArrayList<Asignatura> listaAsignatura1 = new ArrayList<Asignatura>();
        ArrayList<Asignatura> listaAsignatura2 = new ArrayList<Asignatura>();
        
        listaAsignatura1.add(asignatura1); 
        listaAsignatura1.add(asignatura2);
        
        Alumno alumno1 = new Alumno("Marc", "Petit", listaAsignatura1);

        //contructor por defecto del arraylist
        ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();
        asignatura1.setNota(4);
        asignatura2.setNota(6);
        
        listaAsignatura2.add(asignatura1); 
        listaAsignatura2.add(asignatura2);
        
        Alumno alumno2 = new Alumno("Eric", "Petit", listaAsignatura2);
        //añadimos alumno 1 a la lista de alumnos
        listaAlumno.add(alumno1);
        
        listaAlumno.add(alumno2);
        //ahora si queremos visualizar el contenido de la lista
        //generamos un bucle for facil y una variable que recorra esa lista
        //t visualizamos
        for (Alumno fantasma : listaAlumno) {
            System.out.println(fantasma.getNombre() + " " + fantasma.getApellido() );
               for (Asignatura aux: fantasma.getListaAsignatura()){
                   System.out.println("La nota de " + aux.getNom() + " es " + aux.getNota());
               }
                   
        }

    }
}
