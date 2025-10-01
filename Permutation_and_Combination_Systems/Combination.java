// This class calculates combinations, which is choosing r items from n without regard to order.
public class Combination {
    
    // This method calculates the combination formula C(n, r) = n! / (r! * (n - r)!).
    public int calculate(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // This method calculates the factorial of a number n.
    private int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
