import java.util.*;
public class SecondMostFrequentDigit {
    public static void main(String[] args) {
        String input = "11222344";

        // Step 1: Count frequencies using HashMap
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Sort entries by frequency (descending)
        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Handle edge cases and get second most frequent
        if (sortedList.size() < 2) {
            System.out.println("Not enough unique digits to find second most frequent.");
        } else {
            char secondMostDigit = sortedList.get(1).getKey();
            System.out.println("second most frequent no - " + secondMostDigit);
        }
    }
}
