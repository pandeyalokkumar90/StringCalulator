import org.example.StringCalulator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalulatorTest {

    private StringCalulator stringCalulator;

    @Before
    public void setUp() throws Exception {
        stringCalulator = new StringCalulator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdditionSuccess() {
        int result = stringCalulator.add("10,5");
        assertEquals(result,15);
    }
    @Test
    public void testAdditionFail() {
        int result = stringCalulator.add("10,10");
        assertNotEquals(result,15);
    }

    @Test
    public void testAdditionIllegalArgumentException() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () ->  {stringCalulator.add("10,-15");} );

    }

    @Test
    public void testAdditionNullPointerException() {
        NullPointerException thrown = assertThrows(
                NullPointerException.class,
                () ->  {stringCalulator.add(null);} );

    }

    @Test
    public void testAdditionNumFormateException() {
        NumberFormatException thrown = assertThrows(
                NumberFormatException.class,
                () ->  {stringCalulator.add("abc");} );

    }
}
