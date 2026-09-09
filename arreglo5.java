public class arreglo5 {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 19, 4, 22, 15, 8, 3, 11, 40};

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
