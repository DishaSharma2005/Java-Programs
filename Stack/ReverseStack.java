import java.util.*;

public class ReverseStack {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println("Original Stack:");
        printStack(s);

        // Create an empty stack 
        Stack<Integer> s2 = new Stack<>();
        Reverse_Stack(s, s2);
        System.out.println("Reversed Stack:");
        printStack(s2);
    }

    public static void Reverse_Stack(Stack<Integer> s, Stack<Integer> s2) {
        while (!s.isEmpty()) {
            int top = s.pop();
            s2.push(top);
        }
    }

    public static void printStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            int top = s.pop();
            System.out.println(top);
            temp.push(top);
        }
        // Restore original stack
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }
}
