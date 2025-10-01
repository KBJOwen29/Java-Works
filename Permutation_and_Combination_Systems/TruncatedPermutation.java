// This class calculates truncated permutations, where only r items are selected from n.
public class TruncatedPermutation {
    
    // This method calculates truncated permutations using the formula P(n, r) = n! / (n - r)!.    
    public int calculate(int n, int r) {
        return factorial(n) / factorial(n - r);
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
        