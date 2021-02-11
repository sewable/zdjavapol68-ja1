package homework.task7;

public class Dish implements Ingredient{

    private Ingredient[] ingredients;

    public Dish(Egg egg, Cheese cheese) {
        ingredients = new Ingredient[]{egg, cheese};
    }

    public Dish(Cheese cheese, Tomato tomato, Salt salt) {
        ingredients = new Ingredient[]{cheese, tomato, salt};
    }

    public Dish(Cake cake) {
        ingredients = new Ingredient[]{cake};
    }

    public Dish(Dish dish) {
        ingredients = new Ingredient[]{dish};
    }

    @Override
    public double weight() {
        double weight = 0;
        for(Ingredient food : ingredients){
            weight += food.weight();
        }
        return weight;
    }

    @Override
    public double calories() {
        double calories = 0;
        for(Ingredient food : ingredients){
            calories += food.calories();
        }
        return calories;
    }
}
