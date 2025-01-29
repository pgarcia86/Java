package contacto;

import java.util.HashMap;

public class Contacto {
    HashMap<String, String> datos;

    public Contacto(String name, String telephone){
        this.datos = new HashMap<String, String>();
        this.datos.put(name, telephone);
    }

    public HashMap<String, String> getDatos() {
        return datos;
    }
    public void setDatos(HashMap<String, String> datos) {
        this.datos = datos;
    }
    

    @Override
    public String toString() {
        return "Contacto [datos= " + datos + "]";
    }
    
}
