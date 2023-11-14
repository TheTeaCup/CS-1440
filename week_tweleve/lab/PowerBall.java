import java.util.Random;

/**
 * PowerBall Class.
 * @author Hunter Wilson
 * @version 11.14.2023
 */

public class PowerBall
{
    public final static int MAX_LOTTERY_NUMBER = 59;
    public final static int MAX_POWER_BALL_NUMBER = 35;
    private Random randomGenerator;
    private int number0;
    private int number1;
    private int number2; 
    private int number3; 
    private int number4; 
    private int powerBall;

    /**
     * PowerBall method.
     * setups randomGenerator
     * also changes all numbers to 0.
     */
    public PowerBall()
    {
        randomGenerator = new Random();
        reset();
    }

    /**
     * getRandomGenerator.
     * 
     * @return randomGenerator.
     */
    public Random getRandomGenerator()
    {
        return randomGenerator;
    }

    /**
     * setRandomGenerator.
     * 
     * @param randomGenerator Random
     */
    public void setRandomGenerator(Random randomGenerator)
    {
        this.randomGenerator = randomGenerator;
    }

    /**
     * This method returns first lottery number.
     * 
     * @return number0
     */
    public int getNumber0() 
    {
        return number0;
    }

    /**
     * This method returns second lottery number.
     * 
     * @return number1
     */
    public int getNumber1() 
    {
        return number1;
    }

    /**
     * This method returns third lottery number.
     * 
     * @return number2
     */
    public int getNumber2() 
    {
        return number2;
    }

    /**
     * This method returns fourth lottery number.
     * 
     * @return number3
     */
    public int getNumber3() 
    {
        return number3;
    }

    /**
     * This method returns fifth lottery number.
     * 
     * @return number4
     */
    public int getNumber4() 
    {
        return number4;
    }

    /**
     * This method returns powerBall number.
     * 
     * @return powerBall
     */
    public int getPowerBall() 
    {
        return powerBall;
    }

    /**
     * This method updates first lottery number.
     * 
     * @param number0 int
     */
    public void setNumber0(int number0) 
    {
        this.number0 = number0;
    }

    /**
     * This method updates second lottery number.
     * 
     * @param number1 int
     */
    public void setNumber1(int number1) 
    {
        this.number1 = number1;
    }

    /**
     * This method updates third lottery number.
     * 
     * @param number2 int
     */
    public void setNumber2(int number2) 
    {
        this.number2 = number2;
    }

    /**
     * This method updates fourth lottery number.
     * 
     * @param number3 int
     */
    public void setNumber3(int number3) 
    {
        this.number3 = number3;
    }

    /**
     * This method updates fifth lottery number.
     * 
     * @param number4 int
     */
    public void setNumber4(int number4) 
    {
        this.number4 = number4;
    }

    /**
     * This method updates powerBall number.
     * 
     * @param powerBall int
     */
    public void setPowerBall(int powerBall) 
    {
        this.powerBall = powerBall;
    }

    /**
     * This method generates a lottery number.
     * 
     * @return randomGenerator();
     */
    public int generateLotteryNumber() 
    {
        return randomGenerator.nextInt(MAX_LOTTERY_NUMBER) + 1;
    }

    /**
     * This method generates a powerball number.
     * 
     * @return powerBallNumber.
     */
    public int generatePowerBallNumber() 
    {
        return randomGenerator.nextInt(MAX_POWER_BALL_NUMBER) + 1;
    }

    /**
     * This method declares of a number is already been used.
     * 
     * @param newNumber int
     * @return boolean.
     */
    public boolean isDuplicateLotteryNumber(int newNumber) 
    {
        return newNumber == number0 
            || newNumber == number1 
            || newNumber == number2 
            || newNumber == number3 
            || newNumber == number4;
    }

    /**
     * This method determines the next lottery number.
     * 
     * @return newNumber.
     */
    public int nextLotteryNumber() 
    {
        int newNumber;

        do 
        {
            newNumber = generateLotteryNumber();
        } 
        while (isDuplicateLotteryNumber(newNumber));

        return newNumber;
    }

    /**
     * This method resets all numbers to 0.
     */
    public void reset()
    {
        number0 = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        powerBall = 0;
    }

    /**
     * This method generates the lottery picks.
     */
    public void generateLotteryPicks()
    {
        reset();
        number0 = nextLotteryNumber();
        number1 = nextLotteryNumber();
        number2 = nextLotteryNumber();
        number3 = nextLotteryNumber();
        number4 = nextLotteryNumber();
        powerBall = generatePowerBallNumber(); 
    }

    /**
     * This method returns a formatted string.
     * 
     * @return String.
     */
    public String toString() 
    {
        return String.format("%02d, %02d, %02d, %02d, %02d, Powerball %02d",
            number0, number1, number2, number3, number4, powerBall);
    }
}
