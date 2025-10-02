package edu.actividad2;

public class App {
    public static void main(String[] args) {
        String nombre = "Alan Ayala";
        double[] califs = {95, 88, 92, 85, 90};

        StudentGrader alumno = new StudentGrader(nombre, califs);

        double promedio = StudentGrader.calcularPromedio(alumno.getCalificaciones());
        char califFinal = StudentGrader.obtenerCalificacionFinal(promedio);

        StudentGrader.imprimirReporte(alumno.getNombre(), alumno.getCalificaciones(), promedio, califFinal);
    }
}
