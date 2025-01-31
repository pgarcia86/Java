package operaciones;

import serializable.Serializable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.management.InstanceAlreadyExistsException;
import javax.naming.NameNotFoundException;
import empleado.Empleado;
import validacion.Validacion;

public class Operaciones implements Serializable{
    private Validacion validar;
    
    public Operaciones(){
        this.validar = new Validacion();
    }

    //Muestra el menu en pantalla
    public void mostrarMenu(){
        int option = -1;
        do{
            System.out.println("INGRESE LA OPCION DESEADA\n" +
                "1) Ingresar nuevo empleado\n" +
                "2) Buscar un empleado\n" +
                "3) Listar todos los empleados\n" + 
                "4) Eliminar un empleado\n" + 
                "0) Salir");
                try{
                    option = validar.validOption();
                    choosenOption(option);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
        }while(option != 0);
    }

    //Distribuye las operaciones dependiendo de la opcion elegida
    public void choosenOption(int option){
         switch (option) {
            case 1:
            try{
                saveNewEmpleado();
                break;
            }catch(InstanceAlreadyExistsException iaee){
                System.out.println(iaee.getMessage());
            }
            case 2:
            try{
                showEmpleado();
                break;
            }catch(NameNotFoundException nnfe){
                System.out.println(nnfe.getMessage());
            }
            case 3:
                showAllEmpleados();
                break;
            case 4:
                deleteEmpleado();
                break;
            default:
                break;
        }
    }

    //Crea un nuevo empleado
    public Empleado createEmpleado() throws InstanceAlreadyExistsException{
        String file = validar.setFile();
        if(file.equalsIgnoreCase("q")){
            System.out.println("Saliendo de la carga de empleado");
            return null;
        }
        if(!exist(file)){
            Empleado newEmpleado = new Empleado(file, validar.setName(), validar.setAge(), validar.setSalary());
            return newEmpleado;
        }else{
            throw new InstanceAlreadyExistsException("Ya existe el empleado");
        }
    }

    //Devuelve el empleado a buscar
    public Empleado findEmpleado(String file){
        ArrayList<Empleado> empleados = loadFile();
        if(exist(file)){
            for(Empleado emp : empleados){
                if(file.equals(emp.getFile())){
                    return emp;
                }
            }
        }
        System.out.println("No existe el empleado");
        return null;
    }

    //Devuelve true si el empleado existe, false si el empleado no existe
    public boolean exist(String file){
        ArrayList<Empleado> empleados = loadFile();
        for(Empleado emp : empleados){
            if(file.equalsIgnoreCase(emp.getFile())){
                return true;
            }
        }
        return false;
    }
    
    //Devuelve todos los empleados cargados en el archivo
    public ArrayList<Empleado> loadFile(){
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        try(FileReader reader = new FileReader("log.txt");
            BufferedReader bufferedReader = new BufferedReader(reader)){
                String line;
                while((line = bufferedReader.readLine()) != null){
                    ArrayList<String> datosEmpleado = new ArrayList<String>(Arrays.asList(line.split(" - ")));
                    empleados.add(new Empleado(datosEmpleado.get(0), 
                    datosEmpleado.get(1), 
                    Integer.parseInt(datosEmpleado.get(2)), 
                    Double.parseDouble(datosEmpleado.get(3))));
                }
        }catch(IOException ioe){
            System.out.println("No se puede leer el archivo");
        }
        return empleados;
    }

    //Guarda datos en el archivo
    public void saveFile(ArrayList<Empleado>empleados){
        try(FileWriter writer = new FileWriter("log.txt", false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){
                if(empleados.isEmpty()){
                    bufferedWriter.write("");
                }else{
                    for(Empleado emp : empleados){
                        try{
                            bufferedWriter.write(emp.getFile() + " - " +
                            emp.getName() + " - " +
                            emp.getAge() + " - " +
                            emp.getSalary() + "\n");
                        }catch(IOException ioe){
                            System.out.println("No se puede escribir en el archivo");
                        }
                    }

                }
            }catch(Exception e){
                System.out.println("Hubo un problema con la escritura en el archivo");
            }
    }

    //Guarda un nuevo empleado en el archivo
    @Override
    public void saveNewEmpleado() throws InstanceAlreadyExistsException {       
        Empleado newEmpleado = createEmpleado();
        ArrayList<Empleado> empleados = loadFile();
        empleados.add(newEmpleado);
        try{
            saveFile(empleados);
        }catch(Exception e){
            System.out.println("No se guardo ningun empleado");
        }
    }

    //Muestra un empleado por pantalla
    @Override
    public void showEmpleado() throws NameNotFoundException {
        System.out.println("Vas a buscar un empleado");
        String file = validar.setFile();
        if(exist(file)){
            Empleado emp = findEmpleado(file);
            System.out.println(emp.toString());
        }else{
            throw new NameNotFoundException("No existe el empleado");
        }
    }

    //Muestra todos los empleados por pantalla
    @Override
    public void showAllEmpleados() {
        ArrayList<Empleado> empleados = loadFile();
        if(!empleados.isEmpty()){
            for(Empleado emp : empleados){
                System.out.println(emp.toString());
            }
        }else{
            System.out.println("No hay empleados que mostrar");
        }
    }

    //Elimina un empleado los empleados
    @Override
    public void deleteEmpleado() {
        System.out.println("Vas a eliminar un empleado");
        String file = validar.setFile();
        if(exist(file)){
            ArrayList<Empleado> empleados = loadFile();
            empleados.removeIf(emp -> file.equalsIgnoreCase(emp.getFile()));
            saveFile(empleados);
            System.out.println("Se elimino el empleado");
        }else{
            System.out.println("El empleado no existe");
        }
    }
}
