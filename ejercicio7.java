package Ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de minutos: ");
        int minutosTotales = scanner.nextInt();

        int horas = minutosTotales / 60;
        int minutosRestantes = minutosTotales % 60;

        System.out.println(minutosTotales + " minutos equivalen a " + horas + " horas y " + minutosRestantes + " minutos.");
    }
}