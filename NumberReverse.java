import java.util.*;
public class NumberReverse {

    public static void main(String[] args) {
        int num = 151;
        int temp = num;
        int rev = 0, rem = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("Number is palindrome");

        } else {
            System.out.println("Number is not palindrome");

        }

    }
}