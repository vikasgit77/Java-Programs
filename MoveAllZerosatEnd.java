import java.util.*;

public class MoveAllZerosatEnd {
    public static void main(String[] args) {
        int[] arr = {1,0, 2, 0, 0, 3, 4};

        int index = 0; // Keeps track of position to place next non-zero element

        // Step 1: Move all non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[index] = num;
                index++;
            }
        }

        // Step 2: Fill the remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Step 3: Print the result
        System.out.println("After moving zeros to the end: " + Arrays.toString(arr));
    }
}
