package com.all.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    public void singletonTest(){
        assertEquals(true, Singleton.getInstance().equals(Singleton.getInstance()));
    }

}