package com.shape.util;

public class IdGenerator {
    private static int id;

    public static int generateId(){
        return id++;
    }
}
