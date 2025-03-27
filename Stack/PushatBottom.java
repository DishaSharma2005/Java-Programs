import java.util.*;
public class PushatBottom {
    public static void main(String args[])
    {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtbottom(4,s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void pushAtbottom(int data, Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbottom(data, s);
        s.push(top);
    }
}
