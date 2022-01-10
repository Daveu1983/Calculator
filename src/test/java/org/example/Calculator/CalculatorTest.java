package org.example.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    @Test
    public void addTwoNumbers()
    {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void subtractTwoNumbers()
    {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(6, 3);
        assertEquals(3, result);
    }
}
