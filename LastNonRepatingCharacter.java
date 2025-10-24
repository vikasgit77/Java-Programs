import java.util.LinkedHashMap;
import java.util.Map;

public class LastNonRepatingCharacter {

public static void main(String[] args)
{
    String input = "myonnmoetyepp";

    // Step 1: Count frequency of each character
    //   -------- Used LinkedHashMap instead of HashMap because LinkedHashMap maintains insertion order and gives correct output----//

    Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
        freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
    }

    // Step 2: Traverse to find the first non-repeating character
        for (int i = input.length() - 1; i >= 0; i--)
        {
        char ch1 = input.charAt(i);
        if (freqMap.get(ch1) == 1)
        {
            System.out.println(ch1);
            break;
        }
    }
    // Step 3: If no non-repeating character is found
    System.out.println("No non-repeating character found");
}}

