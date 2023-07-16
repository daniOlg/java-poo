package com.dani;

public class Profesor extends Persona {
    private Asignatura asignatura;

    public Profesor() {
    }
    public Profesor(String nombre) {
        super(nombre);
    }

    public Profesor(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}