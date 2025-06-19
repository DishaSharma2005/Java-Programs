//Program to print values of tree from root to leafnode [All path ]
// Sample tree structure
    //        1
    //       / \
    //      2   3
    //     /
    //    4
import java.util.*;
public class Root2leaf {
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
    public static void printPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        Node root = createTree();
        printRoot2leaf(root,new ArrayList<>());
    }
}
