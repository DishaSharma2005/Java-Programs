public class CycleLL {
    public class Node {
        int data;
        Node next;
    public Node (int data)
    {
        this.data=data;
        this.next=null;
    }
}
public static Node head;
public static Node tail;
public  static boolean Cycle( )
{
   Node slow=head;
   Node fast=head;
   while(fast!=null && fast.next!=null)
   {
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast)
    {
        return true;
    }
   }
   return false;
}
public static void removeCycle()
{
    boolean isCycle=false;
    Node slow=head;
    Node fast=head;
    while(fast!=null &&fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow)
        {
           isCycle=true;
           break;
        }
    }
    if(isCycle==false)
    {
        return;
    }
    //Meeting Point 
    slow=head;
    Node prev=null;
    while(slow!=fast)
    {
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }
    if(prev!=null)
    prev.next=null;//last node null assign karede
}



public static void main(String args[]) {
    CycleLL ll = new CycleLL(); 
    
    ll.head = ll.new Node(1);
    ll.head.next = ll.new Node(2);
    ll.head.next.next = ll.new Node(3);
    ll.head.next.next.next = ll.new Node(4);
    ll.head.next.next.next.next = ll.head.next;// Creating a cycle
    System.out.println(ll.Cycle());
    ll.removeCycle();
    System.out.println(ll.Cycle());
}
}

