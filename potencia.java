package Recursividad;

public class potencia {
    public static int potencia(int base, int exponente) {
        // Caso base: todo número elevado a la 0 es 1
        if (exponente == 0) {
            return 1;
        }
        // Llamada recursiva
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exp = 4;
        System.out.println(base + " elevado a " + exp + " es: " + potencia(base, exp)); 
    }
}
 // Resultado: 16 (2 * 2 * 2 * 2)