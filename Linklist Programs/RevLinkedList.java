/*Program to Implement :
1. Insertion 
   a)From start
   b)From end 
   c)Middle 
2. Removal 
   a)From start
   b)From end 
3. Searching 
   a)Linear Search 
   b)Recursive Search
4. Reverse A linklist 
*/
public class RevLinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void Insert_Start(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)// if LL is empty so , newNode will be first node 
        {
             head=tail=newNode;
             return;
        }
        newNode.next=head;// if there is already a node , then address of head will be stored in newNode 
        head=newNode;//then newNode will be start of Linklist 
    }
    public void Insert_End(int data)
    {
          Node newNode=new Node(data);
          size++;
          if(head==null)
          {
            head=tail=newNode;
            return;
          }
          tail.next=newNode;
          newNode=tail;
    }
    public void Add_Middle(int idx,int data)
    {
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        if(idx==0)// if idx is zero insert at head 
        {
            Insert_Start(data);
            return;
        }
        while(i<idx-1 && temp!=null)
        {
            temp=temp.next;
            i++;
        }
       if(temp==null)
       {
        System.out.println("Invalid Index");
        return;
       }
      newNode.next=temp.next;
      temp.next=newNode;
    }
    public int Remove_Start()
    {
         if(size==0)
         {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
         }
         if(size==1)
         {
             int var=head.data;
             head=tail=null;
             return var;
         }
         int var=head.data;
         head=head.next;
         size--;
         return var;

    }
    public int Remove_End()
    {
        if(size==0)
        {
            System.out.println("LL is empty ");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int var=head.data;
            head=tail=null;
            return var;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;// Second last node tak acess hoga
        }
          int val=prev.next.data;// last node ke data ko store 
          prev.next=null;//second last node ke next me null store // last node remove 
          tail=prev;//updating tail value
          return val;
    }
    public int  Linear(int key)
    {
        Node temp=head;
        for(int i=0;i<size-1;i++){
          if(key==temp.data)
          {
            System.out.println("Key Found at :" +i);
          }
          temp=temp.next;
        }
        return -1;

    }
    public int recSearch(int key)
    {
        return helper(head,key);
    }
    public int helper(Node head,int key)
    {
        if(head==null)//Base Case 
        {
            return -1;
        }
        if(head.data==key){
            System.out.println("key found at 0");
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1)
        {
            return -1;//key dose not exist 
        }
        int result= idx+1;//updated index
        System.out.print("key found at : " +result);
        return 1;
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
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
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
             prev=curr;
             curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        RevLinkedList ll =new RevLinkedList();
        ll.Insert_Start(2);
        ll.print();
        ll.Insert_End(3);
        ll.print();
        ll.Add_Middle(1, 4);
        ll.print();
        ll.reverse();
        ll.print();
        ll.Remove_Start();
        ll.print();
        ll.Remove_End();
        ll.print();
        ll.Insert_Start(3);
        ll.Insert_Start(1);
        ll.print();
        System.out.println(ll.Linear(4));
        System.out.println(ll.recSearch(4));

    }
}
