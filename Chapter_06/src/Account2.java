public class Account2 {
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    int balance = 0;

    int getBalance() {
       return balance;
    }

    int setBalance(int inpVal) {
        if (balance + inpVal > MIN_BALANCE && balance + inpVal < MAX_BALANCE && inpVal > 0)
            balance = balance + inpVal;
        return balance;
    }
}
