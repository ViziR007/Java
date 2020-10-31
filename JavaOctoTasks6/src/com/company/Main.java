package com.company;


public class Main {

    public static void main(String[] args) {
        DigitalRootOperation digitalRootOperation = new DigitalRootOperation();
        HoursOperation hoursOperation = new HoursOperation();
        SentencesOperation sentencesOperation = new SentencesOperation();
        MultipliesOperation multipliesOperation = new MultipliesOperation();
        SortOddNumber sortOddNumber = new SortOddNumber();
        ArrayFinder arrayFinder = new ArrayFinder();


        System.out.print(digitalRootOperation.caclDigitalRoot(132189) + "\n");

        try {
            System.out.print(hoursOperation.secondsToTime(359999) + "\n");
        } catch (Exception e) {
            System.out.print("somehow another time  :)");
        }

        System.out.print(sentencesOperation.getlenghtOfLongestWord("         fghedfhshd    yes     wait      kek  i       " )+ "\n");
        System.out.print(sentencesOperation.hasNoneLetters("Sorry, i not wait anymore", new char[]{'w'}) + "\n");
        for (int n: multipliesOperation.findMultiplies(3, 4)) {
            System.out.println(n);
        }

        for (String n: sentencesOperation.getReverse(new String[]{"Dont", "happy", ",", "be", "sad!"})) {
            System.out.print(n + ", ");
        }

        System.out.println();

        for (int c: sortOddNumber.sortArray(new int[]{5, 3, 2, 8, 1, 4})) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.print(arrayFinder.findUniq(new double[]{1,1,1,1,-1,1,1,1,1}));
    }
}