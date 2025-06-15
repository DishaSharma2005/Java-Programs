//Program is about calculating height , Count the number of  Nodes , Sum of Nodes

import java.util.*;
public class OperationsTree {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static Node createTree(){
      Node root=new Node(1);
      root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(5);
        return root;
    }
    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);
        int height= Math.max(lh,rh)+1;
        return height;
    }
    public static int CountNode(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=CountNode(root.left);
        int rightCount=CountNode(root.right);
        return leftCount+rightCount+1;
    }
    public static int SumofNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=SumofNodes(root.left);
        int rightCount=SumofNodes(root.right);
        return leftCount+rightCount+root.data;
    } 
     public static void main(String args[]){
        Node root=createTree();
        System.out.println("Root node data = "+root.data);
        System.out.println("Height of tree ="+ Height(root));
        System.out.println("Number of Nodes ="+ CountNode(root));
         System.out.println("Sum of Nodes ="+ CountNode(root));
    }
}
