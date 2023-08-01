package calculator;

public class JavaCalculator {
    // VARIABLES
    private int num1;
    private int num2;

    // SETTERS
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNums(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // GETTERS
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }


    // METHODS
    public int add(int num1, int num2) {
        setNums(num1, num2);
        return this.num1 + this.num2;
    }
    public int subtract(int num1, int num2) {
        setNums(num1, num2);
        return this.num1 - this.num2;
    }
    public int multiplication(int num1, int num2) {
        setNums(num1, num2);
        return this.num1 * this.num2;
    }
    public double divide(int num1, int num2) {
        setNums(num1, num2);
        return (double) this.num1 / this.num2;
    }
    public int square(int num1) {
        setNum1(num1);
        return (int) Math.sqrt(this.num1);
    }
    public int sin(int num1) {
        setNum1(num1);
        return (int) Math.sin(this.num1);
    }
    public int cosine(int num1) {
        setNum1(num1);
        return (int) Math.cos(this.num1);
    }
    public int tangent(int num1) {
        setNum1(num1);
        return (int) Math.tan(this.num1);
    }
    public int factorial(int num1) {
        setNum1(num1);

        int total = this.num1;

        for(int multiplier = 1; multiplier <= this.num1; multiplier++) {
            total *= multiplier;
        }
        return total;
    }
}
