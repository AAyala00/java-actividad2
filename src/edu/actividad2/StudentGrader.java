package edu.actividad2;

public class StudentGrader {

    // Atributos requeridos
    private String nombre; // Nombre del estudiante
    private double[] calificaciones; // Arreglo de calificaciones 5 valores numericos

    public StudentGrader(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public static double calcularPromedio(double[] calificaciones) {
        if (calificaciones == null || calificaciones.length != 5) {
            throw new IllegalArgumentException("El arreglo de calificaciones debe contener exactamente 5 valores.");
        }
        double suma = 0;
        for (double c : calificaciones) suma += c;
        return suma / calificaciones.length;
    }

    public static char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) return 'F';
        else if (promedio >= 51 && promedio <= 60) return 'E';
        else if (promedio >= 61 && promedio <= 70) return 'D';
        else if (promedio >= 71 && promedio <= 80) return 'C';
        else if (promedio >= 81 && promedio <= 90) return 'B';
        else return 'A';
    }

    public static void imprimirReporte(String nombre, double[] calificaciones, double promedio, char califFinal) {
      if (calificaciones == null || calificaciones.length != 5) {
            throw new IllegalArgumentException("Se requieren exactamente 5 calificaciones.");
        }
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println(String.format("Promedio: %.2f", promedio));
        System.out.println("Calificación: " + califFinal);
    }
    
    public String getNombre() { return nombre; }
    public double[] getCalificaciones() { return calificaciones; }
}