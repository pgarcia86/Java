public class ObjetosBasicos {
    public static void main(String[] args) throws Exception {
        Car auto = new Car("Ford", "Mondeo", 1990, "Rojo");
        Persona persona = new Persona("Pablo", 38);
        Rectangulo rectangulo = new Rectangulo(15.2, 7.8);
        CuentaBancaria cuentaBancaria = new CuentaBancaria("Pablo Garcia", 1700);

        System.out.println(auto.toString());
        persona.saludar();
        System.out.printf("El area del rectangulo es: " + "%1.3f\n",rectangulo.area());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.perimetro());
        cuentaBancaria.depositar(300);
        cuentaBancaria.retirar(700);
        System.out.println(cuentaBancaria.toString());
    }
}
