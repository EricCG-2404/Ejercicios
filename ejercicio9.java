package Ejercicios;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor total de la compra: ");
        double totalCompra = scanner.nextDouble();

        double descuento = totalCompra * 0.15;
        double totalPagar = totalCompra - descuento;

        System.out.printf("Descuento aplicado (15%%): $%.2f\n", descuento);
        System.out.printf("Total a pagar: $%.2f\n", totalPagar);
    }
}