package com.dani;

import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();

    // Funciones para los requerimientos
    public void generarNotas() {
        for(Estudiante _estudiante : estudiantes) {
            _estudiante.generarNotas();
        }
    }
    public void imprimirEstudiantes() {
        System.out.println("Carrera: " + nombre);
        System.out.println("Cantidad de estudiantes: " + estudiantes.size());
        for(Estudiante _estudiante : estudiantes) {
            _estudiante.imprimirDatos();
        }
    }

    // Funciones
    public void agregarEstudiante(Estudiante estudiante) {
        if(existeEstudiante(estudiante)) return; //TODO: Log
        estudiantes.add(estudiante);

        for(Asignatura _asignatura : asignaturas) {
            _asignatura.agregarEstudiante(estudiante);
        }
    }

    public void agregarAsignatura(Asignatura asignatura) {
        if(existeAsignatura(asignatura)) return; //TODO: log
        asignaturas.add(asignatura);
    }

    public boolean existeEstudiante(Estudiante estudiante) {
        for(Estudiante _estudiante : estudiantes)
            if(_estudiante == estudiante) return true;

        return false;
    }

    public boolean existeAsignatura(Asignatura asignatura) {
        for(Asignatura _asignatura : asignaturas)
            if(_asignatura == asignatura) return true;

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

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
