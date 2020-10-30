package com.company;

public class Main {

    public static void main(String[] args) {


        int[] a = findMultiples(3, 4);

       for(int i =0; i< 3; i++)
           System.out.println("Answer: " + a[i]);
    }

    public static int[] findMultiples(int x, int n) {

        int i = 1;
        int[] multiples = new int[x];
        multiples[0] = n; 
        int number = n+1;

        while (i != x) {
            if(number % n == 0) {
                multiples[i++] = number;
            }
            number++;
        }

        return multiples;
    }
}
