// to print  first non repeating character with  consequitve string character of given string 
//whenever there is word stream :Hint is to  use Queue 
import java.util.*;
public class FirstNonRepeating {
    public static void main(String args[])
    {
       String str=" abbccx";
       Non_Repeating(str);
    }
    public static void Non_Repeating(String str) {
        int freq[] = new int[26]; // To track frequency of a character
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Convert to lowercase or handle uppercase letters if needed
            if (ch >= 'a' && ch <= 'z') {
                q.add(ch);
                freq[ch - 'a']++; // Correct index calculation
                while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                    q.remove();
                }
                if (q.isEmpty()) {
                    System.out.print(-1 + " ");
                } else {
                    System.out.print(q.peek() + " ");
                }
            } else {
                System.out.print(-1 + " "); // Handle non-lowercase characters
            }
        }
        System.out.println(); // Fixed the println statement
    }
}
