package com.dani;

import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private int cantidadNotas;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    // Funciones
    public void agregarEstudiante(Estudiante estudiante) {
        if(existeEstudiante(estudiante)) return;

        estudiantes.add(estudiante);

        // TODO: Establecer notas de la asignatura en nota minima
    }

    public boolean existeEstudiante(Estudiante estudiante) {
        for(Estudiante _estudiante : estudiantes)
            if(_estudiante == estudiante) return true;

        return false;
    }

    // Constructores
    public Asignatura() {
    }

    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getCantidadNotas() {
        return cantidadNotas;
    }

    public void setCantidadNotas(int cantidadNotas) {
        this.cantidadNotas = cantidadNotas;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
