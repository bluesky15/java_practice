package com.all.numberproblem;

import java.util.*;

public class NumberProblem {
    static int input = 0;
    static String output = "";
    static int initialThreshold = 10;
    static int threshold = initialThreshold;

    public static void main(String[] args) {
        getInput();
        if (input > initialThreshold) {
            reduceTheNumber(insertDigitsInAQueue(input + ""));
            System.out.println("reduced Number: "+output);
        }
    }

    private static void getInput() {
        Scanner sn = new Scanner(System.in);
        try {
            input = sn.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter Integer Number only!");
            getInput();
        }
    }

    private static Deque<String> insertDigitsInAQueue(String number) {
        Deque<String> numberQueue = new LinkedList<>();
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            numberQueue.add(ch + "");
        }
        return numberQueue;
    }

    private static void reduceTheNumber(Deque<String> number) {
        Deque<String> holder = new LinkedList<>();
        int sum = 0;
        Iterator it = number.iterator();
        while (it.hasNext()) {
            sum = sum + Integer.parseInt(String.valueOf(it.next()));
            if (sum > threshold) {
                threshold = sum;
                for (String q : insertDigitsInAQueue(sum + "")) {
                    holder.add(q);
                }
                sum = 0;
            }
            if (sum != 0 && sum < threshold && it.hasNext() == false) {
                threshold = initialThreshold;
                for (String q : insertDigitsInAQueue(sum + "")) {
                    holder.add(q);
                }
                sum = 0;
            }
        }
        String newNumber = "";
        for (String s : holder) {
            newNumber = newNumber + s;
        }
        holder.clear();
        if (Integer.parseInt(newNumber) > initialThreshold) {
            reduceTheNumber(insertDigitsInAQueue(newNumber));
        } else {
            output = newNumber;
        }
    }
}
