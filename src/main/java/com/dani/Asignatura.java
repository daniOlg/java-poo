package com.dani;

import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private int cantidadEvaluaciones = 1;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private final float NOTA_MIN = 1.0f;
    private final float NOTA_MAX = 7.0f;

    // Funciones
    public void agregarEstudiante(Estudiante estudiante) {
        if(existeEstudiante(estudiante)) return; //TODO: Log
        estudiantes.add(estudiante);

        // Agregar esta asignatura al estudiante
        estudiante.agregarAsignatura(this);
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

    public Asignatura(String nombre, int cantidadEvaluaciones) {
        this.nombre = nombre;
        this.cantidadEvaluaciones = cantidadEvaluaciones;
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

        // Asignar esta asignatura al profesor
        profesor.setAsignatura(this);
    }

    public int getCantidadEvaluaciones() {
        return cantidadEvaluaciones;
    }

    public void setCantidadEvaluaciones(int cantidadEvaluaciones) {
        this.cantidadEvaluaciones = cantidadEvaluaciones;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
