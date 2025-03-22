public class MergeSortLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
         }
    }
    public static Node head;

        public Node getMid(Node head)
        {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        public Node mergeSort(Node head)
        {
            if(head==null || head.next==null)
            {
                return head;
            }
            Node mid=getMid(head);
            Node rightHead=mid.next;
            mid.next=null;
            Node newleft=mergeSort(head);
            Node newright=mergeSort(rightHead);
            return merge(newleft,newright);
        }
        public Node merge(Node head1,Node head2)
        {
           Node mergeLL=new Node(-1);
           Node temp=mergeLL;
           while(head1!=null && head2!=null)
           {
                if(head1.data <=head2.data)
                {
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                }
                else{
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                }
           }
           if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;

        
           return mergeLL.next;
        }
        public void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String args[])
        {
            MergeSortLL ll = new MergeSortLL();
            ll.head = ll.new Node(3);
            ll.head.next = ll.new Node(1);
            ll.head.next.next = ll.new Node(2);
            ll.head.next.next.next = ll.new Node(4);
    
            System.out.println("Before Sorting:");
            ll.printList(ll.head);
    
            ll.head = ll.mergeSort(ll.head); 
           System.out.println("After Sorting:");
           ll.printList(ll.head);
    }
}
