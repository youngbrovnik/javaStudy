package test;

public class Car extends Machine {

    public static int NumOfTires = 4;

    // Field;
    public String mCompany;
    public String mModel;
    public String mColor;
    public int mMaxSpeed;

    public Car() {
        this("", "", 0);
    }

    public Car(String model) {
        this(model, "", 0);
    }

    public Car(String model, String color) {
        this(model, color, 0);
    }

    public Car(String model, String color, int maxSpeed) {
        mModel = model;
        mColor = color;
        mMaxSpeed = maxSpeed;
    }

    public Car(int tires) {
        NumOfTires = tires;
    }

    public int getTires() {
        return NumOfTires;
    }

    public static String getCarClassName() {
        return "CAR";
    }


    @Override
    public void move() {
        System.out.println("Car, move(), km = " + mKm + ", hashCode = " + this.hashCode());
    }


    public void run() {
        // (1)
    }

    public void run(int totalKm) {
        // (2)
    }

    public void run(int totalKm, String direction) {
        // (3)
    }

    public void run(double totalKm) {
        // (4)
    }

    public void run(String direction, int totalKm) {
        // (5)
    }

//    public void run(int speed, String nation) {
//
//    }

//    private int plus(int x, int y) {
//        int result = x + y;
////        if (result > 0) {
////            return result;
////        }
////        System.out.println("result = " + result);
////        return 0;
//        return result;
//    }
//
//    private double plus(double x, double y) {
//        return x + y;
//    }
//
//    public void test() {
//        move();
//        run();
//        plus(10, 20);
//        plus(11.2, 11.3);
//    }


}
