package com.all.RxJava;

import io.reactivex.*;

public class RxJavaDemo {


    public static void main(String[] args) {
        Flowable.just("Hello world")
                .subscribe(System.out::println);
    }

//    Flowable.just("Hello world")
//            .subscribe(new Consumer<String>() {
//        @Override public void accept(String s) {
//            System.out.println(s);
//        }
//    });
}

