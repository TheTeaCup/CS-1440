import java.util.Scanner;

/**
 * MonetaryUnits Class.
 *
 * @author Hunter.Wilson
 * @version 09.25.2023
 */

public class MonetaryUnits {
    /**
     * Main statement.
     * This gets an amount from a user,
     * and tells them the monetary units.
     *
     * @param args none collected
     */
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an amount in double for dollars: $");
        double money = kb.nextDouble();

        int cents = (int) (money * 100);

        int dollars = cents / 100;
        cents %= 100;

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickles = cents / 5;
        cents %= 5;

        int pennies = cents;

        // output the results
        System.out.printf("Your amount $%.2f consists of:\n", money);
        System.out.printf("\t%d dollars\n", dollars);
        System.out.printf("\t%d quarters\n", quarters);
        System.out.printf("\t%d dimes\n", dimes);
        System.out.printf("\t%d nickels\n", nickles);
        System.out.printf("\t%d pennies\n", pennies);

    }
}
