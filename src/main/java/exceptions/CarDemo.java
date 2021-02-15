package exceptions;

public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car(30);
        //car.refuel(-50);
        try {
            car.consume(-20);
        } catch (InvalidFuelLevelException e) {
            System.out.println(e.getMessage() + ", invalid value " + e.getFuelLevel());
        }

    }

}
