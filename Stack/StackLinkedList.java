public class StackLinkedList {
    static class Node {// static class bnane se iske functions implement kane ke liye Outer class ke objects ki zarut nhi padegi 
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty()
        {
            return head==null;
        }
        public static void push (int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;//nothing to return 
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek()
        {
            return head.data;
        }
    }
    public static void main (String args[])
    {
        Stack s =new Stack();
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
