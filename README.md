# Instrucciones

1. Asuma un curso de 5 estudiantes, escriba un método que genere notas al azar, y las asigne a cada estudiante para una de sus asignaturas.

2. Escriba un método que promedie las notas de cada estudiante, para esta asignatura.

3. Escriba un método que muestre el detalle de las notas de los estudiantes, y su promedio. Considere que cada método debe ser correctamente identificado con la Clase que lo debe desplegar, y que la herencia es un elemento a evaluar.

> Salida del programa, usando utilidades para generar y promediar notas:

```
---------------------------------------------
Carrera: Informatica
Cantidad de estudiantes: 5
---------------------------------------------
Estudiante: Jaime
Promedio General: 3.3
Asignatura(s):
  + Programación Avanzada
    - Notas: [ 4.9 | 2.9 | 2.6 | 2.5 | 2.4 ]
    - Promedio: 3.1
  + Matemática
    - Notas: [ 3.2 | 3.3 | 4.3 ]
    - Promedio: 3.6
---------------------------------------------
Estudiante: Matias
Promedio General: 3.1
Asignatura(s):
  + Programación Avanzada
    - Notas: [ 6.2 | 3.2 | 1.4 | 3.0 | 5.5 ]
    - Promedio: 3.9
  + Matemática
    - Notas: [ 2.4 | 2.1 | 2.4 ]
    - Promedio: 2.3
---------------------------------------------
Estudiante: Daniel
Promedio General: 4.6
Asignatura(s):
  + Programación Avanzada
    - Notas: [ 1.2 | 5.5 | 5.9 | 6.4 | 1.6 ]
    - Promedio: 4.1
  + Matemática
    - Notas: [ 4.9 | 6.6 | 3.8 ]
    - Promedio: 5.1
---------------------------------------------
Estudiante: Claudia
Promedio General: 3.6
Asignatura(s):
  + Programación Avanzada
    - Notas: [ 2.1 | 4.8 | 5.7 | 4.7 | 3.7 ]
    - Promedio: 4.2
  + Matemática
    - Notas: [ 1.8 | 5.1 | 2.1 ]
    - Promedio: 3.0
---------------------------------------------
Estudiante: Carolina
Promedio General: 3.8
Asignatura(s):
  + Programación Avanzada
    - Notas: [ 3.3 | 6.8 | 5.3 | 2.5 | 3.2 ]
    - Promedio: 4.2
  + Matemática
    - Notas: [ 3.4 | 4.8 | 2.3 ]
    - Promedio: 3.5
```

### UML Proyecto:

**Simbolo** | **Definición**
:-:|:-:
`-` | privado
`+` | publico
`$` | estatico

```mermaid
---
title: Estructura del proyecto
---
classDiagram
class Persona {
 -String nombre

	+Persona()
	+Persona(String nombre)

	+getNombre() String
	+setNombre(String nombre)
}

class Estudiante {
  -Carrera carrera;
  -ArrayList~Asignatura~ asignaturas
  -ArrayList~Nota~ notas

	+Estudiante(Carrera carrera)

	+agregarAsignatura(Asignatura asignatura)
	+existeAsignatura(Asignatura asignatura) boolean
    
	+generarNotas()

  +imprimirDatos()
	+imprimirNotasAsignatura(Asignatura asignatura)
	+imprimirPromedioGeneral()

	+getAsignaturas() ArrayList
	+getCarrera() Carrera
	+getNotas() ArrayList
  +getPromedioAsignatura(Asignatura asignatura) float

	+setCarrera(Carrera carrera)
}

class Nota {
  -float nota
  -Asignatura asignatura

  +float NOTA_MIN$
	+float NOTA_MAX$

	+Nota()
	+Nota(Asignatura asignatura)
	+Nota(float nota)
	+Nota(float nota, Asignatura asignatura)
    
	+getNota() float
  +getAsignatura() Asignatura
	
  +setNota(arg0:float)
	+setAsignatura(arg0:Asignatura)
}

class Profesor {
    -Asignatura asignatura

	+Profesor(Asignatura asignatura)

	+getAsignatura() Asignatura
	+setAsignatura(Asignatura asignatura)
}

class Carrera {
  -String nombre;
  -ArrayList~Estudiante~ estudiantes
  -ArrayList~Asignatura~ asignaturas

	+Carrera()
	+Carrera(arg0:String)

	+agregarAsignatura(Asignatura asignatura)
	+agregarEstudiante(Estudiante estudiante)

	+existeAsignatura(Asignatura asignatura) boolean
	+existeEstudiante(Estudiante estudiante) boolean

	+generarNotas()

	+getAsignaturas() ArrayList~Asignatura~
	+getEstudiantes() ArrayList
	+getNombre() String
	+imprimirEstudiantes()
	+setAsignaturas(ArrayList~Asignatura~ asignaturas)
	+setEstudiantes(ArrayList~Estudiante~ estudiantes)
	+setNombre(String nombre)
}

class Asignatura {
  -String nombre;
  -Profesor profesor;
  -int cantidadEvaluaciones
  -ArrayList~Estudiante~ estudiantes

	+Asignatura()
	
  +Asignatura(String nombre)
	+Asignatura(String nombre, int cantidadEvaluaciones)

	+agregarEstudiante(Estudiante estudiante)

	+existeEstudiante(Estudiante estudiante) boolean
	
  +getCantidadEvaluaciones() int
	+getEstudiantes() ArrayList
	+getNombre() String
	+getProfesor() Profesor
	
  +setCantidadEvaluaciones(int cantidad)
	+setNombre(String nombre)
	+setProfesor(Profesor profesor)
}

class Utilidades {
	+Utilidades()

	+generarNota(float min, float max)$ float
	+promediar(float total, int cantidad)$ float
}

Estudiante "1" --> "1" Nota : utiliza

Carrera --|> Asignatura

Profesor --|> Asignatura

Persona --|> Estudiante
Persona --|> Profesor

Utilidades --|> Carrera
```
