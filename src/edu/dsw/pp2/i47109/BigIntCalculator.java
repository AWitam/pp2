package edu.dsw.pp2.i47109;

import java.math.BigInteger;

public class BigIntCalculator {
    private void calculate(String mathOperation) {
        try {
            String[] split = mathOperation.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
            BigInteger a = new BigInteger(split[0]);
            String operator = split[1];
            BigInteger b = new BigInteger(split[2]);
            BigInteger result = this.getResult(a, b, operator);
            System.out.println("Result: " + result);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    private BigInteger getResult(BigInteger a, BigInteger b, String operand) {
        switch (operand) {
            case "+":
                return a.add(b);
            case "-":
                return a.subtract(b);
            case "*":
                return a.multiply(b);
            case "/":
                if (b.signum() == 0) {
                    throw new RuntimeException("Cannot divide by zero!");
                }
                return a.divide(b);
            default:
                throw new RuntimeException("Invalid operator!");
        }
    }

    public void exec() {
        String bigIntOperation = new InputReader().getInputValue("Enter a math operation >>");
        this.calculate(bigIntOperation);
    }
}
