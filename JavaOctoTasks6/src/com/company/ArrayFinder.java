package com.company;

public class ArrayFinder {
    public double findUniq(double[] numbers){
        int count = 0;
        double temp = 0;
        for (int i = 0; i < 3; i++){
            if(numbers[0] == numbers[i])
                count++;

            if(count > 1)
                temp = numbers[0];
        }

        if(count <= 1)
            return numbers[0];

        for (int i = 3; i < numbers.length; i++){
            if(temp != numbers[i])
                return numbers[i];
        }
        return 0;
    }
}