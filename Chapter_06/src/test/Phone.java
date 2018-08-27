package test;

public class Phone {


//    public String mName;
    public final String mName;

    public static final String sName = "PHONE";


    public Phone(String name) {
        mName = name;
//        sName = name;
    }

    public void test(String name) {
//        mName = name;
    }

    public String getStaticName() {
        return sName;
    }




}
