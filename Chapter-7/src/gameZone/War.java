package gameZone;

public class War {
    public static void main(String args[])
    {
        final int CARDS_IN_SUIT = 13;
        int myValue;
        int yourValue;
        int mySuitPlace;
        int yourSuitPlace;
        String yourSuitValue;
        String mySuitValue;
        String suits[] = {"Spades", "Hearts", "Diamonds", "Clubs"};


        myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        yourValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        mySuitPlace = ((int)(Math.random() * 4) % suits.length);
        yourSuitPlace = ((int)(Math.random() * 4) % suits.length);
        mySuitValue = suits[mySuitPlace];
        yourSuitValue = suits[yourSuitPlace];

        if (myValue > 1 && myValue < 10)
        {
            System.out.println("My card is the " + myValue + " of " + mySuitValue);
        }
        else
        {
            if (myValue == 10)
            {
                System.out.println("My card is the Jack of " + mySuitValue);
            }
            else if (myValue == 11)
            {
                System.out.println("My card is the Queen of " + mySuitValue);
            }
            else if (myValue == 12)
            {
                System.out.println("My card is the King of " + mySuitValue);
            }
            else if (myValue == 1)
            {
                System.out.println("My card is the Ace of " + mySuitValue);
            }
        }

        if (yourValue > 1 && yourValue < 11) {

            System.out.println("Your card is the " + yourValue + " of " + yourSuitValue);
        }
        else
        {
            if (yourValue == 10)
            {
                System.out.println("Your card is the Jack of " + yourSuitValue);
            }
            else if (yourValue == 11)
            {
                System.out.println("Your card is the Queen of " + yourSuitValue);
            }
            else if (yourValue == 12)
            {
                System.out.println("Your card is the King of " + yourSuitValue);
            }
            else if (yourValue == 1)
            {
                System.out.println("Your card is the Ace of " + yourSuitValue);
            }

        }
        if (myValue > yourValue)
        {
            System.out.println("I WIN!");
        }
        else if (yourValue > myValue)
        {
            System.out.println("You win...");
        }
        else
        {
            System.out.println("It's a tie...");
        }
    }
}