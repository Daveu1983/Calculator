package org.example.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest
{
    @Test
    public void addTwoNumbers()
    {
        Calculator calculator = new Calculator();
        calculator.setResult(2);
        double result = calculator.add(3);
        assertEquals(5, result, 0);
    }

    @Test
    public void subtractTwoNumbers()
    {
        Calculator calculator = new Calculator();
        calculator.setResult(6);
        double result = calculator.subtract(3);
        assertEquals(3, result, 0);
    }

    @Test
    public void divideTwoNumbers()
    {
        Calculator calculator = new Calculator();
        calculator.setResult(6);
        double result = calculator.divide (3);
        assertEquals(2, result, 0);
    }

    @Test
    public void getDecimalResult()
    {
        Calculator calculator = new Calculator();
        calculator.setResult(5);
        double result = calculator.divide(2);
        assertEquals(2.5, result, 0);
    }

    @Test
    public void multiplyTwoNumbers()
    {
        Calculator calculator = new Calculator();
        calculator.setResult(3);
        double result = calculator.multiply(2);
        assertEquals(6, result, 0);
    }

    @Test
    public void testGetResult()
    {
        Calculator calculator = new Calculator();
        double result = calculator.getResult();
        assertEquals(0, result, 0);
    }

    @Test
    public void resultIsUpdatedAfterTwoMultiply()
    {
        Calculator calculator = new Calculator();
        calculator.setResult(3);
        calculator.multiply(2);
        calculator.multiply(2);
        assertEquals(12, calculator.getResult(), 0);
    }

    @Test
    public void canANumberBeMadeNegative()
    {
        Calculator calculator = new Calculator();
        calculator.setResult(5);
        calculator.negate();
        assertEquals(-5, calculator.getResult(), 0);
    }
}
