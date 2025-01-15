/*
Escribe un programa que determine si una 
cadena es un palíndromo (se lee igual al derecho y al revés)
 */

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        
        String cadena = "anilina";
        String[] arrayCadena = cadena.toLowerCase().split("");                //convierto el String en un array
        Integer largoArray = arrayCadena.length;
        Integer i = 0;
        boolean flag = false;
        Integer j = largoArray - 1;
        while(i < largoArray/2){
            if(arrayCadena[i].equals(arrayCadena[j])){
                j--;
                i++;
                flag = true;
            }
            else{
                System.out.println("No es palindromo");
                break;
            }
        }
        if(flag){ 
            System.out.println("Es un palindromo");
        }
    }
}        

