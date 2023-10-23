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
 * The test class SumOfNumbersTest.
 *
 * @author Courtney Dixon & Val Lapensée-Rankine
 * @version 11.23.2022
 */
public class SumOfNumbersTest
{
    private Class c;
    private SumOfNumbers m;
    private PrintStream oldSysOut;
    private InputStream oldSysIn;
    private ByteArrayOutputStream output;

    public SumOfNumbersTest()
    {
        m = null;
        oldSysOut = null;
        oldSysIn = null; 
        m = new SumOfNumbers();
    }

    @Before
    public void setUp()
    {
        oldSysIn = System.in;
        oldSysOut = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    /**
     * Tears down the test fixture.
     * 
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        resetStreams();
    }

    /**
     * Resets I/O streams.
     */
    private void resetStreams()
    {
        System.setOut(oldSysOut);
        System.setIn(oldSysIn);
    }

    /**
     * Tests for existance of the SumOfNumbers class.
     */
    @Test
    public void testSumOfNumbersClassExists()
    {
        try
        {
            c = Class.forName("SumOfNumbers");
        } 
        catch (Exception e)
        {
            fail("SumOfNumbers: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in SumOfNumbers.
     */
    //@Test
    public void testSumOfNumbersMain(String inValue)
    {
        String inputValue = inValue;
        ByteArrayInputStream input = new ByteArrayInputStream(inputValue.getBytes());
        System.setIn(input);
        try 
        {
            m.main(null);
        }
        catch (java.util.InputMismatchException e) 
        {
            e.printStackTrace();
            fail("Input did not match what your Scanner expected.");
        }
        catch (java.util.NoSuchElementException e) 
        {
            e.printStackTrace();
            fail("In main, your Scanner expected more input than provided.");
        }
        catch (java.lang.IllegalStateException e) 
        {
            e.printStackTrace();
            fail("In main, your Scanner malfunctioned; " 
                + "did it get closed somehow."
                + " \nView the exception details in the bottom section"  
                + " of your terminal window.");
        }
        catch (java.util.IllegalFormatConversionException e) 
        {
            e.printStackTrace();
            fail("In main, you have an incorrect format in your printf."
                + " You seem to be trying to print a string with a d or f" 
                + " conversion.\nView the exception details in the"
                + " bottom section of your terminal window.");
        }
        catch (Exception e) 
        {
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
    public void testResult(String[] r)
    {
        String[] op = output.toString().replaceAll("\\r","").split("\n");
        String[] result = r;
        String msg = "";
        if (op.length > r.length)
        {
            for (int i = 0; i < r.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].equals(result[i]))
                {
                    checkLine(op[i], msg, result[i]);
                }
            }
            fail("You're printing too many lines.");
        }
        else if (op.length < r.length)
        {
            String[] temp = new String[r.length];
            System.arraycopy(op, 0, temp, 0, op.length);
            for (int i = op.length; i < r.length; i++) {
                temp[i] = "";
            }
            
            op = temp;
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].equals(result[i]))
                {
                    checkLine(op[i], msg, result[i]);
                }
            }
        }
        else
        {
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].equals(result[i]))
                {
                    checkLine(op[i], msg, result[i]);
                }
            }
        }
    }
    
    private void checkLine(String o, String msg, String expected)
    {
        if (!o.equals(expected))
        {
            fail(" " + msg + " is malformed.\n"
                + "Expected:  \"" + expected + "\"\n" 
                + "Your code: \"" + o + "\"\n");
        }
    }
    
    /**
     * Method testSumOfNumbersMain0.
     */
    @Test
    public void testSumOfNumbersMain0()
    {
        String[] result = new String[2];
        result[0] = new String("Please enter a positive integer: ");
        result[1] = new String("15");
        
        testSumOfNumbersMain("5\n");
        testResult(result);
    }
    
    /**
     * Method testSumOfNumbersMain1.
     */
    @Test
    public void testSumOfNumbersMain1()
    {
        String[] result = new String[4];
        result[0] = new String("Please enter a positive integer: ");
        result[1] = new String("That is not a positive integer!");
        result[2] = new String("Please enter a positive integer: ");
        result[3] = new String("1275");
        
        testSumOfNumbersMain("-1\n50\n");
        testResult(result);
    }
    
    /**
     * Method testSumOfNumbersMain2.
     */
    @Test
    public void testSumOfNumbersMain2()
    {
        String[] result = new String[6];
        result[0] = new String("Please enter a positive integer: ");
        result[1] = new String("That is not a positive integer!");
        result[2] = new String("Please enter a positive integer: ");
        result[3] = new String("That is not a positive integer!");
        result[4] = new String("Please enter a positive integer: ");
        result[5] = new String("7626");
        
        testSumOfNumbersMain("-1\n-1\n123\n");
        testResult(result);
    }
}
