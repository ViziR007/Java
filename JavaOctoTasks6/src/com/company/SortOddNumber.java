package com.company;

import java.util.Arrays;

public class SortOddNumber {
    public int[] sortArray(int[] numbers){
        int arraySize = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0)
                arraySize++;
        }

        int[] tempArray = new int[arraySize];
        int j = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0)
                tempArray[j++] = numbers[i];
        }

        Arrays.sort(tempArray);

        j = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0)
                numbers[i] = tempArray[j++];

        }

        return numbers;
    }
}