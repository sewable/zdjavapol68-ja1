package homework.task5;

public class Task05 {

    public static void main(String[] args) {

        GasCar car = new GasCar(30);

        System.out.println(car.getFuelLevel());
        System.out.println(car.refuel(60));
        System.out.println(car.consume(20));
        System.out.println(car.consume(20));

        System.out.println();

        BrokenGasCar brokenCar = new BrokenGasCar(30);

        System.out.println(brokenCar.getFuelLevel());
        System.out.println(brokenCar.refuel(100));
        System.out.println(brokenCar.consume(200));

    }

}
