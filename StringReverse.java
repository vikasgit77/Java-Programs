public class StringReverse {

   /* public static void main(String[] args) {
        String str = "java";
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.println(str.charAt(i));
        }
    }*/


// Sentence Reverse
/*public static void main(String[] args) {
    String str = "Java is a programming language";

    for (int i = str.length() - 1; i >= 0; i--) {
        System.out.println(str.charAt(i));
    }
}*/
    // Reverse each letter of word in a Sentence
    public static void main(String[] args) {
        String sentence = "I am learning Java";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        String result = "";

        // Reverse each word manually
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";
        }

        // Trim the final result to remove extra space
        System.out.println(result.trim());
    }




}