package org.example.Calculator;

import java.lang.Math;

public class ScientificCalculator extends Calculator{


    public int square(int i) {
        return (int) Math.pow(i,2);
    }

    public int toThePowerOf(int i, int i1) {
        return (int) Math.pow(i,i1);
    }

    public int squareRoot(int i) {
        return (int) Math.sqrt(i);
    }
}
