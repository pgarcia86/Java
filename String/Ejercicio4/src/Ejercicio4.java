/* 
Escribe un programa que verifique si una cadena contiene una subcadena específica.
*/

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        String cadena = "Programacion";
        String busqueda = "grama";

        if(cadena.toLowerCase().contains(busqueda.toLowerCase())){
            System.out.println("Contiene la subcadena");
        }
        else{
            System.out.println("No contiene la subcadena");
        }
    }
}
