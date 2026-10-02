package Recursividad;
public class sumdeNumeros {
    public static int sumarHastaN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumarHastaN(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma del 1 al " + n + " es: " + sumarHastaN(n)); 
    }
}
// Resultado: 15 (1 + 2 + 3 + 4 + 5)




