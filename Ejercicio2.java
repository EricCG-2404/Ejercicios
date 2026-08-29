import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double Iva = 0.21;
        System.out.print("Ingrese un numero: ");
        double precio = Double.parseDouble(scanner.nextLine());
        double precioFinal = precio + (precio * Iva);
        System.out.println("El precio es " + precioFinal);
        scanner.close();
    }
}