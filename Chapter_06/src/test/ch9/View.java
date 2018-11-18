package test.ch9;

public class View {

    public interface OnClickListener{
        void onClick();
    }

    public void onClick() {
        if (mOnClickListener != null) {
            mOnClickListener.onClick();
        }
    }


//    public boolean isClicked() {
//        return false;
//    }



    private OnClickListener mOnClickListener;

    public void setOnClickListener(OnClickListener listener) {
        mOnClickListener = listener;
    }




}
