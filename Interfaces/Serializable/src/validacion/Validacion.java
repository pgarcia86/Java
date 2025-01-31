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

    public String setFile(){
        return getInput("Ingrese el numero de  legajo del empleado - La letra q para salir", input -> {
            if(input.isEmpty()){
                scanner.nextLine();
                throw new IllegalArgumentException("No ingresaste un numero de legajo valido");
            } return input;
        }, "No ingresaste un legajo valido");
    }

    public String setName(){
        return getInput("Ingrese el nombre del empleado", input -> {
            if(input.trim().isEmpty() || input.matches(".*\\d.*")){
                scanner.nextLine();
                throw new IllegalArgumentException("No ingresaste un nombre valido");
            }
            return input;
        }, 
        "No ingresaste un nombre valido");
    }

    public double setSalary(){
        return getInput("Ingrese el salario del empleado", input -> {
            double price = Double.parseDouble(input);
            if(price <= 0){
                scanner.nextLine();
                throw new IllegalArgumentException("No se puede ingresar un salario negativo");
            } return price;
        }, 
        "No ingresaste un numero");
    }

    public int setAge(){
        return getInput("Ingrese la edad del empleado", input -> {
            int qtty = Integer.parseInt(input);
            if(qtty <= 0){
                scanner.nextLine();
                throw new IllegalArgumentException("No se puede ingresar una edad negativa");
            } return qtty;
        }, 
        
        "No ingresaste un numero");
    }

    public int validOption(){
        int option = -1;
        if(scanner.hasNextInt()){
            option = scanner.nextInt();
            if(option >= 0 && option <= 4){
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
