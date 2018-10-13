package test.ch8;

public interface interfaceB {
    void methodA();

    default void run() {
        System.out.println("run B");
    }
}
