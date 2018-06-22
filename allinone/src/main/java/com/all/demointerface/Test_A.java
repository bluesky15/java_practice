package com.all.demointerface;

public class Test_A implements OnEventListener {


    @Override
    public void onEvent(EventResult eventResult) {
        System.out.printf("Event received at A");
    }
}
