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
import java.util.Scanner;

/**
 * Write a description of class DistanceTraveledTest here.
 *
 * @author Courtney Dixon
 * @version 5.3.2021
 */
public class DistanceTraveledTest
{
    final int NUM_FIELDS_EXPECTED = 2;
    final int NUM_CONSTRUCTORS_EXPECTED = 1;
    final int NUM_METHODS_EXPECTED = 3;
    final int NUM_ACCESORS_EXPECTED = 1;
    final int NUM_MUTATORS_EXPECTED = 2;
    final int PRIVATE_MODBITS = 0x02;
    final int PUBLIC_MODBITS = 0x01;
    final String CLASS_TO_TEST = "DistanceTraveled";
    private Class c = null;

    /**
     * Tests for the proper setup of the DistanceTraveled class.
     */
    @Test
    public void testDistanceTraveledClassSetup()
    {
        try 
        {
            c = Class.forName(CLASS_TO_TEST);
        }
        catch (Exception e) 
        {
            c = null;
        }

        testDistanceTraveledClassFields();
        testDistanceTraveledClassConstructor(c.getDeclaredConstructors());
        testDistanceTraveledClassMethods();
    }

    /**
     * Tests getDistance method.
     */
    @Test
    public void testGetDistance()
    {
        DistanceTraveled dt = new DistanceTraveled();
        dt.setSpeed(40);
        dt.setHours(3);
        if(dt.getDistance() != 120)
        {
            fail("The distance should be 120 not " + dt.getDistance());
        }
    }

    public void testDistanceTraveledClassFields()
    {
        Field[] fields = c.getDeclaredFields();
        if (fields.length > NUM_FIELDS_EXPECTED) 
        {
            fail("DistanceTraveledClassSetupTest: specification requires fields\n" 
                + "for speed and hours.\n");
        }
    }

    public void testDistanceTraveledClassConstructor(Constructor<?>[] constructors)
    {
        String[] paramTypes;
        for (Constructor cm : constructors) 
        {
            if ("DistanceTraveled".equals(cm.getName())) 
            {
                paramTypes = new String[0];
                /*paramTypes[0] = new String("class java.lang.String");
                paramTypes[1] = "int";
                paramTypes[2] = "int";*/
                if (!constructorIsProper(cm, "DistanceTraveled", PUBLIC_MODBITS, paramTypes))
                {
                    fail("DistanceTraveled() constructor missing or "
                        + "declared improperly.");
                }
                return;
            }
        }        
    }

    public void testDistanceTraveledClassMethods()
    {
        Method[] methods = c.getDeclaredMethods();
        String[] paramTypes;
        for (Method m : methods) 
        {    
            if ("getDistance".equals(m.getName()))
            {
                paramTypes = new String[0];
                if (!methodIsProper(m, "getDistance", PUBLIC_MODBITS,
                    "int", paramTypes))
                {
                    fail("getDistance method missing or declared improperly.");
                }
            }
        }

        checkDistanceTraveledAccessorMethods(methods);
        checkDistanceTraveledMutatorMethods(methods);
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
    private void checkDistanceTraveledAccessorMethods(Method[] methods)
    {
        String[] paramTypes;
        boolean hasIntReturn = false;

        for (Method m : methods) 
        {
            paramTypes = new String[0];
            if (m.getName().startsWith("getDistance"))
            {
                if (!hasIntReturn)
                {
                    hasIntReturn = methodIsProper(m, m.getName(), PUBLIC_MODBITS,
                        "int", paramTypes);
                }
            }       
        }        
        if (!hasIntReturn)
        {
            fail("accessor method for distance "
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
    private void checkDistanceTraveledMutatorMethods(Method[] methods)
    {
        String[] paramTypes;
        boolean hasIntParamS = false;
        boolean hasIntParamH = false;
        int mutators = 0;

        for (Method m : methods) 
        {
            if (m.getName().startsWith("setS"))
            {
                paramTypes = new String[1];
                paramTypes[0] = "int";
                if (!hasIntParamS)
                {
                    hasIntParamS = methodIsProper(m, m.getName(),PUBLIC_MODBITS, 
                        "void", paramTypes);
                }
            }
            if (m.getName().startsWith("setH"))
            {
                paramTypes = new String[1];     
                paramTypes[0] = "int";
                if (!hasIntParamH)
                {
                    hasIntParamH = methodIsProper(m, m.getName(),PUBLIC_MODBITS, 
                        "void", paramTypes);
                }
            }
            mutators++;            
        }        
        if (mutators != NUM_MUTATORS_EXPECTED)
        {
            if(!hasIntParamS)
            {
                fail("mutator method for speed  "
                    + "is missing or declared improperly.");
            }
            if(!hasIntParamH)
            {
                fail("mutator method for hours "
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
