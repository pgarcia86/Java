/*
Escribe un programa que cuente cuántas veces aparece cada carácter en una cadena
*/

import java.util.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {

        String cadena = "banana";
        String[] arrayCadena = cadena.split("");
        System.out.println(Arrays.toString(arrayCadena));

    }
}
