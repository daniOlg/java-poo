package com.dani;

import java.util.ArrayList;

public class Estudiante extends Persona {
    private Carrera carrera;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private ArrayList<Nota> notas = new ArrayList<>();

    // Funciones para requerimientos
    public void generarNotas() {
        for(Nota _nota : notas) {
            _nota.setNota(Utilidades.generarNota(Nota.NOTA_MIN, Nota.NOTA_MAX));
        }
    }
    public void imprimirDatos() {
        System.out.println("---------------------------------------------");

        System.out.println("Estudiante: " + nombre);

        imprimirPromedioGeneral();

        System.out.println("Asignatura(s):");
        for(Asignatura _asignatura : asignaturas) {
            imprimirNotasAsignatura(_asignatura);
        }
    }

    public void imprimirNotasAsignatura(Asignatura asignatura) {
        System.out.println("  + " + asignatura.getNombre());

        float total = 0f;

        System.out.print("    - Notas: [ ");
        int count = 0;
        for(Nota _nota : notas) {
            if(_nota.getAsignatura() == asignatura) {
                if(count++ != 0) System.out.print(" | ");
                System.out.print(_nota.getNota());

                total += _nota.getNota();
            }
        }
        System.out.println(" ]");
        System.out.println("    - Promedio: " + Utilidades.promediar(total, count));
    }

    public void imprimirPromedioGeneral() {
        float total = 0;

        int contador = 0;

        for(Asignatura _asignatura : asignaturas) {
            contador++;
            total += getPromedioAsignatura(_asignatura);
        }

        System.out.println("Promedio General: " + Utilidades.promediar(total, contador));
    }

    public float getPromedioAsignatura(Asignatura asignatura) {
        float total = 0f;
        int count = 0;

        for(Nota _nota : notas) {
            if(_nota.getAsignatura() == asignatura) {
                total += _nota.getNota();
                count++;
            }
        }

        return Utilidades.promediar(total, count);
    }

    // Funciones
    public void agregarAsignatura(Asignatura asignatura) {
        if(existeAsignatura(asignatura)) return; //TODO: Log
        asignaturas.add(asignatura);

        // Se agrega la cantidad de notas de la asignatura todas inicializadas en la nota minima
        for(int i = 0; i < asignatura.getCantidadEvaluaciones(); i++) {
            Nota nota = new Nota();

            nota.setNota(Nota.NOTA_MIN);
            nota.setAsignatura(asignatura);

            notas.add(nota);
        }
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

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }
}