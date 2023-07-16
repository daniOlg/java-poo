package com.dani;

public class Nota {
    private float nota;
    private Asignatura asignatura;
    public static final float NOTA_MIN = 1.0f;
    public static final float NOTA_MAX = 7.0f;

    // Constructores
    public Nota() {

    }

    public Nota(float nota) {
        this.nota = nota;
    }

    public Nota(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Nota(float nota, Asignatura asignatura) {
        this.nota = nota;
        this.asignatura = asignatura;
    }

    // Getters & Setters

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
