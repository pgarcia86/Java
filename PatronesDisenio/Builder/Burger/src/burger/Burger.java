package burger;

public class Burger {
    private String breadType;
    private String meat;
    private String cheese;
    private String vegetable;

    private Burger(Builder builder){
        this.breadType = builder.breadType;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.vegetable = builder.vegetable;
    }

    @Override
    public String toString() {
        return "Burger [breadType=" + breadType + ", meat=" + meat + ", cheese=" + cheese + ", vegetable=" + vegetable
                + "]";
    }    

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String breadType;
        private String meat;
        private String cheese;
        private String vegetable;
    
        public Builder setBreadType(String breadType){
            this.breadType = breadType;
            return this;
        }    
        public Builder setMeat(String meat){
            this.meat = meat;
            return this;
        }    
        public Builder setCheese(String cheese){
            this.cheese = cheese;
            return this;
        }    
        public Builder setVegetables(String vegetable){
            this.vegetable = vegetable;
            return this;
        }    
        public Burger builder(){
            return new Burger(this);
        }
    }
}
