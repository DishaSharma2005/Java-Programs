import java.util.*;
public class DuplicateParanthses {
    public static void main (String args[])
    {
        String str="((a+b))";
        System.out.println(isDuplicate(str));
    }
    public static boolean isDuplicate(String str)
    {
        Stack <Character>s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          if(ch==')')
          {
            int count=0;
            while(s.peek()!='(')
            {
              s.pop();
              count++;
            }
            if(count<1)
            {
               return true;
            }
            else{
               s.pop();
            }
          }
          else
          {
            s.push(ch);
          }
        }
        return false;
    }
}

