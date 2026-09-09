 public class arreglo {
    public static void main(String[] args) {

 int[] arreglo = {1,2,3,4,5};
        for (int i1 = 0; i1 < arreglo.length; i1++) {
            if (arreglo[i1] % 2 == 0) {
                System.out.println(arreglo[i1]);
            }
        }
    }
}