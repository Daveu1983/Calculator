package org.example.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class scientificCalculatorTest {
    @Test
    public void addTwoNumbers()
    {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.setResult(2);
        double result = calculator.add(3);
        assertEquals(5, result, 0);
    }

    @Test
    public void squareNumber()
    {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.setResult(3);
        double result = calculator.square();
        assertEquals(9, result, 0);
    }

    @Test
    public void powerOf()
    {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.setResult(3);
        double result = calculator.toThePowerOf(4);
        assertEquals(81, result, 0);
    }

    @Test
    public void squareRootTest()
    {
        ScientificCalculator calculator = new ScientificCalculator();
        calculator.setResult(25);
        double result = calculator.squareRoot();
        assertEquals(5, result, 0);
    }

}
