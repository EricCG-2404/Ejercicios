import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero % 2 == 0) {
            System.out.println("Si es divisible.");
        } else {
            System.out.println("No es divisible.");
        }
        scanner.close();
    }
}