package test;

public class Animal {

    public String mName;

    private Animal() { }


    private static final Animal SINGLETON = new Animal();

    public static Animal getInstance() {
        return SINGLETON;
    }

    public void run() {

    }

    public static void move() {

    }


}
