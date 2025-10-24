import java.util.*;
public class MoveAllZerosatStart {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 0, 3, 4};

        int index = arr.length - 1;  // Start from end for placing non-zero elements

        // Step 1: Traverse from end and move non-zero elements to the back
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }

        // Step 2: Fill the remaining front part with 0s
        while (index >= 0) {
            arr[index] = 0;
            index--;
        }
    }

}
