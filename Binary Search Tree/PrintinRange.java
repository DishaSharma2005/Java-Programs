//Program to print the values of tree from given range of K1 and K2 
//Case 1 :k1<=root && k2>=root --> Ls,Rs , Case 2 :k1<root --> Ls ,  Case 3 :k2 >root --> Ls 
public class PrintinRange {
    static class Node{
        int data;
        Node left;
        Node right;
         public  Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
         }
    }
     public static Node createTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        return root;
    }

    public static void PrintinRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            PrintinRange(root.left, k1, k2);
            System.out.println(root.data+" ");
            PrintinRange(root.right, k1, k2);
        }
        else if(root.data<k1){
            PrintinRange(root.right,k1,k2);
        }
        else{
            PrintinRange(root.left, k1, k2);
        }

    }
     public static void main(String[] args) {
        Node root = createTree();
        PrintinRange(root,1,4);
    }
}
