import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
// import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
// import java.io.InputStream;
// import java.io.FileDescriptor;
// import java.io.FileOutputStream;
// import java.io.FileInputStream;
import java.io.PrintStream;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

/**
 * The test class OddOrEvenTest.
 *
 * @author Courtney Dixon & Val Lapensée-Rankine
 * @version 13.2.2023
 */

public class OddOrEvenTest {
    private PrintStream oldSystemOut;

    /**
     * Constructor.
     */
    public OddOrEvenTest() {
        oldSystemOut = null;
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        oldSystemOut = System.out;
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
        System.setOut(oldSystemOut);
    }

    /**
     * Tests for existance of the PersonalInfo class.
     */
    @Test
    public void testOddOrEvenClassExists() {
        Class c;
        try {
            c = Class.forName("OddOrEven");
        } catch (Exception e) {
            fail("OddOrEven: unable to perform test. "
                    + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in OddOrEven.
     */
    @Test
    public void testOddOrEvenMain() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String input = new String("577\n");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.setOut(new PrintStream(baos));
        OddOrEven.main(null);
        String s = baos.toString().replaceAll("\r", "").trim();
        String expected = "Please enter an integer: \nThe input is odd";
        if (!(expected.equals(s))) {
            fail("Expected output: " + expected + "\n"
                    + "Your output: " + s + "\n");
        }
    }
}