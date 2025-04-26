//Program to print interleave 2 halves of a queue [even length]
//Example : 1234 --> 1423(output)
import java.util.*;
public class InterLeave {
    public static void InterLeave(Queue<Integer>q)
    {
        Queue<Integer>firstHalf= new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size;i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
              q.add(firstHalf.remove());
              q.add(q.remove());
        }

    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        InterLeave(q);
        while(!q.isEmpty()){
            System.out.println(q.peek()+"");
            q.remove();
        }
    }
}
