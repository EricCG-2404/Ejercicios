package Ejercicios;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el sueldo base: ");
        double sueldoBase = scanner.nextDouble();
        System.out.print("Monto de la primera venta: ");
        double v1 = scanner.nextDouble();
        System.out.print("Monto de la segunda venta: ");
        double v2 = scanner.nextDouble();
        System.out.print("Monto de la tercera venta: ");
        double v3 = scanner.nextDouble();

        double comisiones = (v1 + v2 + v3) * 0.10;
        double totalMes = sueldoBase + comisiones;

        System.out.printf("Ganancia por comisiones: $%.2f\n", comisiones);
        System.out.printf("Sueldo total del mes: $%.2f\n", totalMes);
    }
}