package com.all.RxJava;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

public class RxDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Flowable.fromCallable(() -> {
            Thread.sleep(3000); //  imitate expensive computation
            return "Done";
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.single())
                .subscribe(System.out::println, Throwable::printStackTrace);

        Thread.sleep(4000);
    }
}

//    Flowable<String> source = Flowable.fromCallable(() -> {
//        Thread.sleep(1000); //  imitate expensive computation
//        return "Done";
//    });
//
//    Flowable<String> runBackground = source.subscribeOn(Schedulers.io());
//
//    Flowable<String> showForeground = runBackground.observeOn(Schedulers.single());
//
//    showForeground.subscribe(System.out::println, Throwable::printStackTrace);
//
//    Thread.sleep(2000);
