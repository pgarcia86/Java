package car;

public class Car {
    private String engine;
    private String color;
    private String transmission;
    private boolean gps;
    private String sunroof;

    private Car(Builder builder){
        this.engine = builder.engine;
        this.color = builder.color;
        this.transmission = builder.transmission;
        this.sunroof = builder.sunroof;
        this.gps = builder.gps;
    }
    
    @Override
    public String toString() {
        return "Car [engine=" + engine + ", color=" + color + ", transmission=" + transmission + ", sunroof=" + sunroof
                + "]";
    }
    
    public static Builder builder(){
        return new Builder();   
    }

    public static class Builder{
        private String engine;
        private String color;
        private String transmission;
        private String sunroof;
        private boolean gps;

        public Builder setEngine(String engine){
            this.engine = engine;
            return this;
        }
        public Builder setColor(String color){
            this.color = color;
            return this;
        }
        public Builder setTransmission(String transmission){
            this.transmission = transmission;
            return this;
        }
        public Builder setSunroof(String sunroof){
            this.sunroof = sunroof;
            return this;
        }
        public Builder setGPS(boolean gps){
            this.gps = gps;
            return this;
        }

        public Car builder(){
            return new Car(this);
        }
    }
}
