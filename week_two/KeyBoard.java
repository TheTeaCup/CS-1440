import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a character: ");
        int c = System.in.read();
        System.out.println((char)c);
        
        // scanner
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a double: ");
        double db = kb.nextDouble();
        System.out.println(db);
        
        System.out.println("Enter a int: ");
        int i = kb.nextInt();
        System.out.println(i);
        
        
    }
}