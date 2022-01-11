package org.example.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class scientificCalculatorTest {
    @Test
    public void addTwoNumbers()
    {
        ScientificCalculator calculator = new ScientificCalculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void squareNumber()
    {
        ScientificCalculator calculator = new ScientificCalculator();
        int result = calculator.square(3);
        assertEquals(9, result);
    }

    @Test
    public void powerOf()
    {
        ScientificCalculator calculator = new ScientificCalculator();
        int result = calculator.toThePowerOf(3,4);
        assertEquals(81, result);
    }

    @Test
    public void squareRootTest()
    {
        ScientificCalculator calculator = new ScientificCalculator();
        int result = calculator.squareRoot(25);
        assertEquals(5, result);
    }

}
