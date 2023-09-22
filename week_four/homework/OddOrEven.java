import java.util.Scanner;

public class OddOrEven {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int numb;
        System.out.println("Please enter an integer: ");
        numb = input.nextInt();
        
        if (numb % 2 == 0)
        {
            System.out.println("The input is even");
        } else {
            System.out.println("The input is odd");
        }
    }
}
