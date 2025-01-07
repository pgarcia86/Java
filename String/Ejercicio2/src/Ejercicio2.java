/*
Definir una string a con la cadena «Esto es una string»; definir la string b con la cadena «Y esto también».

Comparar las dos strings y decir si son iguales
crear la string «c» con la concatenación de a y b
crear la string «d» con la concatenacion de a y b otra vez
Comparar las string c y d y decir si son iguales
indicar cuantos caracteres tiene cada una de las strings
Copiar la string a en la string b
Utilizar replace, para modificar la string a
Presentar en consola el contenido de la string a y de la string b. 
*/

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {

        String cadena1 = "Esto es una string";
        String cadena2 = "Y esto tambien";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        boolean equals = cadena1.compareToIgnoreCase(cadena2) == 0;

        System.out.println("La cadena 1 y la cadena 2 son iguales? " + equals);

        String cadena3 = cadena1 + " " + cadena2;
        String cadena4 = cadena1 + " " + cadena2;
        System.out.println("Cadena 3: " + cadena3);
        System.out.println("Cadena 4: " + cadena4);

        boolean newEquals = cadena3.compareToIgnoreCase(cadena4) == 0;
        System.out.println("La cadena 3 y la cadena 4 son iguales? " + newEquals);

        System.out.println("La cadena 1 tiene un largo de " + cadena1.length() + " letras");
        System.out.println("La cadena 2 tiene un largo de " + cadena2.length() + " letras");
        System.out.println("La cadena 3 tiene un largo de " + cadena3.length() + " letras");
        System.out.println("La cadena 4 tiene un largo de " + cadena4.length() + " letras");

        cadena2 = cadena1;
        cadena1 = cadena1.toLowerCase().replace('s', 'r');

        System.out.println(cadena1);
        System.out.println(cadena2);

    }
}
