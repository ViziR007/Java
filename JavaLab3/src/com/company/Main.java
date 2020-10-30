package com.company;

public class Main {

    public static void main(String[] args) {
        CheckString stringCheck = new CheckString();
        stringCheck.findBiggestWord("sixth five olikolikol ");
        System.out.print("\n");
        System.out.print(stringCheck.findBiggestWord2("olikolikololikolikol sixth five olikolikol"));
    }
}