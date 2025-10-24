import java.util.*;
public class UniqueElements {

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

        public static void main(String[] args) {
            int[] arr = {2, 1, 5, 3, 1, 6, 2, 4, 3,2,1,3,5};
            Map<Integer, Integer> unique = new HashMap<Integer,Integer>();

            // Step 1: Count frequency of each number
            for ( int num : arr) {
                unique.put(num, unique.getOrDefault(num, 0) + 1);
            }

              /*  if (unique.containsKey(num))
                {
                   // unique.put(num, unique.get(num) + 1);

                }
//                else {
//                    unique.put(num, 1);
//                }*/

                // Step 2: Print numbers that occur only once
            boolean found =true;
                System.out.println("Non-repetitive elements:");
            for (Map.Entry<Integer, Integer> entry : unique.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println(entry.getKey());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No duplicates found.");
            }
        }
               /* for ( int num : arr) {
                    if (unique.get(num) == 1) {
                        System.out.print(num + " ");
                    }

                }*/
            }


     /*       String[] ch = {"Tester", "delhi", "Noida", "Delhi", "tester","Delhi","Bangalore"};

            // Step 1: Count frequencies using lowercase keys
            Map<String, Integer> freqMap = new HashMap<>();

            for (String str : ch) {
                String lower = str.toLowerCase();
                freqMap.put(lower, freqMap.getOrDefault(lower, 0) + 1);
            }

            // Step 2: Print elements that appear only once (case-insensitive)
            System.out.println("Non-repetitive elements:");
            for (String str : ch) {
                if (freqMap.get(str.toLowerCase()) == 1) {
                    System.out.println(str);
                }
                }*/




