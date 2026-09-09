
public class arreglo2 {
    public static void main(String[] args)throws Exception{
        int[] arreglo2 = {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;
       
        for (int i = 0; i < arreglo2.length; i++) {
            suma += arreglo2[i];
        }
        double promedio = (double) suma / arreglo2.length;
        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);
        
    }
       
}


