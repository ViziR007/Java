package com.company;

public class SentencesOperation {
    public int getlenghtOfLongestWord(String Word){
        char[] newWord = Word.toCharArray();
        int lenght = 0;
        int tempLenght = 0;
        for (int i = 0; i < Word.length(); i++){
            if(newWord[i] == ' ') {
                if(tempLenght > lenght) {
                    lenght = tempLenght;
                }
                tempLenght = 0;
            }
            else if(i == Word.length() - 1){
                tempLenght++;
                if(tempLenght > lenght) {
                    lenght = tempLenght;
                }
            }
            else
                tempLenght++;
        }
        return lenght;
    }

    public boolean hasNoneLetters(String phrase, char[] blacklist){
        char[] charPhrase = phrase.toCharArray();

        for (char c: charPhrase) {
            for (char b: blacklist) {
                if(Character.toLowerCase(c) == Character.toLowerCase(b))
                    return false;
            }
        }
        return true;
    }

    public String[] getReverse(String[] sentence){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sentence.length; i++) {
            stringBuilder.append(sentence[i]);
        }
        String str = stringBuilder.reverse().toString();
        String[] newString = new String[sentence.length];
        for (int i = 0; i < sentence.length; i++){
            newString[i] = str.substring(0, sentence[i].length());
            str = str.substring(sentence[i].length());
        }
        return newString;
    }
}