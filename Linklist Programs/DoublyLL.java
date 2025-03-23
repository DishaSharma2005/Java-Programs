/*Program to implement insert from start and end , delete from start and end & reverse a doubly Linkedlist */
public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public  void Add_First(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public  void Add_Last(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public  int  Remove_First()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==0)
        {
            int val=head.data;
            return val;
        }
       int val=head.data;
       size--;
       head=head.next;
       return val;

    }
    public  int  Remove_Last()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null)
        {
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node prev=head;
       for(int i=0;i<size-2;i++)
       {
          prev=prev.next;
       }
       int val=tail.data;
       prev.next=null;
       tail=prev;
       return val;

    }
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;//Extra Step other than singly linked list !! 
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        DoublyLL ll=new DoublyLL();
        ll.Add_First(2);
        ll.Add_First(1);
        ll.print();
        ll.Add_Last(0);
        ll.print();
        ll.reverse();
        ll.print();
        ll.Remove_First();
        ll.print();
        ll.Remove_Last();
        ll.print();
    }
}
