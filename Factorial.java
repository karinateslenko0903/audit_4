import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("Factorial of " + i + ": " + factorial(i));
        }
    }
}
