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

    public void setResult(double number) {
        this.result = number;
    }

    public double getResult() {
        return result;
    }

    public void negate() {
        double result = getResult();
        if (result > 0){
            result = 0 - result;
            setResult(result);
        }
        else {
            System.out.println("number is already negative");
        }
    }
}
