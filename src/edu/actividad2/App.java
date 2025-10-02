package edu.actividad2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nombre = "Alan Ayala";
        double[] califs = {95, 88, 92, 85, 90};

        StudentGrader alumno = new StudentGrader(nombre, califs);

        double promedio = StudentGrader.calcularPromedio(alumno.getCalificaciones());
        char califFinal = StudentGrader.obtenerCalificacionFinal(promedio);

        StudentGrader.imprimirReporte(alumno.getNombre(), alumno.getCalificaciones(), promedio, califFinal);

        System.out.println();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Captura de datos ===");

            // Nombre
            String nombreManual = leerNombre(sc, "Ingresa el nombre del estudiante: ");

            // 5 calificaciones
            double[] califsManual = new double[5];
            for (int i = 0; i < 5; i++) {
                califsManual[i] = leerCalificacion(sc, "Calificación " + (i + 1) + " (0 a 100): ");
            }

            StudentGrader alumnoManual = new StudentGrader(nombreManual, califsManual);
            double promedioManual = StudentGrader.calcularPromedio(alumnoManual.getCalificaciones());
            char califFinalManual = StudentGrader.obtenerCalificacionFinal(promedioManual);

            System.out.println();
            System.out.println("=== Resultado con tus datos ===");
            StudentGrader.imprimirReporte(alumnoManual.getNombre(), alumnoManual.getCalificaciones(), promedioManual, califFinalManual);
        }
    }

     private static String leerNombre(Scanner sc, String prompt) {
        String nombre;
        while (true) {
            System.out.print(prompt);
            nombre = sc.nextLine();
            if (nombre != null && !nombre.trim().isEmpty()) {
                return nombre.trim();
            }
            System.out.println("El nombre no puede estar vacío. Intenta de nuevo.");
        }
    }

    private static double leerCalificacion(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = sc.nextLine().trim();

            entrada = entrada.replace(',', '.');

            try {
                double valor = Double.parseDouble(entrada);
                if (valor >= 0 && valor <= 100) {
                    return valor;
                } else {
                    System.out.println("La calificación debe estar entre 0 y 100.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Entrada inválida. Escribe un número (ej. 85 o 92.5).");
            }
        }
    }
}

