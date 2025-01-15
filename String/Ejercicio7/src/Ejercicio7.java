/*
Escribe un programa que invierta el orden de las palabras en una cadena.
*/

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        String cadena = "Esta es una cadena que va a ser dada vuelta palabra a palabra";
        String[] arrayCadena = cadena.split(" ");

        for(Integer i = arrayCadena.length - 1; i >= 0; i--){
            System.out.print(arrayCadena[i] + " ");
        }
    }
}