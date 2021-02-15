package exceptions;

public class Car {

    final double capacity;
    double level;

    public Car(double capacity) {
        this.capacity = capacity;
        level = 0;
    }

    public void refuel(double fuel){
        if(fuel < 0){
            throw new IllegalArgumentException("Negative value");
        }
        if(fuel + level > capacity){
            throw new IllegalArgumentException("To much fuel " + (capacity - fuel - level));
        }
        level += fuel;
    }

    /**
     * metoda sgłasza własne wyjątki
     * @param fuel poziom zużytego paliwa
     */
    public void consume(double fuel) throws InvalidFuelLevelException{
        if(0 > fuel){
            throw new InvalidFuelLevelException(fuel, "Negative value");
        }
        if(fuel > level){
            throw new InvalidFuelLevelException(fuel, "Not enough fuel in car");
        }
        level -= fuel;
    }

    public double getLevel() {
        return level;
    }
}
