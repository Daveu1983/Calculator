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

}
