import java.util.Scanner;

public class arreglo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {5, 4, 8, 6, 3, 100, 7, 10, 9, 1};

        System.out.print("Introduce el número que deseas buscar: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " SÍ se encuentra dentro del arreglo.");
        } else {
            System.out.println("El número " + numeroBuscado + " NO se encuentra dentro del arreglo.");
        }

        scanner.close();
    }
}