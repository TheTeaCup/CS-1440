import java.util.Scanner; 

/** * Activity1PayStub class is part of Lab 3 and 
 * creates a simple pay stub. 
 * 
 * @author Hunter_Wilson 
 * @version 9.12.2023 
 */ 
public class Activity2PayStub 
{ 
    public static final double OVERTIME_RATE = 1.5;
    public static final double SS_RATE = 0.1;
    public static final double TAX_RATE = 0.2;

    private String employeeName;
    private String employeeSSN;
    private int hours;
    private int hoursOvr;
    private double hourlyRat;
    private double regularPay;
    private double overtimePayRate; 
    private double overtimePay;
    private double ssHolding; 
    private double fedTax; 
    private double netPay;
    private double grossPay;
    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Create an Activity2Paystub object
        //a2ps is an Activity2PayStub object 
        Activity2PayStub a2ps = new Activity2PayStub();

        //call the methods inside of an Activity2PayStub object 
        a2ps.getInput(scan);
        a2ps.calculate();
        a2ps.printPayStub();
    }

    /** * getInput gets input from keyboard.
     * 
     * @author Hunter_Wilson 
     * @version 9.12.2023 
     * @param scan is the scanner
     */ 
    public void getInput(Scanner scan) 
    { 
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
    } 
    
    /** * calculate, calculates the pay and such.
     * 
     * @author Hunter_Wilson 
     * @version 9.12.2023 
     */ 
    public void calculate() 
    { 
        regularPay = (double) hours * (double) hourlyRat;
        overtimePayRate = hourlyRat * OVERTIME_RATE;
        overtimePay = hoursOvr * overtimePayRate;
        grossPay = regularPay + overtimePay;
        ssHolding = grossPay * SS_RATE;
        fedTax = (grossPay - ssHolding) * TAX_RATE;
        netPay = (grossPay - ssHolding) - fedTax;
    } 

    /** * printPayStub, prints the paystub in terminal.
     * 
     * @author Hunter_Wilson 
     * @version 9.12.2023 
     */
    public void printPayStub() 
    { 
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
