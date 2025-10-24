import java.util.*;

public class LetterReverse {
    public static void main(String [] args)
    {
        String str = "Java Program";
        String blank ="";
        
    //   Output -  avaJ margorP
        String [] word =str.split(" ");
        for(String rev:word)
        {
            for(int i =rev.length()-1;i>=0;i--)
            {
                blank = blank+ rev.charAt(i);

            }
            blank = blank + " ";
            System.out.println(blank +  " ");
    }

    }

}
