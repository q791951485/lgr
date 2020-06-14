package com.lgr.lgrorder.entity;


public class TeseEntity<T> {

    public T name;


    public TeseEntity(T name) {
        this.name = name;
    }


    public static <T> void printName(T[] names){

    }
}
