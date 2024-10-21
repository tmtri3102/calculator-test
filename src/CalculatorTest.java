import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class CalculatorTest {

//    @Test
//    public void testAdd() {
//        int x = 1;
//        int y = 1;
//        Calculator instance = new Calculator();
//        int expResult = 2;
//        int result = instance.add(x, y);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testAdd2() {
//        int x = Integer.MAX_VALUE;
//        int y = 1;
//        Calculator instance = new Calculator();
//        try {
//            int result = instance.add(x, y);
//            assertFalse(true);
//        } catch (Exception e) {
//            assertTrue(true);
//        }
//    }
//
//    @Test
//    public void testAdd3() {
//        int x = Integer.MIN_VALUE;
//        int y = -1;
//        Calculator instance = new Calculator();
//        try {
//            int result = instance.add(x, y);
//            assertFalse(true);
//        } catch (Exception e) {
//            assertTrue(true);
//        }
//    }
@Test
@DisplayName("Testing add 0 + 0")
public void testAdd0And0() {
    int first = 2;
    int second = 0;
    int expected = 0;

    int result = Calculator.add(first, second);
    assertEquals(expected, result);
}

    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd5And3() {
        int first = 5;
        int second = 3;
        int expected = 8;

        int result = Calculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 0")
    public void testSub0and0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = Calculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 1 - 0")
    public void testSub1and0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = Calculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 1")
    public void testSub0and1() {
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = Calculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 0")
    public void testSub5and3() {
        int first = 5;
        int second = 3;
        int expected = 2;

        int result = Calculator.sub(first, second);
        assertEquals(expected, result);
    }

}