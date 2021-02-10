package homework.task5;

public class BrokenGasCar extends GasCar {

    public BrokenGasCar(double fuelCapacity) {
        super(fuelCapacity);
    }

    @Override
    public double refuel(double fuel) {
        double x = getFuelLevel() + fuel;
        return x;
    }

    @Override
    public double consume(double fuel) {
        double x = getFuelLevel() - fuel;
        return x;
    }
}
