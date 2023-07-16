package com.dani;

import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    // Funciones
    public void agregarCurso(Curso curso) {
        if(existeCurso(curso)) return; //TODO: Log
        cursos.add(curso);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if(existeEstudiante(estudiante)) return; //TODO: Log
        estudiantes.add(estudiante);

        // TODO: Aleatorizar agregado de estudiante a los cursos
        cursos.get(0).agregarEstudiante(estudiante);
    }

    public boolean existeEstudiante(Estudiante estudiante) {
        for(Estudiante _estudiante : estudiantes)
            if(_estudiante == estudiante) return true;

        return false;
    }

    public boolean existeCurso(Curso curso) {
        for(Curso _curso : cursos)
            if(_curso == curso) return true;

        return false;
    }
    // Constructores
    public Carrera() {
    }

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
