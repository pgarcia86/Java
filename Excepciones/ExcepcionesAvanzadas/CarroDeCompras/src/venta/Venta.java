package venta;

import java.util.ArrayList;

import excepciones.CantidadInsuficienteException;
import excepciones.CarritoVacioException;
import excepciones.PagoFallidoException;
import excepciones.ProductoNoDisponibleException;
import productos.Producto;

public class Venta {

    ArrayList<Producto> prodVenta;
    double pago;
    double importe;
    
    public Venta(ArrayList<Producto> productos, double pago){
        this.prodVenta = productos;
        this.pago = pago;
        this.importe = 0;
    }

    public ArrayList<Producto> getProductos() {
        return prodVenta;
    }
    
    public void setProductos(ArrayList<Producto> productos) {
        this.prodVenta = productos;
    }
    
    public double getPago() {
        return pago;
    }
    
    public void setPago(double pago) {
        this.pago = pago;
    }

    public void hacerVenta(ArrayList<Producto> inventario) throws ProductoNoDisponibleException, CantidadInsuficienteException, PagoFallidoException, 
        CarritoVacioException{
            carritoVacio();

        for(Producto pVenta : prodVenta){
            estaProducto(pVenta, inventario);
        } 
            alcanzaDinero();
    }

    public boolean estaProducto(Producto prodVenta, ArrayList<Producto> inventario) throws ProductoNoDisponibleException ,CantidadInsuficienteException{
        
        for(Producto prod : inventario){
            if(prodVenta.getName().equals(prod.getName())){
                if(chequeoCantidad(prodVenta.getCant(), prod.getCant())){
                    this.importe += calcularImporte(prodVenta.getCant(), prod.getPrice());
                    return true;
                }                
            }            
        }
        throw new ProductoNoDisponibleException("El producto no esta disponible");
    }

    public boolean chequeoCantidad(int cantVenta, int cantProd) throws CantidadInsuficienteException{
        if(cantVenta <= cantProd){
            return true;
        }else{
            throw new CantidadInsuficienteException("No hay cantidad suficiente");
        }
    }

    public double calcularImporte(int cantVenta, double precio){
        return (cantVenta * precio);
    }

    public boolean alcanzaDinero() throws PagoFallidoException{
        if(this.pago >= importe){
            return true;
        }
        throw new PagoFallidoException("No alcanza el dinero");
    }

    public void carritoVacio() throws CarritoVacioException{
        if(prodVenta.isEmpty()){
            throw new CarritoVacioException("El carrito esta vacio");
        }
    }
}
