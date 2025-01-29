package operaciones;
import validacion.Validacion;
import java.util.ArrayList;

import contacto.Contacto;

/*
 En esta clase se van a agregar, borrar y modificar los productos del inventario
 */

public class Operaciones {

    private ArrayList<Contacto> contactos;
    private Validacion validar;

    public Operaciones(){
        this.contactos = new ArrayList<Contacto>();
        this.validar = new Validacion();
    }

    public void mostrarMenu(){
        int option = -1;
        do{
            System.out.println("INGRESE LA OPCION DESEADA\n" +
                "1) Ingresar nuevo contacto\n" +
                "2) Eliminar contacto\n" + 
                "3) Buscar un contacto\n" +
                "4) Mostrar contactos\n" +
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
                addContacto();
                break;
            case 2:
                deleteContacto();
                break;
            case 3:
                System.out.println(searchContacto());
                break;
            case 4:
                System.out.println(showContactos());
                break;       
            default:
                break;
            }
        }

    public void addContacto(){
        do{
            boolean exist = false;
            String name = validar.setName();
            if(name.equals("q")){
                break;
            }else{
                for(Contacto cont : contactos){
                    if(cont.getDatos().containsKey(name)){
                        System.out.println("El contacto ya esta en la lista");
                        exist = true;
                        break;
                    }
                }
                if(!exist){
                    contactos.add(new Contacto(name, validar.setTelephone()));
                    System.out.println("Se agrego el contacto");
                }else{
                    System.out.println("No se puede agregar el contacto");
                }
            }
        }while(true);
    }
        
    public void deleteContacto(){
        System.out.println("Ingrese el nombre del contacto que quiere eliminar");
        String name = validar.setName();
        for(Contacto cont : contactos){
            if(cont.getDatos().containsKey(name)){
                contactos.remove(cont);
                System.out.println("Se elimino el contacto");
            }
        }
    }   
    
    public Contacto searchContacto(){
        System.out.println("Ingrese el nombre del contacto que quiere buscar");
        String name = validar.setName();
        for(Contacto cont : contactos){
            if(cont.getDatos().containsKey(name)){
                return cont;
            }
        }    
        System.out.println("El contacto no esta cargado en el sistema");   
        return null;
    }
    
    public String showContactos(){
            return contactos.toString();
        }
}
