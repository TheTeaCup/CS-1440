import java.util.Scanner;

public class ComparingStrings
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter name 1: ");
        String name1 = kb.nextLine();

        System.out.print("Enter name 2: ");
        String name2 = kb.nextLine();

        /*
        if(name1 == name2)
        {
            System.out.println("name1 equals name2");
        }
        else
        {
            System.out.println("name1 does not equal name2");
        }
        */

        if(name1.equals(name2)) // compares string contents
        {
            System.out.println("name1 equals name2");
        }
        else
        {
            System.out.println("name1 does not equal name2");
        }
    }
}
