package com.all.demointerface;

public class TestB implements OnEventListener{

    @Override
    public void onEvent(EventResult eventResult) {
        System.out.printf("Event received at B");
    }
}
