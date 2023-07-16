package com.dani;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    // Funciones
    public void agregarAsignatura(Asignatura asignatura) {
        for(Asignatura _asignatura : asignaturas) {
            if(_asignatura == asignatura) return;
        }

        // TODO: Añadir a todos los estudiantes a la asignatura

        asignaturas.add(asignatura);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        // Comprobar si el estudiante ya existe en el curso
        if(!existeEstudiante(estudiante)) estudiantes.add(estudiante);

        // Agregar al estudiante en las asignaturas en las que no está
        for(Asignatura asignatura : asignaturas) {
            if(!asignatura.existeEstudiante(estudiante)) {
                asignatura.agregarEstudiante(estudiante);
            }
        }
    }

    public void agregarProfesor(Profesor profesor, Asignatura asignatura) {
        for(Profesor _profesor : profesores) {
            if(_profesor == profesor) return;
        }

        if(asignatura.getProfesor() == profesor) return;

        asignatura.setProfesor(profesor);
        profesores.add(profesor);
    }

    public boolean existeEstudiante(Estudiante estudiante) {
        for(Estudiante _estudiante : estudiantes) {
            if(_estudiante == estudiante) return true;
        }

        return false;
    }

    // Constructores
    public Curso() {
    }

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    // Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
