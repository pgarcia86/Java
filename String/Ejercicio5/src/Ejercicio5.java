/*
Escribe un programa que reemplace todos los caracteres específicos por otro.
*/

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        String cadena = "Esta es una cadena";
        String reemplazo = "@";
        String aReemplazar = "e";
        cadena = cadena.toLowerCase().replace(aReemplazar, reemplazo);
        System.out.println(cadena);
    }
}
