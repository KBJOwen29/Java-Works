// This class calculates the number of linear permutations for a given number of items.
public class LinearPermutation {
    
    // This method calculates the linear permutation of n items.
    public int calculate(int n) {
        return factorial(n);
    }

    // This method calculates the factorial of a number n (n! = n * (n-1) * ... * 1).
    private int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
