package dk.aju.test.ajutest1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        TheCalendar theCalendar = new TheCalendar();
        String ret = theCalendar.getSomeThing( "1400439600");
        boolean contains2014 = ret.contains( "2014");
        assertTrue( contains2014 );
    }
}
