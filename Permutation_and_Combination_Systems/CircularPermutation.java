// This class calculates the number of circular permutations for a given number of items.
public class CircularPermutation {
    
    // This method calculates the circular permutation of n items.
    // In circular permutation, (n-1)! is used instead of n!.
    public int calculate(int n) {
        return factorial(n - 1); // (n-1)!
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
