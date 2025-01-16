package exceptionHandling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Math_UT {

    @Test
    public void testAddTwoNumbers() {
        // Test case 1: Positive numbers
        assertEquals(10, Maths.addTwoNumbers(4, 6));
    }

    @Test
    public void testMultiplyTwoNumbers() {
        // Test case 1: Positive numbers
        assertEquals(24, Maths.multiplyTwoNumbers(4, 6));
    }
}
