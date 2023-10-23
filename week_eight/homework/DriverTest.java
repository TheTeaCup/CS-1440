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
 * The test class DriverTest.
 *
 * @author Courtney Dixon & Val Lapensée-Rankine
 * @version 11.23.2022
 */
public class DriverTest
{
    private Class c;
    private Driver m;
    private PrintStream oldSysOut;
    private InputStream oldSysIn;
    private ByteArrayOutputStream output;

    public DriverTest()
    {
        m = null;
        oldSysOut = null;
        oldSysIn = null; 
        m = new Driver();
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
     * Tests for existance of the Driver class.
     */
    @Test
    public void testDriverClassExists()
    {
        try
        {
            c = Class.forName("Driver");
        } 
        catch (Exception e)
        {
            fail("Driver: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in Driver.
     */
    //@Test
    public void testDriverMain(String inValue)
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
     * Method testDriverMain0.
     */
    @Test
    public void testDriverMain0()
    {
        String[] result = new String[6];
        result[0] = new String("Please enter the speed: ");
        result[1] = new String("Please enter the time in hours: ");
        result[2] = new String("Hour    Distance Traveled");
        result[3] = new String("1       40      ");
        result[4] = new String("2       80      ");
        result[5] = new String("3       120     ");
        
        testDriverMain("40\n3\n");
        testResult(result);
    }
    
    /**
     * Method testDriverMain1.
     */
    @Test
    public void testDriverMain1()
    {
        String[] result = new String[10];
        result[0] = new String("Please enter the speed: ");
        result[1] = new String("Cannot enter negative speed.");
        result[2] = new String("Please enter the speed: ");
        result[3] = new String("Cannot enter negative speed.");
        result[4] = new String("Please enter the speed: ");
        result[5] = new String("Please enter the time in hours: ");
        result[6] = new String("Hour    Distance Traveled");
        result[7] = new String("1       40      ");
        result[8] = new String("2       80      ");
        result[9] = new String("3       120     ");
        
        testDriverMain("-40\n-40\n40\n3\n");
        testResult(result);
    }
    
    /**
     * Method testDriverMain2.
     */
    @Test
    public void testDriverMain2()
    {
        String[] result = new String[10];
        result[0] = new String("Please enter the speed: ");
        result[1] = new String("Please enter the time in hours: ");
        result[2] = new String("Cannot enter less than one hour.");
        result[3] = new String("Please enter the time in hours: ");
        result[4] = new String("Cannot enter less than one hour.");
        result[5] = new String("Please enter the time in hours: ");
        result[6] = new String("Hour    Distance Traveled");
        result[7] = new String("1       40      ");
        result[8] = new String("2       80      ");
        result[9] = new String("3       120     ");
        
        testDriverMain("40\n-3\n-3\n3\n");
        testResult(result);
    }
}

