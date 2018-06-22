package com.all.RxJava;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class RxJava2Example
{
    public static void main(String[] args)
    {
        //producer
//        Observable<String> observable = Observable.just("how", "to", "do", "in", "java");
////
////        //consumer
////        Consumer<? super String> consumer = System.out::println;
////
////        //Attaching producer to consumer
////        observable.map(s->s.toUpperCase()).subscribe(consumer);
        Observable.just("how", "to", "do", "in", "java")
                .map(t->t.toUpperCase())
                .subscribe(System.out::println);
    }
}