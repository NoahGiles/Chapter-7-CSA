package exercises;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {

        String word;
        String modifiedWord;
        int wordLength;
        int timesPrinted = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word and I'll convert it to Pig Latin >>> ");
        word = input.nextLine();
        wordLength = word.length();
        for(int i = 0; i < wordLength; ++i)
        {
            if (word.substring(i).toLowerCase() == "a" ||
                    word.substring(i).toLowerCase() == "e" || word.substring(i).toLowerCase() == "i" ||
                    word.substring(i).toLowerCase() == "o" || word.substring(i).toLowerCase() == "u" && i > 1 || i > 2)
            {
            }
            else if (timesPrinted < 1)
            {
                modifiedWord = word.substring(i + 1, wordLength) + word.charAt(i) + "ay";
                System.out.println(word + " in Pig Latin is " + modifiedWord + ".");
                ++timesPrinted;
                ++i;
            }

        }


    }
}

