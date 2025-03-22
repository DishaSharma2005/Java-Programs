public class RemoveNthEnd {
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
public void Add_First(int data)
{
    Node newNode=new Node(data);
    if(head==null)
    {
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
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
        System.out.print(temp.data+"--> ");
        temp=temp.next;
     }
     System.out.println("null");
}
public void  Remove_Node_End(int n)
{
    //Calculating Size
    int size=0;
     Node temp=head;
     while(temp!=null)
     {
        temp=temp.next;
        size++;
     }
     if(n==size)
     {
        head=head.next;
        return;
     }
     int idx=size-n;
     Node prev=head;
     for(int i=1;i<idx;i++)
     {
        prev=prev.next;
     }
     prev.next=prev.next.next;
     return;
}
public static void main(String args[])
{
    RemoveNthEnd ll=new RemoveNthEnd();
    ll.Add_First(5);
    ll.Add_First(4);
    ll.Add_First(3);
    ll.Add_First(2);
    ll.Add_First(1);
    ll.print();
    ll.Remove_Node_End(2);
    ll.print();
}
}

