public class ZigZagLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head; 
    public Node Mid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) { 
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void Zig_Zag(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        Node mid = Mid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node left = head;
        Node right = reverse(rightHead);
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            right = nextR;
            left = nextL;
        }
    }
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; 
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();
        ll.head = ll.new Node(1);
        ll.head.next = ll.new Node(2);
        ll.head.next.next = ll.new Node(3);
        ll.head.next.next.next = ll.new Node(4);
        ll.head.next.next.next.next = ll.new Node(5);

        System.out.println("Before Zig-Zag:");
        ll.printList(ll.head);

        ll.Zig_Zag(ll.head);

        System.out.println("After Zig-Zag:");
        ll.printList(ll.head);
    }
}
