package com.all.other;

public class ArgumentDemo {

    {
        System.out.println(1);
    }

    static {
        System.out.println(2);
    }


    public static void main(String[] args) {
        ArgumentDemo a = new ArgumentDemo() {
        };
    }
}

class A {
    int x = 10;
    class B extends A {
        class C extends B {
            class D extends C {
                {
                    System.out.println(x);
                }
            }
        }
    }
}



