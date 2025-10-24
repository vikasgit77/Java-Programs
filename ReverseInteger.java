import java.util.*;
public class ReverseInteger {
    public static void main(String[] args) {

        Scanner scn = new Scanner (System.in);
       int num = scn.nextInt();

        //int num = 325;
       // int temp = num;
        int rev=0;
        int rem;

       // while (num != 0)
        for(int i=0;i<=num;i++)
        {

            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;


        }
        System.out.println(rev);
       /* if(rev==temp)
        {
        System.out.println("Palindrome");
    }
        else {
            System.out.println("Not a Palindrome");
        }*/
}}