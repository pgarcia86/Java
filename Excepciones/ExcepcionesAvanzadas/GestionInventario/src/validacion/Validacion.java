package validacion;

import java.util.Scanner;
import java.util.function.Function;

public class Validacion {

    Scanner scanner;

    public Validacion(){
        scanner = new Scanner(System.in);
    }


    public <T> T getInput(String message, Function<String, T> parser, String errorMessage){
        T value = null;
        boolean isValid = false;
        do{
            try{
                System.out.println(message);
                String input = scanner.nextLine();
                value = parser.apply(input);
                isValid = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }while(!isValid);
        return value;
    }

    public String setName(){
        return getInput("Ingrese el nombre del producto - La letra q para salir", input -> {
            if(input.trim().isEmpty() || input.matches(".*\\d.*")){
                scanner.nextLine();
                throw new IllegalArgumentException("No ingresaste un nombre valido");
            }
            return input;
        }, 
        "No ingresaste un nombre valido");
    }

    public double setPrice(){
        return getInput("Ingrese el precio del producto", input -> {
            double price = Double.parseDouble(input);
            if(price <= 0){
                scanner.nextLine();
                throw new IllegalArgumentException("No se puede ingresar un precio negativo");
            } return price;
        }, 
        "No ingresaste un numero");
    }

    public int setQtty(){
        return getInput("Ingrese la cantidad del producto", input -> {
            int qtty = Integer.parseInt(input);
            if(qtty <= 0){
                scanner.nextLine();
                throw new IllegalArgumentException("No se puede ingresar una cantidad negativa");
            } return qtty;
        }, 
        
        "No ingresaste un numero");
    }

    public int validOption(){
        int option = -1;
        if(scanner.hasNextInt()){
            option = scanner.nextInt();
            if(option >= 0 && option <= 5){
                return option;
            }else{
                scanner.nextLine();
                throw new IllegalArgumentException("La opcion ingresada no es valida");
            }
        }else{
            scanner.nextLine();
            throw new IllegalArgumentException("La opcion ingresada no es valida");
        }
    }

}
