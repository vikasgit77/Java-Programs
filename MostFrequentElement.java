import java.util.*;
public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 0,-1, -7, 0,0 ,-7, 0,-7, -1,0,-1,-1,-7};

        // Step 1: Use a Map to count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            // If num already exists, add 1 to its count
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the number with the highest frequency
        int maxFreq = 0; // Tracks the highest count seen so far
        int mostFrequentNum = 0;//Holds the value with that highest count. Starts with -1 (safe default)

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequentNum = entry.getKey();
            }
        }

        // Step 3: Print result
        System.out.println(mostFrequentNum + " with maximum frequency  " + maxFreq);
    }
}
