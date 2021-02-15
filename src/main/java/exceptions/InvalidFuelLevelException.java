package exceptions;

public class InvalidFuelLevelException extends Exception{

    private final double fuelLevel;

    public InvalidFuelLevelException(double fuelLevel, String message) {
        super(message);
        this.fuelLevel = fuelLevel;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}
