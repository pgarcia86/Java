package calculadora;
import java.util.Scanner;

public class Calculadora {

    static Scanner scanner = new Scanner(System.in);

    public Calculadora(){

    }

    public void iniciar(){
        String ingreso = "";
        do{
            System.out.println("Ingrese la opcion deseada: \n" + 
            "1) SUMAR\n" + 
            "2) RESTAR\n" + 
            "3) MULTIPLICAR\n" + 
            "4) DIVIDIR\n" +
            "0) SALIR");
            ingreso = scanner.nextLine();
            if(chequeoEntrada(ingreso)){
                operacionElegida(Integer.parseInt(ingreso));
            }
        } while(!ingreso.equals("0"));
        System.out.println("Muchas gracias\n" + 
        "Saliendo del programa");
    }
    
    public boolean chequeoEntrada(String ingreso){
        try{
            Integer.parseInt(ingreso);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("No se ingreso un numero");
            return false;
        }
    }

    public void operacionElegida(int opcion){
        switch (opcion) {
            case 0:
                System.out.println("Muchas gracias!\n" + 
                    "Programa terminado");
                break;
            case 1:
                System.out.println(sumar());
                break;
            case 2:
                System.out.println(restar());
                break;
            case 3:
                System.out.println(multiplicar());
                break;
            case 4:
                System.out.println(dividir());
                break;
            default:
                System.out.println("No ingresaste una opcion valida");
                break;
        }
    }

    public int entradaNumero(){
        String numero = "";
        do{
            System.out.println("\nIngresa un numero: ");
            numero = scanner.nextLine();
        }while(!chequeoEntrada(numero));
        return Integer.parseInt(numero);
    }

    public String sumar(){
        System.out.println("Vas a sumar dos numeros");
        int num1 = entradaNumero();
        int num2 = entradaNumero();
        return "La suma entre " + num1 + " y " + num2 + " es igual a: " + (num1+num2);
    }

    public String restar(){
        System.out.println("Vas a restar dos numeros");
        int num1 = entradaNumero();
        int num2 = entradaNumero();
        return "La resta entre " + num1 + " y " + num2 + " es igual a: " + (num1-num2);
    }

    public String multiplicar(){
        System.out.println("Vas a multiplicar dos numeros");
        int num1 = entradaNumero();
        int num2 = entradaNumero();
        return "La multiplicacion entre " + num1 + " y " + num2 + " es igual a: " + (num1*num2);
    }

    public String dividir(){
        System.out.println("Vas a dividir dos numeros");
        int num1 = entradaNumero();
        int num2 = entradaNumero();
  
        try{
            return "La division entre " + num1 + " y " + num2 + " es igual a: " + (num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
            return "No se pudo hacer la division";
        }
    }
}
