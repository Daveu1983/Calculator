package org.example.Calculator;

public class Calculator
{

    private double result = 0.0d;

    public double add(double number) {
        setResult(getResult() + number);
        return getResult();
    }

    public double subtract(int number) {
        setResult(getResult() - number);
        return getResult();
    }

    public double divide(double number) {
        setResult((getResult() / number));
        return getResult();
    }

    public double multiply(double number) {
        setResult(result * number);
        return getResult();
    }

    public void setResult(double i) {
        this.result = i;
    }

    public double getResult() {
        return result;
    }
}
