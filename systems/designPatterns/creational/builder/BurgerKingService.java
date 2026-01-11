package designPatterns.creational.builder;

public class BurgerKingService {
    BurgerMeal burgerMeal = new BurgerMeal.BurgerBuilder("wheat", "chicken").build();
    BurgerMeal burgerMealWithCheese = new BurgerMeal.BurgerBuilder("wheat", "chicken")
        .withCheese(true)
        .build();
}
