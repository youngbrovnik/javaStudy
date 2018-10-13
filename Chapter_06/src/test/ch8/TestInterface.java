package test.ch8;

public interface TestInterface {
    int NUM = 0;

    void testMethod();

    default void defaultMethod() {
        System.out.println("asfdasf");
    }
}
