import java.util.Scanner;

import persona.Persona;

public class main {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();

        persona.setName(persona.ingresoNombre());
        persona.setEdad(persona.ingresoEdad());

        System.out.println(persona.toString());
   }
}

