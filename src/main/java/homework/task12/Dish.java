package homework.task12;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dish implements Ingredient{
    List<Ingredient> ingredients;
    final String name;

    public Dish(String name) {
        this.name = name;
        ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public List<Ingredient> ingredients() {
        return ingredients;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Ingredient item : ingredients) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public double calories() {
        double calories = 0;
        for(Ingredient item : ingredients) {
            calories += (item.weight() * item.calories());
        }
        return calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(ingredients, dish.ingredients) && Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients, name);
    }
}