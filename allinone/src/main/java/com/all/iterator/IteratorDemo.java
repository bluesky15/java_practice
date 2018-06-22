package com.all.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> androidNames = Arrays.asList("Donut", "Eclair"
                , "Froyo", "Gingerbread", "Honeycomb"
                , "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop"
                , "Marshmallow", "Nougat", "Oreo", "Android P");
        Iterator itr = androidNames.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.printf(element + ", ");
        }
    }
}
