//Deque will be implemented using Java Collection Framework 
import java.util.*;
public class Deque_JCF {
    public static void main(String args[])
    {
        Deque<Integer>q=new LinkedList<>();
        q.addFirst(1);
        q.addLast(2);
        q.removeFirst();
        while(!q.isEmpty())
        {
            System.out.println(q.peek()+" ");
            q.removeLast();
        }
    }
}
