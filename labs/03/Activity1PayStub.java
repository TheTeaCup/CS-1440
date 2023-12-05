import java.util.Scanner;

/**
 * Activity1PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 *
 * @author Hunter_Wilson
 * @version 9.12.2023
 */
public class Activity1PayStub {
    public static final double OVERTIME_RATE = 1.5;
    public static final double SS_RATE = 0.1;
    public static final double TAX_RATE = 0.2;

    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String employeeName;
        String employeeSSN;
        int hours;
        int hoursOvr;
        double hourlyRat;
        double regularPay;
        double overtimePayRate;
        double overtimePay;
        double ssHolding;
        double fedTax;
        double netPay;
        double grossPay;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = scan.nextLine();

        System.out.print("Enter Employee SSN: ");
        employeeSSN = scan.nextLine();

        System.out.print("Enter Regular Hours Worked: ");
        hours = scan.nextInt();

        System.out.print("Enter Overtime Hours Worked: ");
        hoursOvr = scan.nextInt();

        System.out.print("Enter Hourly Pay Rate: ");
        hourlyRat = scan.nextDouble();

        regularPay = (double) hours * hourlyRat;
        overtimePayRate = hourlyRat * OVERTIME_RATE;
        overtimePay = hoursOvr * overtimePayRate;
        grossPay = regularPay + overtimePay;
        ssHolding = grossPay * SS_RATE;
        fedTax = (grossPay - ssHolding) * TAX_RATE;
        netPay = (grossPay - ssHolding) - fedTax;

        String ln1 = "________________________________";
        String ln2 = "Name: %-37s SSN: %-11s\n";
        String ln3 = "Regular Hours: %-8d Reg Rate: $%-8.2f Reg Pay: $%-8.2f\n";
        String ln4 = "Overtime Hours: %-8dOT Rate: $%-8.2f  OT Pay: $%-8.2f\n";
        String ln5 = "Gross Pay: $%-8.2f\n";
        String ln6 = "SS Withholding: $%-8.2f\n";
        String ln7 = "Federal Tax: $%-8.2f\n";
        String ln8 = "Net Pay: $%-8.2f\n";

        // Display output
        System.out.print(ln1 + ln1 + "\n");
        System.out.printf(ln2, employeeName, employeeSSN);
        System.out.printf(ln3, hours, hourlyRat, regularPay);
        System.out.printf(ln4, hoursOvr, overtimePayRate, overtimePay);
        System.out.printf(ln5, grossPay);
        System.out.printf(ln6, ssHolding);
        System.out.printf(ln7, fedTax);
        System.out.printf(ln8, netPay);
        System.out.println(ln1 + ln1);
    }
}
