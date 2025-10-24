import java.util.*;
public class RemoveDuplicatesAndSort {
    public static void main(String[] args) {
        String s = "aabbddcccee";


        // Step 1: Use a Set to collect unique chars
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }

        // Step 2: Convert Set to List to sort
        List<Character> list = new ArrayList<>(uniqueChars);
        Collections.sort(list);

       /* // Step 3: Build output string
        StringBuilder result = new StringBuilder();
        for (char c : list) {
            result.append(c);
        }*/
        String str = new String(list.toString());

        System.out.println(str);
       // System.out.println(result.toString());  // Output: abcde

    }
}


