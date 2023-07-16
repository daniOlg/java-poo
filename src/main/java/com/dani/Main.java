package com.dani;

public class Main {
    public static void main(String[] args) {
        // Crear carreras
        Carrera informatica = new Carrera("Informatica");
        Carrera ciberseguridad = new Carrera("Ciberseguridad");
        Carrera redes = new Carrera("Redes");

        // Crear asignaturas
        Asignatura matematicas = new Asignatura("Matemática");
        Asignatura programacionAvanzada = new Asignatura("Programación Avanzada");
        Asignatura tallerComunicacion = new Asignatura("Taller de comunicación oral y escrita");

        // Crear profesores
        Profesor leslie = new Profesor("Leslie");
        Profesor ivan = new Profesor("Iván");
        Profesor monica = new Profesor("Monica");

        // Crear estudiantes
        Estudiante daniel = new Estudiante("Daniel");
        Estudiante matias = new Estudiante("Matias");
        Estudiante carolina = new Estudiante("Carolina");
        Estudiante jaime = new Estudiante("Jaime");
        Estudiante claudia = new Estudiante("Claudia");

        // Agregar asignaturas a las carreras
        informatica.agregarAsignatura(programacionAvanzada);
        informatica.agregarAsignatura(matematicas);

        ciberseguridad.agregarAsignatura(tallerComunicacion);
        ciberseguridad.agregarAsignatura(programacionAvanzada);

        redes.agregarAsignatura(matematicas);
        redes.agregarAsignatura(tallerComunicacion);

        // Establecer cantidad de evaluaciones de las diferentes asignaturas
        matematicas.setCantidadEvaluaciones(3);
        programacionAvanzada.setCantidadEvaluaciones(5);
        tallerComunicacion.setCantidadEvaluaciones(4);

        // Asignar profesores a cada asignatura
        matematicas.setProfesor(leslie);
        programacionAvanzada.setProfesor(ivan);
        tallerComunicacion.setProfesor(monica);

        /* * * * * * * * * *  REQUISITOS * * * * * * * * * */

        // Añadir 5 estudiantes a una carrera
        informatica.agregarEstudiante(jaime);
        informatica.agregarEstudiante(matias);
        informatica.agregarEstudiante(daniel);
        informatica.agregarEstudiante(claudia);
        informatica.agregarEstudiante(carolina);

        // Generar notas al azar
        informatica.generarNotas();

        // Promediar notas y mostrar detalles
        informatica.imprimirEstudiantes();

        // La herencia se utiliza en la clase Profesor y Estudiante ya que los dos heredan de Persona


        /*
        Requerimientos:
        - Crear 5 estudiantes y generar notas al azar para cada asignatura
        - Promediar notas del estudiante en cada asignatura y en general
        - Mostrar notas y promedio en cada asignatura y en general
        - Usar herencia

        Contemplar:
        - Al asignar un estudiante a una carrera a este se le debe agregar a un curso aleatorio
        - Al asignar un estudiante a un curso a este estudiante se le deben asignar todas las asignaturas del curso
        - Al asignar una asignatura al estudiante deben crearse la cantidad de notas de la asignatura en la nota minima
         */
    }
}