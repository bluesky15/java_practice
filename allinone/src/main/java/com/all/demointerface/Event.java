package com.all.demointerface;

public class Event {
    private OnEventListener mOnEventListener;

    public void setOnEventListener(OnEventListener listener) {
        mOnEventListener = listener;
    }

    public void doEvent() {
        EventResult eventResult = new EventResult();
        eventResult.setSomeEvent("click event");
        /*
         * code code code
         */

        // and in the end

        if (mOnEventListener != null)
            mOnEventListener.onEvent(eventResult); // event result object :)
    }
}