public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.mName = "nabi";

        Dog dog = new Dog();
        dog.mName = "badugi";

        HouseDog houseDog = new HouseDog("happy");
//        houseDog.mName = "happy";

        System.out.println(cat.mName);
        System.out.println(dog.mName);
        houseDog.sleep();
        houseDog.sleep(3);

        Test myTest = new Test();
        System.out.println(myTest.sum(3, 4));

        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);

    }
}
