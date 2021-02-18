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
        boolean check = true;
        for(Ingredient item : ingredients) {
            if(item instanceof Cake) {
                check = true;
                break;
            } else {
                check = false;
            }
        }

        for(Ingredient item : ingredients) {
            if(item instanceof Tomato) {
                check = true;
                break;
            } else {
                check = false;
            }
        }

        for(Ingredient item : ingredients) {
            if(item instanceof Cheese) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }
}