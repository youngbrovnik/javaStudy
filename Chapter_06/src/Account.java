public class Account {
    private String mAno;
    private String mOwner;
    private int mBalance;

    public Account(String ano, String owner, int balance) {
        mAno = ano;
        mOwner = owner;
        mBalance = balance;
    }

    public String getAno() { return mAno; }
    public void setAno(String ano) { mAno = ano; }
    public String getOwner() { return mOwner; }
    public void setOwner(String owner) { mOwner = owner; }
    public int getBalance() {return mBalance; }
    public void setBalance(int balance) { mBalance = balance;}
}
