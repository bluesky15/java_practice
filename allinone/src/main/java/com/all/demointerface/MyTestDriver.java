package com.all.demointerface;

public class MyTestDriver {
    public static void main(String[] args) {
        Test_A a = new Test_A();
        TestB b = new TestB();
        Event e = new Event();
        e.setOnEventListener(new OnEventListener() {
            public void onEvent(EventResult er) {
                // do your work.
            }
        });
        e.doEvent();
    }
}
