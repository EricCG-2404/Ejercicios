public class arreglo3 {
    /*crea un areglo de 8 numeros y 
    determina cual es el numero mayor
     */
    public static void main(String[] args) {
        int[] arreglo3 = {1,2,3,4,5,6,7,8};
        int mayor = arreglo3[0];
        for (int i = 1; i < arreglo3.length; i++) {
            if (arreglo3[i] > mayor) {
                mayor = arreglo3[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }
    
}
