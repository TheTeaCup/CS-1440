import java.util.*;
import java.io.*;

public class Magic8Ball
{
    private static final int NUM_RESPONSES = 12;
    private String[] responses;
    private Random generator;

    public Magic8Ball()
    {
        responses = new String[NUM_RESPONSES];
        try (BufferedReader reader = new BufferedReader(new FileReader("responses.txt"))) {
            for (int i = 0; i < NUM_RESPONSES; i++) {
                responses[i] = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading responses file: " + e.getMessage());
        }
        generator = new Random();
    }

    private void prompt()
    {
        System.out.println("Ask the Magic 8 Ball a question (or type 'quit' to exit):");
    }

    private String generateResponse()
    {
        int randomIndex = generator.nextInt(NUM_RESPONSES);
        return responses[randomIndex];
    }

    public void consult()
    {
        boolean run = true;

        while (run)
        {
            prompt();
            Scanner scan = new Scanner(System.in);
            String res = scan.nextLine();

            if (res.equals("quit"))
            {
                run = false;
                System.out.println("Goodbye!");
            }
            else
            {
                System.out.println("Magic8Ball says: " + generateResponse());
            }
        }
    }

    public static void main(String[] args)
    {
        Magic8Ball magic8Ball = new Magic8Ball();
        magic8Ball.consult();
    }
}
