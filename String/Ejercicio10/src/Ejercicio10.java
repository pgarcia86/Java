/*
Encuentra el primer carácter único en una cadena (que no se repite)
*/

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {

        String cadena = "antibiotico";
        Integer i = 0;

        while (i < cadena.length()) {            
            if(i == cadena.lastIndexOf(cadena.charAt(i))){
                System.out.println(cadena.charAt(i));
                break;
            }
            else{
                i++;
            }
        }
    }
}
