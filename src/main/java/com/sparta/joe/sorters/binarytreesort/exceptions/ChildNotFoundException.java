package com.sparta.joe.sorters.binarytreesort.exceptions;

public class ChildNotFoundException extends Throwable {

    public ChildNotFoundException(String childSide, int specifiedInt) {
        System.out.println("Specified integer (" + specifiedInt + ") does not have a child on the " + childSide + " side.");
    }

}
