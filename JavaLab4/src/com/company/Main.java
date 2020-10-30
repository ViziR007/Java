package com.company;

public class Main {

    public static void main(String[] args) {

        char[] ch = {'A', 'Q'};
        boolean ans = hasNoneLetters("sdf ghs", ch);
        System.out.print("Answer: " + ans);

    }


    public static boolean hasNoneLetters(String phrase, char[] blackList) {

        phrase = phrase.toLowerCase();
        char[] phraseChars = phrase.toCharArray();

        for(int i=0; i<phraseChars.length; i++) { //i - phrase
            for(int j=0; j<blackList.length; j++) { //j - letter
                if(phraseChars[i] == Character.toLowerCase(blackList[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
