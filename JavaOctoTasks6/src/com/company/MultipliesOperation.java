package com.company;

public class MultipliesOperation {
    public int[] findMultiplies(int x, int number) {

        if (x == 1)
            return new int[]{number};
        else {
            int[] numbers = new int[x];
            numbers[0] = number;
            for (int i = 1; i < x; i++) {
                numbers[i] = numbers[i - 1] + number ;
            }
            return numbers;
        }
    }
}