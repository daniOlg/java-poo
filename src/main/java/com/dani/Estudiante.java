package com.dani;

import java.util.ArrayList;

public class Estudiante extends Persona {
    private Carrera carrera;
    private Curso curso;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private ArrayList<Nota> notas = new ArrayList<>();

    // Funciones
    public void agregarAsignatura(Asignatura asignatura) {
        if(existeAsignatura(asignatura)) return;

        asignaturas.add(asignatura);
    }

    public boolean existeAsignatura(Asignatura asignatura) {
        for(Asignatura _asignatura : asignaturas) {
            if(_asignatura == asignatura) return true;
        }

        return false;
    }

    // Constructores
    public Estudiante() {
    }

    public Estudiante(String nombre) {
        super(nombre);
    }

    public Estudiante(Carrera carrera) {
        this.carrera = carrera;
    }

    // Getters & Setters

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }
}