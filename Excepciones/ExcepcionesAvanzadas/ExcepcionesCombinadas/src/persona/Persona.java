package persona;

import java.util.Scanner;

import excepciones.EdadValidaException;
import excepciones.NombreValidoExcepcion;

public class Persona {

    static Scanner scanner;
    String name;
    int edad;

    public Persona(){
        scanner = new Scanner(System.in);
    }

    public String ingresoNombre(){

        boolean flag = false;
        do{
            try{
                System.out.println("Ingrese su nombre");
                name = nombreValido();
                flag = true;
            } catch(NombreValidoExcepcion nve){
                System.out.println(nve.getMessage());
                flag = false;
            }
        }while(!flag);
        return name;
    }

    public String nombreValido() throws NombreValidoExcepcion{
        if(!scanner.hasNextInt() || !scanner.hasNextDouble()){
            String entrada = scanner.nextLine();
            if(entrada.isEmpty() || entrada.equals(null) || entrada.length() < 1){
                throw new NombreValidoExcepcion("El nombre no es valido. Intentalo nuevamente");
            }else{
                return entrada;
            }
        } else{
            scanner.nextLine();
            throw new NombreValidoExcepcion("El nombre no es valido. Intentalo nuevamente");
        }
    }

    public int ingresoEdad(){
        boolean flag = false;
        do{
            try{
                System.out.println("Ingrese su edad");
                edad = edadValida();
                flag = true;
            } catch(EdadValidaException eve){
                System.out.println(eve.getMessage());
                flag = false;
            }
        }while(!flag);
        return edad;
    }

    public int edadValida() throws EdadValidaException{
        if(scanner.hasNextInt()){
            int entrada = scanner.nextInt();
            if(entrada >= 0){
                return entrada;
            }
            else{
                throw new EdadValidaException("Ingresaste una edad menor a cero. Intentalo nuevamente");
            }
        }
        else{    
            scanner.nextLine();
            throw new EdadValidaException("La edad no es valida. Intentalo nuevamente");
        }
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return "El nombre es: " + this.name + " y su edad es: " + this.edad;
    }
}
