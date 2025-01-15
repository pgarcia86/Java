/*
    Encuentra la longitud de la palabra más larga en una cadena
*/

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {

        String cadena = "El lenguaje de programación Java";
        String[] arrayCadena = cadena.split(" ");
        ArrayList<Integer> largos = new ArrayList<Integer>();

        for(Integer i = 0; i < arrayCadena.length; i++){
            largos.add(arrayCadena[i].length());
        }
        Collections.sort(largos, Collections.reverseOrder());
        System.out.println(largos.get(0));
    }
}
