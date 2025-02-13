import java.lang.module.ModuleDescriptor.Builder;

import computer.Computer;

public class main {
    public static void main(String[] args) throws Exception {
        Computer computer = Computer.builder()
            .setCPU("INTEL")
            .setRAM("8GB")
            .setStorage("500GB")
            .setCPU("NVIDIA")
            .setOS("Linux")
            .builder();

        System.out.println(computer.toString());
    }
}
