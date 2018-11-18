package test.ch9;

public class ClassName {


    public int mIndex;
    private int mPrivate;

    public ClassName(int index) {
        mIndex = index;
    }

    public ClassName() {

    }

    private void test() {
        NestedClassName nc = new NestedClassName();
        nc.mPrivateNested = 10;
    }


    public class NestedClassName {

        public int mInt;
        private int mPrivateNested;

        public NestedClassName(int x) {

        }

        public NestedClassName() {

        }

        public void test() {
            mIndex = mInt;
            mPrivate = mInt;
        }

    }

    public static class X {
        public static void test() {

        }
    }




//    public static class NestedStaticClassName {
//
//        public static int mInt;
//
//        public void test() {
//            mInt = mIndex;
//        }
//    }
//
//    public void method() {
//        class X {
//
//        }
//    }

}
