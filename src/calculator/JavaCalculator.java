package calculator;

public class JavaCalculator {
    // ACTION METHODS
    public int add(int num1, int num2) {

        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
    public int square(int num1) {
        return (int) Math.sqrt(num1);
    }
    public int sin(int num1) {
        return (int) Math.sin(num1);
    }
    public int cosine(int num1) {
        return (int) Math.cos(num1);
    }
    public int tangent(int num1) {
        return (int) Math.tan(num1);
    }
    public int factorial(int num1) {
        int total = num1;

        for(int multiplier = 1; multiplier <= num1; multiplier++) {
            total *= multiplier;
        }
        return total;
    }
}
