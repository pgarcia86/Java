/*
Escribe un programa que cuente cuántas veces aparece cada carácter en una cadena
*/

import java.util.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {

        String cadena = "banana";
        String[] arrayCadena = cadena.split("");
        Arrays.sort(arrayCadena);
        Integer i = 0;
        String cadenaOrdenada = String.join("", arrayCadena);

        while(i < cadenaOrdenada.length()){
            System.out.println(cadenaOrdenada.charAt(i) + ": " + (cadenaOrdenada.lastIndexOf(cadenaOrdenada.charAt(i)) - i + 1));
            if(cadenaOrdenada.lastIndexOf(cadenaOrdenada.charAt(i)) == cadenaOrdenada.length()){
                i = cadenaOrdenada.length();
            }
            else{
                i = cadenaOrdenada.lastIndexOf(cadenaOrdenada.charAt(i)) + 1;
            }
        }
    }
}
