public class Sales
{
    public static void main(String[ ] args) 
    {
        System.out.println("Enter a purchase amount: ");
        double purchaseAmount = Given.getDouble();
        double stateTax, countyTax, totalTax, totalPrice;
        stateTax = purchaseAmount * (5/100.0);
        countyTax = purchaseAmount * (3/100.0);
        totalTax = stateTax + countyTax;
        totalPrice = purchaseAmount + totalTax;
        
        System.out.println("Amount of Purchase:\t$" + purchaseAmount);
        System.out.println("State Sales Tax Paid:\t$" + stateTax);
        System.out.println("County Sales Tax Paid:\t$" + countyTax);
        System.out.println("Total Sales Tax Paid:\t$" + totalTax);
        System.out.println("Total Sales Price:\t$" + totalPrice);
    }
}