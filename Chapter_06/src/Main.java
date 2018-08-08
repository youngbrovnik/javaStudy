import test.Car;
import test.Machine;
import test.Ship;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Class!");

        testMachine();
    }

    private static void testMachine() {
        Machine m1 = new Machine(10);
        m1.move();

        Car bmw320d = new Car();
        bmw320d.mKm = 15;
        bmw320d.move();

        Car k3 = new Car();
        k3.mKm = 9;
        k3.move();
//        k3.run();
//        k3.run(20);
//        k3.run(20, "East");

        System.out.println("BMW, tires = " + bmw320d.getTires());
        System.out.println("K3, tires = " + k3.getTires());
        Car.NumOfTires = 5;

        Car.getCarClassName();

        System.out.println("BMW, tires = " + bmw320d.getTires());
        System.out.println("K3, tires = " + k3.getTires());


        Ship izis = new Ship();
        izis.mKm = 200;
        izis.move();
    }


}
