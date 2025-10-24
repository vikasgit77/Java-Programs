import java.util.*;
public class FirstNonRepeatingChar {
    public static void main (String[] args) {
        //String input = "aabbccddz";
        String input = "monnmoetyepppe";

        // Step 1: Count frequency of each character
     //   -------- Used LinkedHashMap instead of HashMap because LinkedHashMap maintains insertion order and gives correct output----//

        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (char ch : input.toCharArray())
        {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }


        // Step 2: Traverse map to find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }

        // Step 3: If no non-repeating character is found
        System.out.println("No non-repeating character found");
    }
}

