package com.all.RxJava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

import java.util.ArrayList;
import java.util.List;

public class RxDemo3 {
    List<String> deviceList = new ArrayList<>();
    void setTestPorts() {
        deviceList.add("Port_Address1");
        deviceList.add("Port_Address2");
        deviceList.add("Port_Address3");
        deviceList.add("Port_Address4");
        deviceList.add("Port_Address");
        deviceList.add("Port_Address5");
        deviceList.add("Port_Address6");
    }
    public void testPortConnection() {
        try {
            Observable observableName = Observable.fromIterable(deviceList);
            observableName
                    .flatMap(new Function<String, Observable<String>>() {
                        @Override
                        public Observable<String> apply(String device) throws Exception {
                            return Observable.create(new ObservableOnSubscribe<String>() {
                                @Override
                                public void subscribe(ObservableEmitter<String> observableEmitter) throws Exception {
                                    try {
                                        System.out.println("Test and connect to port connection:"+device);
                                        String portAddress = checkPortConnection(device);
                                        observableEmitter.onNext(portAddress);
                                        observableEmitter.onComplete();
                                    } catch (Exception e) {
                                        System.out.println("Problem connecting to port:"+device);
                                    }
                                }
                            });
                        }
                    })
                    .take(1)
                    .subscribe(getObserver());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String checkPortConnection(String deviceID) throws Exception {
        if ("Port_Address".equals(deviceID) || "Port_Address5".equals(deviceID)) {
            return deviceID;
        }
        throw new Exception("Not connected.");
    }
    public static void main(String[] args) {
        System.out.println("Test port connection.");
        RxDemo3 test = new RxDemo3();
        test.setTestPorts();
        test.testPortConnection();
    }
    private Observer<String> getObserver() {
        return new Observer<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("Subscribed to observable.");
            }
            @Override
            public void onNext(String s) {
                System.out.println("**** Port Connected:" + s +" ****");
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onComplete() {
                System.out.println("connect process completed");
            }
        };
    }
}