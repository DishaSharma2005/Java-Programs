import java.util.*;

public class ReveseString {
     public static void main(String args[])
    {
        Stack<Character>s=new Stack<>();
        String reversed = Revese_Str(new StringBuilder(), s);
        System.out.println("Reversed String: " + reversed);
    }
    public static String Revese_Str(StringBuilder result, Stack<Character> s)
    {
        int idx=0;
        String str="abc";
        while(idx<str.length())
        {
           s.push(str.charAt(idx));
           idx++;
        }
        while(!s.isEmpty())
        {
        char curr=s.pop();
        result.append(curr);
        }
        return result.toString();//String builder to string 
    }
}
