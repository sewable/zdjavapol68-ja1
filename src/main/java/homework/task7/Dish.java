package homework.task7;

public class Dish implements ValuableIngredient{

    private Ingredient[] ingredients;

    public Dish(Ingredient[] ingredients) {
        this.ingredients = ingredients;
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

    @Override
    public double price() {
        double sum = 0;
        for(Ingredient food : ingredients) {
            if(food instanceof Valuable) {
                sum += (((Valuable) food).price() * food.weight());
            }
        }
        return sum;
    }
}
