public class Palindrome_LL {
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
//Slow Fast Approach 
public Node MidNode(Node head)// Calculating Middle Node
{
     Node slow=head;
     Node fast=head;
     if(fast!=null && fast.next!=null)
     {
        slow=slow.next;//+1
        fast=fast.next.next;//+2
     }
     return slow;
}
public boolean checkPalindrome(Node head)
{
    //Base Cond: Empty List , Single Node 
    if(head==null || head.next==null)
    {
        return true;
    }
    //Mid Node
    Node Mid_Node=MidNode(head);
    // Reversing the 2nd Half Array after Middle
    Node prev=null;
    Node curr=Mid_Node;
    Node next;
    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node right=prev;// 2nd   half  reverse ll ka head
    Node left=head;

    // Checking For Palindrome
    while(right!=null)
    {
        if(left.data !=right.data)
        {
            System.out.println("LL is not palindrome");
            return false;
        }
        left=left.next;
        right=right.next;
    }
    System.out.println("LL is Palindrome");
    return true;//LL is palindrome
}
public static void main(String[] args) {
    Palindrome_LL ll=new Palindrome_LL();
    ll.Add_First(1);
    ll.Add_First(2);
    ll.Add_First(1);
   System.out.println(ll.checkPalindrome(head));
}
}
