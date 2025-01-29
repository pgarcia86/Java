package validacion;

import java.util.ArrayList;
import java.util.List;
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

    public ArrayList<String> setText(){
        return getInput("Ingrese el texto - La letra q para salir", input -> {
            if(input.isEmpty() || input.matches(".*\\d.*")){
                scanner.nextLine();
                throw new IllegalArgumentException("No ingresaste un nombre valido");
            }
            return new ArrayList<>(List.of(input.split(" ")));
        }, 
        "No ingresaste un nombre valido");
    }
}
