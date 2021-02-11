package homework.task7;

public class Cake implements Ingredient{

    private static final double CALORIES_PER_GRAM = 2.57;
    private final double weight;
    private final String name;
    private static final String type = "Creamy";

    public Cake(double weight, String name) {
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
        return "Cake{" +
                "type=" + type +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
