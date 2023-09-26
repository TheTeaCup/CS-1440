import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * The test class MonetaryUnitsTest.
 *
 * @author Courtney Dixon (modified from Joel Swanson and Brooke Tibbett)
 * @version 28.2.2021
 */
public class MonetaryUnitsTest {
    private MonetaryUnits m;
    private PrintStream oldSysOut;
    private InputStream oldSysIn;
    private ByteArrayOutputStream output;

    public MonetaryUnitsTest() {
        m = null;
        oldSysOut = null;
        oldSysIn = null;
        m = new MonetaryUnits();
    }

    @Before
    public void setUp() {
        oldSysIn = System.in;
        oldSysOut = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    /**
     * Tears down the test fixture.
     * <p>
     * Called after every test case method.
     */
    @After
    public void tearDown() {
        resetStreams();
    }

    /**
     * Resets I/O streams.
     */
    private void resetStreams() {
        System.setOut(oldSysOut);
        System.setIn(oldSysIn);
    }

    /**
     * Tests for existance of the MonetaryUnits class.
     */
    @Test
    public void testMonetaryUnitsClassExists() {
        Class c;
        try {
            c = Class.forName("MonetaryUnits");
        } catch (Exception e) {
            fail("MonetaryUnits: unable to perform test. "
                    + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in MonetaryUnits.
     */
    //@Test
    public void testMonetaryUnitsMain(String inValue) {
        String inputValue = inValue;
        ByteArrayInputStream input = new ByteArrayInputStream(inputValue.getBytes());
        System.setIn(input);
        try {
            m.main(null);
        } catch (java.util.InputMismatchException e) {
            e.printStackTrace();
            fail("Input did not match what your Scanner expected.");
        } catch (java.util.NoSuchElementException e) {
            e.printStackTrace();
            fail("In main, your Scanner expected more input than provided.");
        } catch (java.lang.IllegalStateException e) {
            e.printStackTrace();
            fail("In main, your Scanner malfunctioned; "
                    + "did it get closed somehow."
                    + " \nView the exception details in the bottom section"
                    + " of your terminal window.");
        } catch (java.util.IllegalFormatConversionException e) {
            e.printStackTrace();
            fail("In main, you have an incorrect format in your printf."
                    + " You seem to be trying to print a string with a d or f"
                    + " conversion.\nView the exception details in the"
                    + " bottom section of your terminal window.");
        } catch (Exception e) {
            e.printStackTrace();
            fail("Your main method failed with an unknown exception. "
                    + " \nView the exception details in the bottom section"
                    + " of your terminal window.");
        }
    }

    /**
     * testResult method.
     * This method takes in the expected output
     * and compares it to the actual output.
     */
    public void testResult(String[] r) {
        Scanner op = new Scanner(output.toString());
        String[] result = r;
        if (!op.hasNextLine()) {
            fail("Test for MonetaryUnitsMain1 Failed: No output?");
        }
        checkLine(op, "Enter an amount line of output", result[0]);
        if (!op.hasNextLine()) {
            fail("Test for MonetaryUnitsMain1 Failed: Missing your amount line of output");
        }
        checkLine(op, "Your amount line of output", result[1]);
        if (!op.hasNextLine()) {
            fail("Test for MonetaryUnitsMain1 Failed: Missing dollars line of output");
        }
        checkLine(op, "Dollars line of output", result[2]);
        if (!op.hasNextLine()) {
            fail("Test for MonetaryUnitsMain1 Failed: Missing quarters line of output");
        }
        checkLine(op, "Quarters line of output", result[3]);
        if (!op.hasNextLine()) {
            fail("Test for MonetaryUnitsMain1 Failed: Missing dimes line of output");
        }
        checkLine(op, "Dimes line of output", result[4]);
        if (!op.hasNextLine()) {
            fail("Test for MonetaryUnitsMain1 Failed: Missing nickels line of output");
        }
        checkLine(op, "Nickels line of output", result[5]);
        if (!op.hasNextLine()) {
            fail("Test for MonetaryUnitsMain1 Failed: Missing pennies line of output");
        }
        checkLine(op, "Pennies line of output", result[6]);
    }

    private void checkLine(Scanner o, String msg, String expected) {
        if (!o.hasNextLine()) {
            fail("Missing " + msg);
        }
        String line = o.nextLine();
        if (!line.equals(expected)) {
            fail(" " + msg + " is malformed.\n"
                    + "Expected:  \"" + expected + "\"\n"
                    + "Your code: \"" + line + "\"\n");
        }
    }

    @Test
    public void testMonetaryUnitsMain1() {
        String[] result = new String[7];
        result[0] = new String("Enter an amount in double for dollars: $");
        result[1] = new String("Your amount $26.43 consists of:");
        result[2] = new String("\t26 dollars");
        result[3] = new String("\t1 quarters");
        result[4] = new String("\t1 dimes");
        result[5] = new String("\t1 nickels");
        result[6] = new String("\t3 pennies");

        testMonetaryUnitsMain("26.43\n");
        testResult(result);
    }

    @Test
    public void testMonetaryUnitsMain2() {
        String[] result = new String[7];
        result[0] = new String("Enter an amount in double for dollars: $");
        result[1] = new String("Your amount $19.95 consists of:");
        result[2] = new String("\t19 dollars");
        result[3] = new String("\t3 quarters");
        result[4] = new String("\t2 dimes");
        result[5] = new String("\t0 nickels");
        result[6] = new String("\t0 pennies");

        testMonetaryUnitsMain("19.95\n");
        testResult(result);
    }

    @Test
    public void testMonetaryUnitsMain3() {
        String[] result = new String[7];
        result[0] = new String("Enter an amount in double for dollars: $");
        result[1] = new String("Your amount $28.56 consists of:");
        result[2] = new String("\t28 dollars");
        result[3] = new String("\t2 quarters");
        result[4] = new String("\t0 dimes");
        result[5] = new String("\t1 nickels");
        result[6] = new String("\t1 pennies");

        testMonetaryUnitsMain("28.56\n");
        testResult(result);
    }
}
