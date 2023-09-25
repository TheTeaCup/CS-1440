import static org.junit.Assert.fail;  
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
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
 * The test class FootballTeamTest.
 * 
 * @author Courtney Dixon
 * @version 28.2.2021
 */
public class FootballTeamTest
{
    final int NUM_FIELDS_EXPECTED = 3;
    final int NUM_CONSTRUCTORS_EXPECTED = 1;
    final int NUM_METHODS_EXPECTED = 6;
    final int NUM_ACCESORS_EXPECTED = 4;
    final int NUM_MUTATORS_EXPECTED = 6;
    final int PRIVATE_MODBITS = 0x02;
    final int PUBLIC_MODBITS = 0x01;
    final String CLASS_TO_TEST = "FootballTeam";
    private Class c = null;

    /**
     * Default constructor for test class FootballTeamTest.
     */
    public FootballTeamTest()
    {
    }

    /**
     * Tests for existance of the FootballTeam class.
     */
    @Test
    public void testFootballTeamClassExists()
    {
        try
        {
            c = Class.forName("FootballTeam");
        } 
        catch (Exception e)
        {
            fail("FootballTeam: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * Tests for the proper setup of the FootballTeam class.
     */
    @Test
    public void testFootballTeamClassSetup()
    {
        try 
        {
            c = Class.forName(CLASS_TO_TEST);
        }
        catch (Exception e) 
        {
            c = null;
        }

        testFootballTeamClassFields();
        testFootballTeamClassConstructor(c.getDeclaredConstructors());
        testFootballTeamClassMethods();
    }

    public void testFootballTeamClassFields()
    {
        Field[] fields = c.getDeclaredFields();
        if (fields.length > NUM_FIELDS_EXPECTED) 
        {
            fail("FootballTeamClassSetupTest: specification requires fields\n" 
                + "for teamName, numOfWins, and numOfLosses.\n");
        }
    }

    public void testFootballTeamClassConstructor(Constructor<?>[] constructors)
    {
        String[] paramTypes;
        for (Constructor cm : constructors) 
        {
            if ("FootballTeam".equals(cm.getName())) 
            {
                paramTypes = new String[3];
                paramTypes[0] = new String("class java.lang.String");
                paramTypes[1] = "int";
                paramTypes[2] = "int";
                if (!constructorIsProper(cm, "FootballTeam", PUBLIC_MODBITS, paramTypes))
                {
                    fail("FootballTeam(String, int, int) constructor missing or "
                        + "declared improperly.");
                }
                return;
            }
        }        
        //fail("FootballTeam(String, int, int) constructor missing or "
        //                + "declared improperly.");
    }

    public void testFootballTeamClassMethods()
    {
        Method[] methods = c.getDeclaredMethods();
        String[] paramTypes;
        for (Method m : methods) 
        {    
            if ("getTeamName".equals(m.getName()))
            {
                paramTypes = new String[0];
                if (!methodIsProper(m, "getTeamName", PUBLIC_MODBITS,
                    "class java.lang.String", paramTypes))
                {
                    fail("getTeamName method missing or declared improperly.");
                }
            }
            else if ("getNumOfWins".equals(m.getName())) 
            {
                paramTypes = new String[0];
                if (!methodIsProper(m, "getNumOfWins", PUBLIC_MODBITS, 
                    "int", paramTypes))
                {
                    fail("getNumOfWins method missing or declared improperly.");
                }
            }
            else if ("getNumOfLosses".equals(m.getName())) 
            {
                paramTypes = new String[0];
                if (!methodIsProper(m, "getNumOfLosses", PUBLIC_MODBITS, 
                    "int", paramTypes))
                {
                    fail("getNumOfLosses method missing or declared improperly.");
                }
            }
            else if ("increaseWins".equals(m.getName())) 
            {
                paramTypes = new String[0];
                if (!methodIsProper(m, "increaseWins", PUBLIC_MODBITS, 
                    "void", paramTypes))
                {
                    fail("increaseWins method missing or declared improperly.");
                }
            }
            else if ("increaseLosses".equals(m.getName())) 
            {
                paramTypes = new String[0];
                if (!methodIsProper(m, "increaseLosses", PUBLIC_MODBITS, 
                    "void", paramTypes))
                {
                    fail("increaseLosses method missing or declared improperly.");
                }
            }
            else if ("getRecord".equals(m.getName())) 
            {
                paramTypes = new String[0];
                if (!methodIsProper(m, "getRecord", PUBLIC_MODBITS, 
                    "boolean", paramTypes))
                {
                    fail("getRecord method missing or declared improperly.");
                }
            }
        }

        checkFootballTeamAccessorMethods(methods);
        checkFootballTeamMutatorMethods(methods);
    }

    /**
     * Tests getTeamName accessor method.
     */
    @Test
    public void testGetTeamName()
    {
        FootballTeam team = new FootballTeam("Jaguars", 6, 2);
        String teamName = team.getTeamName();
        if(!teamName.equals("Jaguars"))
        {
            fail("The name of the team should be Jaguars not " + teamName);
        }
    }

    /**
     * Tests getNumOfWins accessor method
     * and the increaseWins method.
     */
    @Test
    public void testGetIncreaseNumOfWins()
    {
        FootballTeam team = new FootballTeam("Jaguars", 6, 2);
        int wins = team.getNumOfWins();
        if(wins != 6)
        {
            fail("The number of wins should be 6 not " + wins);
        }
        team.increaseWins();
        wins = team.getNumOfWins();
        if(wins != 7)
        {
            fail("The number of wins should be 7 not " + wins);
        }
    }

    /**
     * Tests getNumOfLosses accessor method
     * and the increaseLosses method.
     */
    @Test
    public void testGetIncreaseNumOfLosses()
    {
        FootballTeam team = new FootballTeam("Jaguars", 6, 2);
        int losses = team.getNumOfLosses();
        if(losses != 2)
        {
            fail("The number of losses should be 2 not " + losses);
        }
        team.increaseLosses();
        losses = team.getNumOfLosses();
        if(losses != 3)
        {
            fail("The number of wins should be 3 not " +losses);
        }
    }

    /**
     * Test getRecord method.
     */
    @Test
    public void testGetRecord()
    {
        FootballTeam team = new FootballTeam("Jaguars", 6, 2);
        if (!team.getRecord())
        {
            fail("The Jaguars has a good record: "
                + team.getNumOfWins() + "wins"
                + team.getNumOfLosses() + "losses.\n");
        }
    }

    /**
     * Verifies characteristics of a method.
     * written by Dr. James Fenwick
     * 
     * @param m is the method to check
     * @param name is the expected name of the method
     * @param expectMods is the expected modifiers (public, static, etc.)
     * @param expectRtnType is the expected return type
     * @param expectParams is a String array describing the parameters
     * 
     * @return true if method matches expectations
     */
    private boolean methodIsProper(Method m, String name, int expectMods, 
    String expectRtnType, String[] expectParams)
    {
        int methodMods = m.getModifiers() & expectMods;
        String rtnType = m.getReturnType().toString();
        Class<?>[] paramTypes = m.getParameterTypes();

        if (!name.equals(m.getName())) 
        {
            return false;
        }
        if (methodMods != expectMods) 
        { 
            return false; 
        }
        if (!expectRtnType.equals(rtnType)) 
        { 
            return false;
        }
        if (paramTypes.length != expectParams.length)
        { 
            return false;
        }
        for (String expectedType : expectParams) 
        {
            if (!expectedType.equals(paramTypes[0].toString()))
            { 
                return false;
            }
        }
        return true;
    }

    /**
     * Test declaration of accessors.
     * written by Dr. James Fenwick
     * modified by Courtney Dixon on 28.2.2021
     * 
     * @param methods is array of all the class methods
     */
    private void checkFootballTeamAccessorMethods(Method[] methods)
    {
        String[] paramTypes;
        boolean hasIntReturnW = false;
        boolean hasIntReturnL = false;
        boolean hasStringReturn = false;
        boolean hasBooleanReturn = false;

        for (Method m : methods) 
        {
            paramTypes = new String[0];
            if (m.getName().startsWith("getNumOfW"))
            {
                if (!hasIntReturnW)
                {
                    hasIntReturnW = methodIsProper(m, m.getName(), PUBLIC_MODBITS,
                        "int", paramTypes);
                }
            }
            else if (m.getName().startsWith("getNumOfL"))
            {
                if (!hasIntReturnL)
                {
                    hasIntReturnL = methodIsProper(m, m.getName(), PUBLIC_MODBITS,
                        "int", paramTypes);
                }
            }
            else if (m.getName().startsWith("getT"))
            {
                if (!hasStringReturn)
                {
                    hasStringReturn = methodIsProper(m, m.getName(), PUBLIC_MODBITS,
                        "class java.lang.String", paramTypes);
                }
            }
            else if (m.getName().startsWith("getR"))
            {
                if (!hasBooleanReturn)
                {
                    hasBooleanReturn = methodIsProper(m, m.getName(), PUBLIC_MODBITS,
                        "boolean", paramTypes);
                }
            }           
        }        
        if (!hasIntReturnW)
        {
            fail("accessor method for wins "
                + "is missing or declared improperly.");
        }
        if (!hasIntReturnL)
        {
            fail("accessor method for losses "
                + "is missing or declared improperly.");
        }
        if (!hasStringReturn)
        {
            fail("accessor method for team name "
                + "is missing or declared improperly.");
        }
        if (!hasBooleanReturn)
        {
            fail("accessor method for the football team's record "
                + "is missing or declared improperly.");
        }
    }

    /**
     * Test declaration of mutators.
     * written by Dr. James Fenwick
     * modified by Courtney Dixon on 28.2.2021
     * 
     * @param methods is array of all the class methods
     */
    private void checkFootballTeamMutatorMethods(Method[] methods)
    {
        String[] paramTypes;
        boolean hasNoParamW = false;
        boolean hasNoParamL = false;
        int mutators = 0;

        for (Method m : methods) 
        {
            if (m.getName().startsWith("increaseW"))
            {
                paramTypes = new String[0];                
                if (!hasNoParamW)
                {
                    hasNoParamW = methodIsProper(m, m.getName(),PUBLIC_MODBITS, 
                        "void", paramTypes);
                }
            }
            if (m.getName().startsWith("increaseL"))
            {
                paramTypes = new String[0];                
                if (!hasNoParamL)
                {
                    hasNoParamL = methodIsProper(m, m.getName(),PUBLIC_MODBITS, 
                        "void", paramTypes);
                }
            }
            mutators++;            
        }        
        if (mutators != NUM_MUTATORS_EXPECTED)
        {
            if(!hasNoParamW)
            {
                fail("mutator method for wins  "
                    + "is missing or declared improperly.");
            }
            if(!hasNoParamL)
            {
                fail("mutator method for losses "
                    + "is missing or declared improperly.");
            }
        }
    }        

    /**
     * Verifies characteristics of a constructor.
     * written by Dr. James Fenwick
     * modified by Courtney Dixon on 28.2.2021
     * 
     * @param m is the constructor method to check
     * @param name is the expected name of the method
     * @param expectMods is the expected modifiers (public, static, etc.)
     * @param expectParams is a String array describing the parameters
     * 
     * @return true if method matches expectations
     */
    private boolean constructorIsProper(Constructor m, String name, int expectMods, 
    String[] expectParams)
    {
        int methodMods = m.getModifiers() & expectMods;
        Class<?>[] paramTypes = m.getParameterTypes();

        if (!name.equals(m.getName())) 
        {            
            return false;
        }
        if (methodMods != expectMods) 
        { 
            return false; 
        }
        if (paramTypes.length != expectParams.length)
        { 
            return false;
        }
        for (int i = 0; i < paramTypes.length; i++)
        {
            if (!(paramTypes[i].toString().equals(expectParams[i].toString())))
            {
                return false;
            }
        }
        return true;
    }

}
