/*A program to implement Stack using Arraylist and perform operations:
 * push : insert data from top
 * pop:delete data from top
 * peek:see, the top element
 */
import java.util.ArrayList;
public class StackArraylist {
    static class Stacks{
        static ArrayList<Integer>list=new ArrayList<>();
        // Check for is stack empty
       public static boolean isEmpty(){
        return list.size()==0;
}   
 //push a element
 public static void push(int data)
 {
    list.add(data);
 }
 //pop a element
 public static int pop()
 {
    if(isEmpty()==true)
    {
       System.out.println("Stack underflow");
       return -1;
    }
    int top=list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;
}
//peek 
public static int peek()
 {
    int top=list.get(list.size()-1);
    return top;
}
}
    public static void main (String args[]){
        Stacks s=new Stacks();
        s.push(1);
        s.push(2);
        s.push(3);
       if(s.isEmpty())
       {
           System.out.println("stack underflow");
       }
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
