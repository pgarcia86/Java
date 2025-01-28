package validaciones;

import java.util.Scanner;

import exception.NombreValidoException;
import exception.NotaInvalidaException;

public class Validacion {
    Scanner scanner;

    public Validacion(){
        scanner = new Scanner(System.in);
    }

    public String nombre(){
        boolean isValid = false;
        String name = "";
        do{
            try{
                System.out.println("Ingrese su nombre");
                name = nombreValido();
                isValid = true;
            } catch(NombreValidoException nve){
                System.out.println(nve.getMessage());
                isValid = false;
            }
        }while(!isValid);
        return name;
    }

    public String nombreValido() throws NombreValidoException{

        if(!scanner.hasNextInt() || !scanner.hasNextDouble()){
            String entrada = scanner.nextLine();
            if(entrada.isEmpty() || entrada.equals(null) || entrada.length() < 1){
                throw new NombreValidoException("No ingreso un nombre valido");
            }else{
                return entrada;
            }
        }
        scanner.nextLine();
        throw new NombreValidoException("No ingreso una palabra");
    }

    public double nota(){
        boolean isValid = false;
        double nota = 0;
        do{
            try{
                System.out.println("Ingrese la nota. Ingrese -1 para terminar");
                nota = notaValida();
                isValid = true;
            } catch(NotaInvalidaException nie){
                System.out.println(nie.getMessage());
                isValid = false;
            }
        }while(!isValid && nota != -1);
        return nota;
    }

    public double notaValida() throws NotaInvalidaException{
        if(scanner.hasNextInt() || scanner.hasNextFloat() || scanner.hasNextDouble()){
            double entrada = scanner.nextDouble();
            if(entrada >= -1 && entrada <= 10){
                return entrada;
            }else{
                throw new NotaInvalidaException("La nota no es valida");
            }
        }else{
            scanner.nextLine();
            throw new NotaInvalidaException("Ingresaste una letra. No es valido");
        }
    }
}
