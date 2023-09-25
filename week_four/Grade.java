import java.util.Scanner;

public class Grade
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter grade: ");
        int grade = kb.nextInt();
        validGrade(grade);
    }

    public static void grade(int grade)
    {
        char letter = 'F';
        if (grade >= 90)
        {
            letter = 'A';
        }
        else
        {
            if (grade >= 80)
            {
                letter = 'B';
            }
            else
            {
                if (grade >= 70)
                {
                    letter = 'C';
                }
                else
                {
                    if (grade >= 60)
                    {
                        letter = 'D';
                    }
                    /*
                    else
                    {
                        letter = 'F';
                    }
                    */
                }
            }
        }
        System.out.println("Letter grade: " + letter);
    }

    public static void gradeImproved(int grade)
    {
        char letter = 'F';
        // if-else-if statement
        if (grade >= 90)
        {
            letter = 'A';
        }
        else if (grade >= 80)
        {
            letter = 'B';
        }
        else if (grade >= 70)
        {
            letter = 'C';
        }
        else if (grade >= 60)
        {
            letter = 'D';
        }
        else
        {
            letter = 'F';
        }
        System.out.println("Letter grade: " + letter);
    }

    public static void validGrade(int grade)
    {
        // logical operators
        // And (&&), Or (||), Not (!)
        // true && false = false
        // true && true = true
        // false && false = false
        // true || false = true
        // true || true = true
        // false || false = false
        // !true = false
        // !false = true
        if (grade >= 0 && grade <= 100)
        {
            gradeImproved(grade);
        }
        else
        {
            System.out.println("Invalid grade");
        }
    }
}
