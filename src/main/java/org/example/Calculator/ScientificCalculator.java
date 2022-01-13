package org.example.Calculator;

import java.lang.Math;

public class ScientificCalculator extends Calculator{


    public double square() {
        return Math.pow(getResult(),2);
    }

    public double toThePowerOf(double number) {
        return Math.pow(getResult(), number);
    }

    public double squareRoot() {
        return Math.sqrt(getResult());
    }
}
