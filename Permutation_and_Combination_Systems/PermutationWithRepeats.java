import java.util.HashMap;

// This class calculates permutations with repeated items.
public class PermutationWithRepeats {
    
    // This method calculates permutations where there may be repeating items.
    // Formula: n! / (k1! * k2! * ... * kn!), where k1, k2, ... are the frequencies of the repeating items.
    public int calculate(String[] items) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String item : items) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }
        int numerator = factorial(items.length);
        int denominator = 1;
        for (int count : countMap.values()) {
            denominator *= factorial(count);
        }
        return numerator / denominator;
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

