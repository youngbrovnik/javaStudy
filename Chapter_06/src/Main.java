import test.*;
import test.ch8.*;
import test.person.Person;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello Class!");
        PrintExample();
//        MemberService();
//        examTest();
//        testCh8();
//        testCh7();
//        testMachine();

    }

    public static void PrintExample() {
//        Printer printer = new Printer();
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }

    public  static  void MemberService() {
        Member member = new Member();
        boolean result = member.login("hong", "12345");
        if(result) {
            System.out.println("로그인 되었습니다.");
            member.logout("hong");
        } else {
            System.out.println("id 또는  password가 올바르지 않습니다.");
        }
    }

    public static void examTest() {
        Example exam = new Example();
        System.out.println(exam.fieldName);
        exam.methodName();
        System.out.println(exam.fieldName);
        System.out.println(exam.fieldName2);
    }

    public static void testCh8() {
        RemoteControl rc;

//        rc = new test.ch8.Television();
//        rc = new Audio();
//        rc = new SmartTelevision();

        rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("asfdasdf");
            }

            @Override
            public void tunnOff() {

            }

            @Override
            public void setVolume(int volume) {

            }
        };


        rc.tunnOff();
        rc.turnOn();

        Searchable search;
//        search = new Television();
        search = new SmartTelevision();

    }




    public static void testCh7() {
        Machine machine = new Car();
//        Machine machine = new Ship();


        machine.move();
//        machine.run();

        if (machine instanceof Car) {
            ((Car) machine).run();
        }

    }


//    public static void testPerson() {
//        Person person = new Person();
//        person.getName();
//
//    }

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
//        Animal.getInstance().run();
//        Animal.getInstance().move();
//
//        Animal.move();
//
//        Animal a1 = Animal.getInstance();
//        Animal a2 = Animal.getInstance();

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

//        System.out.println(Television.info);

        Bird bird = new Bird();
        boolean flag = bird.run("", 10);


//        RemoteControl.changeBattery();

    }

//    private void test(Object obj) {
//
//    }

}
