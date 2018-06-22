package com.all.stream;

import java.util.Arrays;

public class StreamDemo {
    public static void main(String[] args) {
        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
