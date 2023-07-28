package calculator;
public class MagicCalculator {
    public static void main(String[] args) {
        JavaCalculator magicCalculator = new JavaCalculator();
        System.out.println(magicCalculator.add(5, 8));
        System.out.println(magicCalculator.subtract(12, 7));
        System.out.println(magicCalculator.multiplication(12, 4));
        System.out.println(magicCalculator.divide(7, 2));
        System.out.println(magicCalculator.square(11));
        System.out.println(magicCalculator.sin(3));
        System.out.println(magicCalculator.cosine(14));
        System.out.println(magicCalculator.tangent(9));
        System.out.println(magicCalculator.factorial(7));
    }
}
