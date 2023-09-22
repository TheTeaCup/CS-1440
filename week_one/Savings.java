public class Savings {
    public static void main(String[] args) {
        final double INTEREST_RATE = 0.02;

        double savings = 100;
        double newSavings = savings + savings * INTEREST_RATE;

        System.out.println(newSavings);
    }
}