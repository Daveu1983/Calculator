package org.example.Calculator;

public class Calculator
{

    private int result = 0;

    public int add(int i, int i1) {
        return i + i1;
    }

    public int subtract(int i, int i1) {
        return i - i1;
    }

    public double divide(double i, double i1) {
            return i / i1;
    }

    public int multiply(int i, int i1) {
        return i * i1;
    }

    public int getResult() {
        return result;
    }
}
