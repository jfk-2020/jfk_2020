package com.jfk.homework08;

public class duplicatedWord {
    public static void main(String[] args) {
        String sentence = "Find the words that are being duplicated. Print count of words.";
        int count;

        //Split the string into words using built-in function
        String words[] = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                }
            }
            //Displays the duplicate word if count is greater than 1
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}
