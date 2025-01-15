/*
Escribe un programa que divida una cadena en palabras y las imprima por separado
*/

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        String cadena = "Esta es una cadena impresa por palabras";

        String[] arrayCadena = cadena.split(" ");

        for(Integer i = 0; i < arrayCadena.length; i++){
            System.out.println(arrayCadena[i]);
        }
    }
}
