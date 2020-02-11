package exercises;

import java.util.Scanner;

public class CountMovieSpaces {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String movieQuote = null;
        int whiteSpaceTally = 0;

        System.out.println("ENTER YOUR FAVORITE MOVIE QUOTE >>> ");
        movieQuote = input.nextLine();

        for (int i = 0; i < movieQuote.length(); ++i)
        {
            if(movieQuote.charAt(i) == ' ') {
                ++whiteSpaceTally;
            }
        }
        if (whiteSpaceTally == 1)
        {
            System.out.println("THERE IS " + whiteSpaceTally + " SPACE IN THE QUOTE '" + movieQuote + "'");
        }
        else
        {
            System.out.println("THERE ARE " + whiteSpaceTally + " SPACES IN THE QUOTE '" + movieQuote + "'");
        }


    }

}
