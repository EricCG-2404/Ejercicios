package Ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa los grados Fahrenheit: ");
        double f = scanner.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.printf("%.2f°F equivalen a %.2f°C\n", f, c);
    }
}