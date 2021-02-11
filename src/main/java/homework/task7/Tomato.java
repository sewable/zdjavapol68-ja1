package homework.task7;

public class Tomato implements Ingredient{

    private static final double CALORIES_PER_GRAM = 0.18;
    private final double weight;
    private final String name;

    public Tomato(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return weight * CALORIES_PER_GRAM;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
