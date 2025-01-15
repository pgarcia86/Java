/*
    Escribe un programa que ordene alfabéticamente las palabras de una cadena
*/

import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {

        String cadena = "Esta es una cadena de texto que va a ser ordenada";
        String[] arrayCadena = cadena.toLowerCase().split(" ");
        Arrays.sort(arrayCadena);
        String cadenaOrdenada = String.join(" ", arrayCadena);

        System.out.println(cadenaOrdenada);
    }
}
