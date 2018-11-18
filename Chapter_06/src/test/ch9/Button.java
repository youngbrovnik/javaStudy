package test.ch9;

import java.util.List;

public class Button {

    interface OnClickListener {
        void onClick();
    }

    void touch() {
        if (mListener != null) {
            mListener.onClick();
        }

//        for (OnClickListener listener : mListeners) {
//            listener.onClick();
//        }

    }

    private OnClickListener mListener;

//    private List<OnClickListener> mListeners;

    public void setOnClickListener(OnClickListener listener) {
        mListener = listener;
    }

//    public void addOnClickListener(OnClickListener listener) {
//        mListeners.add(listener);
//    }


}
