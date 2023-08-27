package com.bantunes82;

@FunctionalInterface
public interface MyInterface {

    void doSomething();

    default void doOtherThing(){
        System.out.println("abc");
    }
}
