package calculadora;
import java.util.Scanner;

public class Calculadora {

    static Scanner scanner = new Scanner(System.in);

    public Calculadora(){

    }

    public void iniciar(){
        int ingresoEnNumero;
        do{
            System.out.println("Ingrese la opcion deseada: \n" + 
            "1) SUMAR\n" + 
            "2) RESTAR\n" + 
            "3) MULTIPLICAR\n" + 
            "4) DIVIDIR\n" +
            "0) SALIR");
            ingresoEnNumero = chequeoEntrada();
            operacionElegida(ingresoEnNumero);
        } while(ingresoEnNumero != 0);
        System.out.println("Muchas gracias\n" + 
        "Saliendo del programa");
    }
    
    public int chequeoEntrada(){
        String ingreso = scanner.nextLine();
        int entradaEnNumero = -1;
        try{
            entradaEnNumero = Integer.parseInt(ingreso);
        }
        catch(NumberFormatException e){
            System.out.println("No se ingreso un numero");
        }
        return entradaEnNumero;
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


    public String sumar(){
        System.out.println("Vas a sumar dos numeros" + 
            "\nIngresa el primero: ");
        int num1 = chequeoEntrada();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = chequeoEntrada();
        return "La suma entre " + num1 + " y " + num2 + " es igual a: " + (num1+num2);
    }

    public String restar(){
        System.out.println("Vas a restar dos numeros" + 
            "\nIngresa el primero: ");
        int num1 = chequeoEntrada();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = chequeoEntrada();
        return "La resta entre " + num1 + " y " + num2 + " es igual a: " + (num1-num2);
    }

    public String multiplicar(){
        System.out.println("Vas a multiplicar dos numeros" + 
            "\nIngresa el primero: ");
        int num1 = chequeoEntrada();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = chequeoEntrada();
        return "La multiplicacion entre " + num1 + " y " + num2 + " es igual a: " + (num1*num2);
    }

    public String dividir(){
        System.out.println("Vas a dividir dos numeros" + 
            "\nIngresa el dividendo: ");
        int num1 = chequeoEntrada();
        System.out.println("Ingresa el divisor: ");
        int num2 = chequeoEntrada();
        try{
            return "La division entre " + num1 + " y " + num2 + " es igual a: " + (num1/num2);    
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
            return "No se pudo hacer la division";
        }
    }
}
