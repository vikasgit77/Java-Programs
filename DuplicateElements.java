import java.util.*;
public class DuplicateElements {
public static void main(String[] args){
    //Generic code
    // ================= For String input ==============================

  String[] ch = {"Tester", "delhi", "Noida", "Delhi", "Tester", "delhi", "mohali", "delhi"};

   // int[] ch = {2,5, 3, 1, 6, 2, 5,4, 3,2,5,};

    // Step 1: Count frequencies (case-insensitive)
    Map<String, Integer> freqMap = new HashMap<>();
    for (String str : ch) {
        String lowerStr = str.toLowerCase();
        freqMap.put(lowerStr, freqMap.getOrDefault(lowerStr, 0) + 1);
    }
    // Step 2: Print strings that appear more than once
    System.out.println("Duplicate elements in an array");

   boolean found = false;
    for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.println(entry.getKey());
           found = true;
        }
    }
    if (!found) {
        System.out.println("No duplicates foundgit");
    }
}
}

// ================= For Integer input ==============================
/*
int[] arr = {2,5, 3, 1, 6, 2, 5,4, 3,2,5,};

// Step 1: Count frequencies (case-insensitive)
Map<Integer, Integer> freqMap = new HashMap<>();
    for (int num : arr) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // Step 2: Print strings that appear more than once
        System.out.println("Duplicate elements (case-insensitive):");

boolean found = false;
    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        if (entry.getValue() > 1) {
        System.out.println(entry.getKey());
found = true;
        }
        }
        if (!found) {
        System.out.println("No duplicates found.");
    }
            }}*/

  // =====  Below codes with Set fail if duplicates counts are more than 2 so always use Map logic===//
 // ------------   Integer Array --------
  /* int[] arr = {2, 1, 5, 3, 1, 6, 2, 4, 3,};
   Set<Integer> unique = new HashSet<>();

        System.out.println("Duplicate elements: ");
        for(int num:arr) {
        if (unique.add(num)==false) {
            // Already exists in the set → duplicate found
            System.out.print(num + " ");
        }*/

            // ------------  String array-----
    /*String [] ch={"Tester","delhi","Noida","Delhi","Tester","delhi","mohali","delhi"};
    Set<String> unique1 = new HashSet<>();
    System.out.println("Duplicate elements: ");
            for(String str:ch) {
                String strl =str.toLowerCase() ;
                if (unique1.add(strl)==false) {
                    // Already exists in the set → duplicate found
                    System.out.print(str + " ");
                }
    }
}*/


