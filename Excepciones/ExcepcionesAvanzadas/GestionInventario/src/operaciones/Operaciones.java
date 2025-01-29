package operaciones;
import producto.Producto;
import validacion.Validacion;
import java.util.ArrayList;

/*
 En esta clase se van a agregar, borrar y modificar los productos del inventario
 */

public class Operaciones {

    private ArrayList<Producto> productos;
    private Validacion validar;

    public Operaciones(){
        this.productos = new ArrayList<Producto>();
        this.validar = new Validacion();
    }

    public void mostrarMenu(){
        int option = -1;
        do{
            System.out.println("INGRESE LA OPCION DESEADA\n" +
                "1) Ingresar nuevo producto\n" +
                "2) Modificar stock\n" +
                "3) Cambiar precio\n" + 
                "4) Eliminar producto\n" + 
                "5) Mostrar productos\n" +
                "0) Salir");
                try{
                    option = validar.validOption();
                    choosenOption(option);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
        }while(option != 0);
    }

    public void addProducto(){
        do{
            boolean exist = false;
            String name = validar.setName();
            if(name.equals("q")){
                break;
            }else{
                double price = validar.setPrice();
                int qtty = validar.setQtty();
                for(Producto prod : productos){
                    if(prod.getName().equalsIgnoreCase(name)){
                        System.out.println("El producto ya esta en la lista");
                        exist = true;
                        break;
                    }
                }
                if(!exist){
                    productos.add(new Producto(name, price, qtty));
                    System.out.println("Se agrego el producto");
                }else{
                    System.out.println("No se puede agregar el producto");
                }
            }
        }while(true);
    }

    public String mostrarProductos(){
        return productos.toString();
    }

    public void choosenOption(int option){
        switch (option) {
            case 1:
                addProducto();
                break;
            case 2:
                changeStock();
                break;
            case 3:
                changePrice();
                break;
            case 4:
                deleteProducto();
                break;
            case 5:
                System.out.println(mostrarProductos());
                break;        
            default:
                break;
        }
    }

    public void changeStock(){
        System.out.println("Ingrese el nombre del producto que quiere modificar el stock");
        String name = validar.setName();
        for(Producto prod : productos){
            if(prod.getName().equals(name)){
                prod.setQtty(validar.setQtty());
            }
        }
    }
    
    public void changePrice(){
        System.out.println("Ingrese el nombre del producto que quiere modificar el precio");
        String name = validar.setName();
        for(Producto prod : productos){
            if(prod.getName().equals(name)){
                prod.setPrice(validar.setPrice());
            }
        }
    }

    public void deleteProducto(){
        System.out.println("Ingrese el nombre del producto que quiere eliminar");
        String name = validar.setName();
        for(Producto prod : productos){
            if(prod.getName().equals(name)){
                productos.remove(prod);
            }
        }
    }
}
