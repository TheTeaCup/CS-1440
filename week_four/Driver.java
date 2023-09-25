import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {

        Scanner kb = new Scanner(System.in);
        /*
        double total = kb.nextDouble();

        if (total >= 50)
        {
            System.out.println("Discount applied");
            total *= .9;
        }

        System.out.println("New total: " + total);
        */
        // Relational operators
        // > < >= <= == !=

        char lowerA = 'a'; // 97
        char upperA = 'A'; // 65
        char input = kb.nextLine().charAt(0);

        if (input == lowerA)
        {
            System.out.println("input is a");
        }

        if (input < lowerA)
        {
            System.out.println("input might "
                    + "be uppercase");
        }

        // Flags
        // used to signal a condition
        // in our program
        boolean greatScore = false;
        int score = kb.nextInt();

        if (score > 95)
        {
            greatScore = true;
        }

        // doing a bunch of different things

        if (greatScore)
        {
            System.out.println("Great score!");
        }

        // doing a bunch of different things

        int highScore = 98;
        if (greatScore)
        {
            if (score > highScore)
            {
                highScore = score;
                System.out.println("High score!");
            }
        }
    }
}
