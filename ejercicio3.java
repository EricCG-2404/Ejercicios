package Ejercicios;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer cateto (a): ");
        double a = scanner.nextDouble();
        System.out.print("Ingresa el segundo cateto (b): ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("La hipotenusa es: %.2f\n", c);
    }
}