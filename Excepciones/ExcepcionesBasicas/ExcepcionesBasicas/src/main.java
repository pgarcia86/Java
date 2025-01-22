import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        Integer[] array = {5, 18, 32, 24, 14};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el divisor: ");
        int divisor = scanner.nextInt();
        System.out.println("Ingrese el dividendo:");
        int dividendo = scanner.nextInt();

        try{
            System.out.println("El resultado de la division es: " + divisor/dividendo);
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Operacion terminada");
        }
        scanner.nextLine();
        System.out.println("Ingrese una cadena. Puede ser texto o un numero:");
        String cadena = scanner.nextLine();
        
        try{
            System.out.println("Lo que ingreso es un numero. Es: " + Integer.parseInt(cadena));
        }
        catch(NumberFormatException e){
            System.out.println("No se ha ingresado un numero. Se ingreso: " + cadena);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Operacion terminada");
        }
        System.out.println("Ingresa el indice del Array al que quieres ingresar: ");
        int indice = scanner.nextInt();

        try{
            System.out.println("El elemento de ese indice es: " + array[indice]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("El indice ingresado esta fuera de los limites del array");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Operacion terminada");
        }
        scanner.close();
    }
}
