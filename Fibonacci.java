package Recursividad;

public class Fibonacci {
    public static int fibonacci(int n) {
// Casos base: F(0) = 0, F(1) = 1
        if (n <= 1) {
            return n;
        }
// Llamada recursiva: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int posicion = 7;
        System.out.println("El término " + posicion + " de Fibonacci es: " + fibonacci(posicion)); 
    }
}
// Resultado: 13 (Secuencia: 0, 1, 1, 2, 3, 5, 8, 13...)