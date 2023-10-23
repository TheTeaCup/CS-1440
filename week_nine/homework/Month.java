/**
 * The Month class.
 *
 * This program has one field, three constructors,
 * one mutator method, two accessor methods, a
 * toString method, an equals method,.
 *
 * @author hunter.wilson
 * @version 10.23.2023
 */
public class Month
{
    private int monthNumber;

    public Month()
    {
        monthNumber = 1;
    }

    /**
     * Month class.
     * @params int as mNum
     */
    public Month(int mNum)
    {
        if (mNum < 1 || mNum > 12)
        {
            monthNumber = 1;
        }
        else
        {
            monthNumber = mNum;
        }
    }

    /**
     * Month class.
     * @params String as month
     */
    public Month(String month) {
        month = month;

        if (month.equalsIgnoreCase("January")) {
            monthNumber = 1;
        } else if (month.equalsIgnoreCase("February")) {
            monthNumber = 2;
        } else if (month.equalsIgnoreCase("March")) {
            monthNumber = 3;
        } else if (month.equalsIgnoreCase("April")) {
            monthNumber = 4;
        } else if (month.equalsIgnoreCase("May")) {
            monthNumber = 5;
        } else if (month.equalsIgnoreCase("June")) {
            monthNumber = 6;
        } else if (month.equalsIgnoreCase("July")) {
            monthNumber = 7;
        } else if (month.equalsIgnoreCase("August")) {
            monthNumber = 8;
        } else if (month.equalsIgnoreCase("September")) {
            monthNumber = 9;
        } else if (month.equalsIgnoreCase("October")) {
            monthNumber = 10;
        } else if (month.equalsIgnoreCase("November")) {
            monthNumber = 11;
        } else if (month.equalsIgnoreCase("December")) {
            monthNumber = 12;
        }
    }

    /**
     * setMonthNumber.
     * @params int as mNum
     */
    public void setMonthNumber(int mNum) {
        if (mNum >= 1 && mNum <= 12) {
            monthNumber = monthNumber;
        } else {
            monthNumber = 1;
        }
    }

    /**
     * getMonthNumber.
     * return monthNumber
     */
    public int getMonthNumber() {
        return monthNumber;
    }

    /**
     * getMonthName.
     * return month name
     */
    public String getMonthName() {
        switch (monthNumber) {
            case 1:
                return "Janaury";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "January";
        }
    }

    /**
     * toString.
     * returns to string
     */
    public String toString(){
        return getMonthName();
    }

    /**
     * equals.
     * @params Month as m
     */
    public boolean equals(Month m){
        if(m.getMonthNumber() == getMonthNumber()){
            return true;
        } else{
            return false;
        }
    }

    /**
     * greaterThan.
     * @params Month as m
     */
    public boolean greaterThan(Month m){
        if(getMonthNumber() > m.getMonthNumber()){
            return true;
        } else{
            return false;
        }
    }

    /**
     * lessThan.
     * @params Month as m
     */
    public boolean lessThan(Month m){
        if(getMonthNumber() < m.getMonthNumber()){
            return true;
        } else{
            return false;
        }
    }
}
