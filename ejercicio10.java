package Ejercicios;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Calificación parcial 1: ");
        double p1 = scanner.nextDouble();
        System.out.print("Calificación parcial 2: ");
        double p2 = scanner.nextDouble();
        System.out.print("Calificación parcial 3: ");
        double p3 = scanner.nextDouble();
        System.out.print("Calificación parcial 4: ");
        double p4 = scanner.nextDouble();
        System.out.print("Calificación parcial 5: ");
        double p5 = scanner.nextDouble();

        System.out.print("Calificación del examen final: ");
        double examenFinal = scanner.nextDouble();
        System.out.print("Calificación del trabajo final: ");
        double trabajoFinal = scanner.nextDouble();

        double promedioParciales = (p1 + p2 + p3) / 3;
        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.printf("La calificación final en Algoritmos es: %.2f\n", calificacionFinal);
    }
}