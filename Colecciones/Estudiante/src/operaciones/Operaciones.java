package operaciones;
import validacion.Validacion;
import java.util.ArrayList;

import estudiante.Estudiante;

/*
 En esta clase se van a agregar, borrar y modificar los productos del inventario
 */

public class Operaciones {

    private ArrayList<Estudiante> estudiantes;
    private Validacion validar;

    public Operaciones(){
        this.estudiantes = new ArrayList<Estudiante>();
        this.validar = new Validacion();
    }

    public void mostrarMenu(){
        int option = -1;
        do{
            System.out.println("INGRESE LA OPCION DESEADA\n" +
                "1) Ingresar nuevo estudiante\n" +
                "2) Eliminar estudiante\n" + 
                "3) Buscar un estudiante\n" +
                "4) Mostrar estudiantes\n" +
                "0) Salir");
                try{
                    option = validar.validOption();
                    choosenOption(option);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
        }while(option != 0);
    }

    
    public void choosenOption(int option){
        switch (option) {
            case 1:
                addEstudiante();
                break;
            case 2:
                deleteEstudiante();
                break;
            case 3:
                System.out.println(searchEstudiante());
                break;
            case 4:
                System.out.println(showEstudiante());
                break;       
            default:
                break;
            }
        }

    public void addEstudiante(){
            do{
                boolean exist = false;
                String name = validar.setName();
                if(name.equals("q")){
                    break;
                }else{
                    for(Estudiante estud : estudiantes){
                        if(estud.getName().equalsIgnoreCase(name)){
                            System.out.println("El estudiante ya esta en la lista");
                            exist = true;
                            break;
                        }
                    }
                    if(!exist){
                        estudiantes.add(new Estudiante(name));
                        System.out.println("Se agrego el estudiante");
                    }else{
                        System.out.println("No se puede agregar el estudiante");
                    }
                }
            }while(true);
        }
        
    public void  deleteEstudiante(){
        System.out.println("Ingrese el nombre del estudiante que quiere eliminar");
        String name = validar.setName();
        for(Estudiante estud : estudiantes){
            if(estud.getName().equals(name)){
                estudiantes.remove(estud);
                System.out.println("Se elimino el estudiante");
            }
        }
    }   
    
    public Estudiante searchEstudiante(){

        System.out.println("Ingrese el nombre del estudiante que quiere buscar");
        String name = validar.setName();
        for(Estudiante estud : estudiantes){
            if(estud.getName().equals(name)){
                return estud;
            }
        }    
        System.out.println("El estudiante no esta cargado en el sistema");   
        return null;
    }
    
    public String showEstudiante(){
            return estudiantes.toString();
        }
}
