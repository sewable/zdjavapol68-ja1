package homework.task7;

public class Cheese implements Ingredient{

    private static final double CALORIES_PER_GRAM = 4.03;
    private final double weight;
    private final String name;
    private static final String type = "Gouda";

    public Cheese(double weight, String name) {
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
        return "Cheese{" +
                "type=" + type +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
