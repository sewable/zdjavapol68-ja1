package homework.task5;

public class BrokenGasCar extends GasCar {

    public BrokenGasCar(double fuelCapacity) {
        super(fuelCapacity);
    }

    @Override
    public double refuel(double fuel) {
        setFuelLevel(getFuelLevel() + fuel);
        return fuel;
    }

    @Override
    public double consume(double fuel) {
        setFuelLevel(getFuelLevel() - fuel);
        return fuel;
    }
}
