package homework.task12;

import java.util.ArrayList;

public class Pizza extends Dish implements Ingredient {

    public Pizza(String name) {
        super(name);
        ingredients = new ArrayList<>();
    }

    public boolean addCake(Cake cake) {
        for(Ingredient item : ingredients){
            if(item instanceof Cake){
                return false;
            }
        }
        ingredients.add(cake);
        return true;
    }

    public boolean addTomato(Tomato tomato) {
        for(Ingredient item : ingredients) {
            if(item instanceof Tomato) {
                return false;
            }
        }
        ingredients.add(tomato);
        return true;
    }

    public boolean addCheese(Cheese cheese) {
        for(Ingredient item : ingredients) {
            if(item instanceof Cheese) {
                return false;
            }
        }
        ingredients.add(cheese);
        return true;
    }

    //dodaj metody dodające pozostałe składniki
    public boolean isReady() {
        //zwróć true jeśli są wszystkie składniki
        int cake = 0;
        int tomato = 0;
        int cheese = 0;
        for (Ingredient item : ingredients) {
            if(item instanceof Cake) {
                cake++;
            }
            if(item instanceof Tomato) {
                tomato++;
            }
            if(item instanceof Cheese) {
                cheese++;
            }
        }
        if(cake == 1 && tomato == 1 && cheese == 1) {
            return true;
        }
        return false;
    }
}