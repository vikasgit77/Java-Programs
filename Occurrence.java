
import java.util.*;
public class Occurrence {

    public static void main(String[] args) {

// -- Shortest method to print Occurrence of Elements
        int[] arr = {2, 1, 5, 3, 1, 6, 2, 4, 3, 2, 1, 3, 5};

        Map<Integer, Integer> unique = new HashMap<Integer, Integer>();

        // Step 1: Count frequency of each number
        for (int num : arr) {
            unique.put(num, unique.getOrDefault(num, 0) + 1);
        }
        System.out.println(unique);
    }
}
      /*  String str = "jAva ProgrAm is Good to Learn";
        String key = str.toLowerCase(); // converted to Lowercase so that it will treat small and capital letters as same a and A will be same.
        char [] ch = key.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();

        // Step 1: Count each character
        for (char c :ch) {

            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.println(charCount);
    }
}
*/
/*    Imagine this loop is processing the array:
    int[] arr = {2, 1, 2};
--Explanation of below line
unique.put(num, unique.getOrDefault(num, 0) + 1);


    When this line runs inside a loop:
  🧩 First time: num = 2
    Map is empty.
  unique.getOrDefault(2, 0) → returns 0
    So 0 + 1 = 1
   unique.put(2, 1) → map becomes {2=1}

🧩 Second time: num = 1
    Not in map.
    unique.getOrDefault(1, 0) → 0
    0 + 1 = 1
    Map becomes {2=1, 1=1}

🧩 Third time: num = 2 again
unique.getOrDefault(2, 0) → returns 1
            1 + 1 = 2
            unique.put(2, 2) → map becomes {2=2, 1=1}*/


/*                    String [] ch={"Tester","delhi","Noida","Delhi","Tester"};
//char [] ch = str.toCharArray();
                    HashMap<String,Integer> hm = new HashMap<String,Integer>();

                    for(String c:ch)
                    {
                        String key = c.toLowerCase();
                        if(hm.containsKey(key))
                        {
                            hm.put(key,hm.get(key)+1);
                        }
                        else {
                            hm.put(key,1);

                        }

                    }

                    System.out.print(hm);
                }*/


       /*// String str = "programming";
        String str = "java jveetm";
        //  printNonRepetitiveCharacters(input);

        //public static void printNonRepetitiveCharacters(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Step 1: Count each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 2: Print characters with count = 1
        System.out.print("Non-repetitive characters: ");
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }*/



