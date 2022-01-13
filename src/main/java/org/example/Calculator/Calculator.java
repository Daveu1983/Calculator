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
        if (result == 0) {
            setResult(i*i1);
        }
        else {
            setResult(result * i1);
        }
        return getResult();
    }

    public void setResult(int i) {
        this.result = i;
    }

    public int getResult() {
        return result;
    }
}
