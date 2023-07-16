package com.dani;

public class Main {
    public static void main(String[] args) {
        Carrera informatica = new Carrera("Informatica");

        Curso sec50 = new Curso("Sección 50");
        informatica.agregarCurso(sec50);

        Asignatura progAvanzada = new Asignatura("Programación Avanzada");
        sec50.agregarAsignatura(progAvanzada);

        Profesor ivan = new Profesor("Iván");
        sec50.agregarProfesor(ivan, progAvanzada);

        Estudiante daniel = new Estudiante("Daniel");
        informatica.agregarEstudiante(daniel);

        // Chequeo
        System.out.println(informatica.getCursos());
        System.out.println(informatica.getEstudiantes());

        System.out.println(sec50.getAsignaturas());
        System.out.println(sec50.getEstudiantes());
        System.out.println(sec50.getProfesores());

        System.out.println(progAvanzada.getProfesor());
        System.out.println(progAvanzada.getEstudiantes());

        /*
        Requerimientos:
        - Crear 5 estudiantes y generar notas al azar para cada asignatura
        - Promediar notas del estudiante en cada asignatura y en general
        - Mostrar notas y promedio en cada asignatura y en general
        - Usar herencia

        Pasos:
        - Crear clases
        - Crear constructores adecuados a la necesidad del problema
        - Crear getters y setters necesarios
        - Hacer pruebas con lo que tenemos hasta ahora
        - Crear funciones que se adecuen a los requerimientos
        - Probar funciones creadas
        - Adecuar funciones de utilidad como estáticas

        Vamos a necesitar:
        - Crear carreras

        - Crear cursos
        - Asignar cursos a las carreras

        - Crear asignaturas
        - Asignar asignaturas a los cursos

        - Crear profesores
        - Asignar profesores a las asignaturas

        - Crear estudiantes
        - Asignar estudiantes a las carreras

        Contemplar:
        - Al asignar un estudiante a una carrera a este se le debe agregar a un curso aleatorio
        - Al asignar un estudiante a un curso a este estudiante se le deben asignar todas las asignaturas del curso
        - Al asignar una asignatura al estudiante deben crearse la cantidad de notas de la asignatura en la nota minima
         */
    }
}