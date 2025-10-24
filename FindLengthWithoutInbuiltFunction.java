public class FindLengthWithoutInbuiltFunction {
    public static void main(String[] args) {

    String inputString = "Java Project";
    int length = 0;
    char ch[] =inputString.toCharArray();

    for(char c:ch)
    {
   length++;
   }
        System.out.println("Length of the string: " + length);
        }
}
