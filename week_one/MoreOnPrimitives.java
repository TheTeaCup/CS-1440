public class MoreOnPrimitives
{
    public static void main(String[] args)
    {
        // Negation: "-" is Unary, one value
        // +, -, *, /, % are binary and take two values
        // follows pemdas rules
        
        System.out.println(1 + 2 * 3);   // 7
        System.out.println((1 + 2) * 3); // 9
        
        // Exponents
        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.sqrt(16)); // 4.0
        System.out.println(Math.pow(27, 1.0/3)); // 3.0
        
        // Combined assignment operators
        int y = 5;
        System.out.println(y); // 5
        y += 1;
        System.out.println(y); // 6
        y -= 1;
        System.out.println(y); // 5
        y *= 2;
        System.out.println(y); // 10
        y /= 2;
        System.out.println(y); // 5
        y %= 2;
        System.out.println(y); // 1
        
        y++; // increment
        System.out.println(y); // 2
        
        y--; // decrement
        System.out.println(y); // 1
        
        // converting primitive types
        int z = 5;
        double a = z;
        System.out.println(z); // 5
        System.out.println(a); // 5.0
        // z = a; int has lower rank than double
        
        short b = 10;
        b = (short)z;
        System.out.println(b);
        System.out.println(z);
        
        // mixed mathematical expressions
        short s1 = 5;
        short s2 = 2;
        short s3 = (short)(s1 + s2);
        
        
        
    }
}