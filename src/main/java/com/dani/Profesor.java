package com.dani;

public class Profesor extends Persona {
    private Asignatura asignatura;

    // Constructores
    public Profesor() {
    }
    public Profesor(String nombre) {
        super(nombre);
    }

    public Profesor(Asignatura asignatura) {
        this.asignatura = asignatura;
    }


    // Getters & Setters
    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}