package exercises;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nameOne = null;
        String nameTwo = null;
        String nameThree = null;
        System.out.println("Let's enter baby names!");
        System.out.println("Enter name 1! >>> ");
        nameOne = input.nextLine();
        System.out.println("Enter name 2! >>> ");
        nameTwo = input.nextLine();
        System.out.println("Enter name 3! >>> ");
        nameThree = input.nextLine();

        System.out.println("Name combination 1 : " + nameOne + ", " + nameTwo);
        System.out.println("Name combination 2 : " + nameOne + ", " + nameThree);
        System.out.println("Name combination 3 : " + nameTwo + ", " + nameOne);
        System.out.println("Name combination 4 : " + nameTwo + ", " + nameThree);
        System.out.println("Name combination 5 : " + nameThree + ", " + nameOne);
        System.out.println("Name combination 6 : " + nameThree + ", " + nameTwo);
    }
}
