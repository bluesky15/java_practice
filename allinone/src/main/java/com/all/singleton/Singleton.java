package com.all.singleton;

public class Singleton {
    private static Singleton _instance;

    private Singleton() {

    }

    // double check locking pattern
    public static Singleton getInstance() {
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) {
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }

    public void logMsg() {
        System.out.println("This is a singleton object!");
    }
}
