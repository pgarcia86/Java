/*
Escribe un programa que cuente el número de palabras en una cadena
*/

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {

        String cadena = "Java es un lenguaje divertido";
        String[] arrayCadena = cadena.split(" ");

        System.out.println("La cadena tiene " + arrayCadena.length + " palabras");

    }
}
