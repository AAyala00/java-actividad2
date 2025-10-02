# Actividad 2 – Métodos y Atributos (Java)

Aplicación sencilla en **Java** para calcular el promedio de cinco calificaciones y asignar una **calificación final** (A–F) según una tabla de rangos.

---

## Descripción

Este proyecto cumple con la **Actividad 2** del curso de Java:

- Clase `StudentGrader` con:
  - Atributos: `nombre` (String) y `calificaciones` (`double[]` de 5 elementos).
  - Métodos:
    - `calcularPromedio(double[])` → promedio de las cinco calificaciones.
    - `obtenerCalificacionFinal(double)` → letra A–F según el promedio.
    - `imprimirReporte(...)` → imprime resultados en el formato requerido.

- Clase `App` como punto de entrada:
  - Muestra un **ejemplo automático**.
  - Permite ingreso **interactivo** de nombre y calificaciones usando consola.

---

## Estructura del proyecto

```
src/
└─ edu/
   └─ actividad2/
      ├─ App.java
      └─ StudentGrader.java
```

---

## Requisitos

- Java 11 o superior (funciona también con Java 17+).
- Consola/terminal para ejecutar.

---

## Compilación y ejecución

Desde la raíz del repositorio:

```bash
# Compilar
javac src/edu/actividad2/*.java

# Ejecutar
java -cp src edu.actividad2.App
```

Salida esperada (ejemplo automático):
```
Nombre del estudiante: Alan Ayala
Calificación 1: 95.0
Calificación 2: 88.0
Calificación 3: 92.0
Calificación 4: 85.0
Calificación 5: 90.0
Promedio: 90.00
Calificación: B
```

Después podrás ingresar tus propios datos:

```
=== Captura de datos ===
Ingresa el nombre del estudiante: Juan Pérez
Calificación 1 (0 a 100): 80
Calificación 2 (0 a 100): 75
Calificación 3 (0 a 100): 90
Calificación 4 (0 a 100): 60
Calificación 5 (0 a 100): 85
```

---

## Validaciones

- Exige exactamente **5 calificaciones**.
- Cada calificación debe estar entre **0 y 100**.
- El nombre no puede quedar vacío.

---