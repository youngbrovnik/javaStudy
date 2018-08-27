import test.*;

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

        int tires = Car.NumOfTires;
        Car.getCarClassName();

//        Animal animal = new Animal();
        Animal.getInstance().run();
        Animal.getInstance().move();

        Animal.move();

        Animal a1 = Animal.getInstance();
        Animal a2 = Animal.getInstance();

        Phone p1 = new Phone("p1");
        Phone p2 = new Phone("p2");

        System.out.println("p1 = " + p1.mName + ", p2 = " + p2.mName);
        System.out.println("Static, p1 = " + p1.getStaticName() + ", p2 = " + p2.getStaticName() + ", Phone = " + Phone.sName);


//        Object object = new Machine();
//        Object object2 = new Animal();

        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        System.out.println(Television.info);

    }

//    private void test(Object obj) {
//
//    }

}
