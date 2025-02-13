package foodOrder;

public class FoodOrder {
    private String mainCourse;
    private String side;
    private String drink;
    private String dessert;
    

    private FoodOrder(Builder builder){
        this.mainCourse = builder.mainCourse;
        this.side = builder.side;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
    }


    @Override
    public String toString() {
        return "FoodOrder [mainCourse=" + mainCourse + ", side=" + side + ", drink=" + drink + ", dessert=" + dessert
                + "]";
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String mainCourse;
        private String side;
        private String drink;
        private String dessert;

        public Builder setMainCourse(String mainCourse){    
            this.mainCourse = mainCourse;
            return this;
        }
        public Builder setSide(String side){    
            this.side = side;
            return this;
        }
        public Builder setDrink(String drink){    
            this.drink = drink;
            return this;
        }
        public Builder setDessert(String dessert){    
            this.dessert = dessert;
            return this;
        }

        public FoodOrder builder(){
            return new FoodOrder(this);
        }
    }
}
