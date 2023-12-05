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

/**
 * The test class FootballTeamDemoTest.
 *
 * @author Courtney Dixon
 * @version 28.2.2021
 */
public class FootballTeamDemoTest {
    private PrintStream oldSysOut;
    private InputStream oldSysIn;
    private ByteArrayOutputStream output;

    @Before
    public void setUp() {
        oldSysIn = System.in;
        oldSysOut = System.out;
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
     * Tests for existance of the FootballTeamDemo class.
     */
    @Test
    public void testFootballTeamDemoClassExists() {
        Class c;
        try {
            c = Class.forName("FootballTeamDemo");
        } catch (Exception e) {
            fail("FootballTeamDemo: unable to perform test. "
                    + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in FootballTeamDemo that prints output.
     */
    @Test
    public void testFootballTeamDemoMain() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        FootballTeamDemo.main(new String[0]);
        String s = baos.toString();
        s = s.replaceAll("\\s+", "");
        s = s.replaceAll("\\n+", "");
        s = s.toLowerCase();
        String expected = "falsetrue";
        expected = expected.replaceAll("\\s+", "");
        expected = expected.replaceAll("\\n+", "");
        expected = expected.toLowerCase();
        if (!(expected.equals(s))) {
            fail("Expected output: " + expected + "\n"
                    + "Your output: " + s + "\n");
        }
    }
}
