import java.util.HashMap;

public class RepeatedPermutation {
    public int calculate(String input) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char ch : input.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        int numerator = factorial(input.length());
        int denominator = 1;
        for (int count : frequency.values()) {
            denominator *= factorial(count);
        }
        return numerator / denominator;
    }

    private int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
