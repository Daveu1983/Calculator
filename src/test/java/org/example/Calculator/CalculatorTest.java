package org.example.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void divideTwoNumbers()
    {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6, 3);
        assertEquals(2, result, 0);
    }

    @Test
    public void getDecimalResult()
    {
        Calculator calculator = new Calculator();
        double result = calculator.divide(5, 2);
        assertEquals(2.5, result, 0);
    }
}
