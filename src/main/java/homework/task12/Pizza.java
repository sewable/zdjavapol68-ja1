package homework.task12;

import java.util.HashSet;
import java.util.Set;

public class Pizza extends Dish implements Ingredient {

    Set<Ingredient> pizzaIngredients;

    public Pizza(String name) {
        super(name);
        pizzaIngredients = new HashSet<>();
    }

    public boolean addCake(Cake cake) {
        if(pizzaIngredients.add(cake)) {
            pizzaIngredients.add(cake);
            return true;
        }
        return false;
    }

    public boolean addTomato(Tomato tomato) {
        if(pizzaIngredients.add(tomato)) {
            pizzaIngredients.add(tomato);
            return true;
        }
        return false;
    }

    public boolean addCheese(Cheese cheese) {
        if(pizzaIngredients.add(cheese)) {
            pizzaIngredients.add(cheese);
            return true;
        }
        return false;
    }

    //dodaj metody dodające pozostałe składniki
    public boolean isReady() {
        //zwróć true jeśli są wszystkie składniki
        if(pizzaIngredients.size() == 3) {
            return true;
        }
        return false;
    }
}