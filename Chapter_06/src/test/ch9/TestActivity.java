package test.ch9;

public class TestActivity implements Button.OnClickListener {

    private Button mButton;


    public void onCreate() {

        mButton = new Button();

        // # 1;
        mButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                // #1, Touch event;
            }
        });

//        // # 1 - 2;
//        mButton.setOnClickListener( () -> {
//            // 1 - 2; Touch event;
//        });

        // # 2;
        mButton.setOnClickListener(mOnClickListener);

        // # 3;
        mButton.setOnClickListener(this);
    }

    public Button.OnClickListener mOnClickListener = new Button.OnClickListener() {
        @Override
        public void onClick() {
            // #2, Touch event;
        }
    };

    @Override
    public void onClick() {
        // #3, Touch event;
    }

    // pp.414;
    private int mCount = 0;

    private void testLocalVariableInAnonymous() {

        int count = mCount;
        final int countFinal = mCount;


        mButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                int x = 10;
                x = x + 1;

//                count = count + 1;
                mCount = countFinal + 1;
            }
        });

        callNpe();

        checkNpe();

    }


    private void checkNpe() throws ClassNotFoundException {
        // ...

        Class clazz = Class.forName("java.lang.String2");

//        try {
//            Class clazz = Class.forName("java.lang.String2");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    private void callNpe() {
        try {
            checkNpe();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
