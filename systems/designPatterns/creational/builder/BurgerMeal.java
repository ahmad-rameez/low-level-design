package designPatterns.creational.builder;

import java.util.List;

public class BurgerMeal {
    // required
    private final String bun;
    private final String patty;

    // Optional
    private final boolean hasCheese;
    private final List<String> toppings;
    private final String side;
    private final String drink;

    //private Constructor
    private BurgerMeal(BurgerBuilder builder){
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
        this.side = builder.side;
        this.drink = builder.drink;
    }

    public static class BurgerBuilder {
        private final String bun;
        private final String patty;

        private boolean hasCheese;
        private List<String> toppings;
        private String side;
        private String drink;

        public BurgerBuilder(String bun, String patty){
            this.bun = bun;
            this.patty = patty;
        }

        public BurgerBuilder withCheese(boolean hasCheese){
            this.hasCheese = hasCheese;
            return this;
        }

        public BurgerBuilder withToppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder withSide(String side){
            this.side = side;
            return this;
        }

        public BurgerBuilder withDrink(String drink){
            this.drink = drink;
            return this;
        }

        public BurgerMeal build(){
            return new BurgerMeal(this);
        }
    }

}
