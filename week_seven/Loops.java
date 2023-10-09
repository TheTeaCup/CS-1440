import java.util.Scanner;

public class Loop
{
    public static void main(String[] args)
    {
        // while loop
        // pretest
        int x = 0;
        while (x < 5) // as long as x is less than 5
        {
            System.out.println("while: " + x);
            x++;
        }

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Yes or No: ");
        String input = kb.nextLine();

        while (!input.equals("Yes")
                && !input.equals("No"))
        {
            System.out.print("Enter Yes or No: ");
            input = kb.nextLine();

            if (input.equals("Stop"))
            {
                break;
            }

            if (input.equals("Skip"))
            {
                continue;
            }

            System.out.println("Iteration completed");
        }

        // do-while loop
        // posttest loop
        do
        {
            System.out.println("do-while: " + x);
            x++;
        }
        while (x < 5);

        int y = 0;
        do
        {
            System.out.println("do-while: " + y);
            y++;
        }
        while (y < 5);

        // for int
        // pre test
        for (int i =0, j = 0; i < 5; i++)
        {
            System.out.println("for: " + i);
        }
    }
}
