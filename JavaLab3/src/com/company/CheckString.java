package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class CheckString {
    public void findBiggestWord(String sentence){
        char[] chars = sentence.toCharArray();
        int value = 0;
        StringBuilder biggestWord = new StringBuilder();
        StringBuilder tempBiggestWord = new StringBuilder();
        int temp = 0;

        for(int i = 0; i < sentence.length(); i++){

            if(chars[i] != ' ') {
                temp++;
                tempBiggestWord.append(chars[i]);
            }

            else {
                if(value < temp) {
                    value = temp;
                    biggestWord = tempBiggestWord;
                    tempBiggestWord = new StringBuilder();
                    temp = 0;
                }
            }

        }
        System.out.print(biggestWord);
    }

    public int findBiggestWord2(String string)
    {
        String[] Words = string.split("\\s+");
        System.out.print(Arrays.stream(Words).max(Comparator.comparingInt(String :: length)));
        return Arrays.stream(Words).max(Comparator.comparingInt(String :: length)).get().length();
    }
}
