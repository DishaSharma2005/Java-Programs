//Implement Stack and Queue using Deque 
import java.util.*;
public class Stack_Queue_Deque {
    
    public static class Stack {
        Deque<Integer> q = new ArrayDeque<>();
        
        public void push(int data) {
            q.addFirst(data);
        }
        
        public int pop() {
            return q.removeFirst();
        }
        
        public boolean isEmpty() {
            return q.isEmpty();
        }
        
        public int peek() {
            return q.peekFirst();
        }
    }

    public static class Queue {
        Deque<Integer> q = new ArrayDeque<>();
        
        public void add(int data) {
            q.addLast(data);
        }
        
        public int remove() {
            return q.removeFirst();
        }
        
        public boolean isEmpty() {
            return q.isEmpty();
        }
        
        public int peek() {
            return q.peekFirst();
        }
    }

    public static void main(String args[]) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.remove();
        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.pop();
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
