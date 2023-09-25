
public class SimpleMath
{
    public static void main(String[] args)
    {
        evenOrOdd(2);
        evenOrOdd(3);
    }

    public static void evenOrOdd(int x)
    {
        // check if x is even
        if (x % 2 == 0)
        {
            System.out.printf("%d is even\n", x);
        }
        else
        {
            System.out.printf("%d is odd\n", x);
        }
    }
}
