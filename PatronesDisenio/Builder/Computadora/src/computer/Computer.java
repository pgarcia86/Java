package computer;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String os;
    
    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    @Override
    public String toString() {
        return "Computer [cpu= " + cpu + ", ram=" + ram + ", storage= " + storage + ", gpu= " + gpu + ", os= " + os + "]";
    }


    public static Builder builder(){
        return new Builder();
    }
    
    public static class Builder{
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private String os;

        public Builder setCPU(String cpu){
            this.cpu = cpu;
            return this;
        }
        
        public Builder setRAM(String ram){
            this.ram = ram;
            return this;
        }        
        public Builder setStorage(String storage){
            this.storage = storage;
            return this;
        }        
        public Builder setGPU(String gpu){
            this.gpu = gpu;
            return this;
        }
        public Builder setOS(String os){
            this.os = os;
            return this;
        }

        public Computer builder(){
            return new Computer(this);
        }
    }
}
