//implementing queue using stack
import java.util.*;
public class Queue2stack {
    static class Queue{
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());//stack 1 empty
            }
            s1.push(data);//stack will push the data 
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());//s1 will get updated data
            }
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty())
            {
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[])
    {
       Queue q= new Queue();
       q.add(1);
       q.add(2);
       while(!q.isEmpty())
       {
        System.out.println(q.peek()+" ");
        q.remove();
       }

    }
}
