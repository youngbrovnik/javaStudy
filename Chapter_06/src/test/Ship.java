package test;

public class Ship extends Machine {

    @Override
    public void move() {
        System.out.println("Ship, move(), km = " + mKm);
    }
}
