/*
1-Cargar una string con la cadena «Siempre se puede aprender java»:

Contar el numero de letras que tiene
Contar el numero de palabras
Contar el numero de «a»
Presentarla en consola invertida palabra a palabra
Presentarla en consola invertida letra a letra 
*/

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        String cadena = "Siempre se puede aprender java";

        Integer cantChars = cadena.length();
        Integer cantWords = cadena.split(" ").length;
        Integer cantLetra = 0;
        Integer posicion = cadena.indexOf('a');
        String alrevesLetras = "";
        String [] palabras = cadena.split(" ");
        String alrevesPalabras = "";

        while (posicion != -1){

            cantLetra ++;
            posicion = cadena.indexOf('a', posicion + 1);
        }

        Integer pos = cadena.length() - 1;

        while(pos >= 0){
            alrevesLetras += cadena.charAt(pos);
            pos --;
        }
        
        pos = palabras.length - 1;

        while (pos >= 0){
            if(pos > 0){
                alrevesPalabras += palabras[pos] + " ";
            }
            else{
                alrevesPalabras += palabras[pos];
            }
            pos --;
        }
        System.out.println("La cadena tiene " + cantChars + " caracteres");
        System.out.println("La cadena tiene " + cantWords + " palabras");
        System.out.println("La cadena tiene " + cantLetra + " aes");
        System.out.println("La cadena alreves letra por letra es: " + alrevesLetras);
        System.out.println("La cadena alreves palabra por palabra es: " + alrevesPalabras);
        
    }
}
