import java.util.*;
import java.io.*;
public class FindMultipleMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8};

        int start = 1;
        int end = 8;
        // Step 1: Add all array elements to a set
        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }
        // Step 2: Check for missing numbers in the range
        System.out.print("Missing numbers: ");
        for (int i = start; i <= end; i++) {
            if (!numSet.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}