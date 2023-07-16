package com.dani;

import java.util.ArrayList;

public class Estudiante extends Persona {
    private Carrera carrera;
    private Curso curso;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private ArrayList<Nota> notas = new ArrayList<>();
}