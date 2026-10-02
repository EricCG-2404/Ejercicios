package Recursividad;
public class recorrerunString {
    public static String invertirCadena(String texto) {
// Caso base: si la cadena está vacía o tiene un solo carácter
        if (texto.isEmpty()) {
            return texto;
        }
// Llamada recursiva: toma el resto de la cadena y concatena el primer carácter al final
        return invertirCadena(texto.substring(1)) + texto.charAt(0);
    }

    public static void main(String[] args) {
        String texto = "Yo no lo descargo por que ya lo tengo DX";
        System.out.println("Texto original: " + texto);
        System.out.println("Texto al revés: " + invertirCadena(texto)); 
    }
}
// Resultado: DX otneg ol ay euq rofardcnes lo on oY