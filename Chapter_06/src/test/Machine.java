package test;

public class Machine {

    // Class Variable(Field);
    public int mKm;

    // Constructor, Creator;
    public Machine() {
        mKm = 0;
    }

    public Machine(int km) {
        mKm = km;
    }

    // Method;
    public void move() {
        System.out.println("Machine, move(), km = " + mKm);
    }
}


// public protected private
