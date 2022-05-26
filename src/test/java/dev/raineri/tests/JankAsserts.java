package dev.raineri.tests;

public class JankAsserts {

    public static void assertEquals(Object o1, Object o2){
        if(!o1.equals(o2)){
            throw  new Error("Values were NOT EQUAL " + o1+ " " + o2);
        }
    }
}
