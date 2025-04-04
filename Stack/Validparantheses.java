import java.util.*;
public class Validparantheses {
    public static void main(String args[])
    {
        //Stack<Character>s=new Stack<>();
        String str="{}[";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str )
    {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
          if (ch=='{'||ch=='['||ch=='('){
            s.push(ch);
          }
          else{
            if(s.isEmpty())//stack has no opening brackets
            {
                 return false;
            }
            else if(s.peek()=='{' && ch=='}'||s.peek()=='[' &&ch==']'||s.peek()=='(' &&ch==')')
            {
                s.pop();//pair are forming 
            }
            else
            return false;
        }
    }
        if(s.isEmpty()){
            return true;
        }
         else{
            return false;
         }
    }
}

