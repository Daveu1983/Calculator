package org.example.Calculator;

public class Calculator
{

    private double result = 0.0d;
    private String message;

    public double add(double number) {
        setResult(getResult() + number);
        return getResult();
    }

    public double subtract(int number) {
        setResult(getResult() - number);
        return getResult();
    }

    public double divide(double number) {
        try{
            double result = getResult() / number;
            setResult(result);
        }
        catch (IllegalArgumentException ex){
            setResult(0);
            setErrorMessage(ex.getMessage());
        }
        return getResult();
    }

    public String setErrorMessage(String message) {
        this.message = message;
        return message;
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

    public void negate() throws ArithmeticException {
        double result = getResult();
        if (result > 0) {
            result = 0 - result;
            setResult(result);
        } else {
            throw new ArithmeticException("cannot negate a number");
        }
    }
}
