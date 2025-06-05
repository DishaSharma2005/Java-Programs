import java.util.*;
public class LevelOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
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
    public static void  LevelOrderTraversal(Node root){
       if(root==null)
       {
           return ;
       }
       Queue<Node> q=new LinkedList<>() ;
       q.add(root);
       q.add(null);
       while (!q.isEmpty()){
        Node currNode=q.remove();
        if(currNode ==null){
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }
        else{
            System.out.println(currNode.data+" ");
            if(currNode.left !=null){
                q.add(currNode.left);
            }
             if(currNode.right !=null){
                q.add(currNode.right);
            }
        }
       }
    }
    public static void main(String args[]){
        Node root=createTree();
        System.out.println("Root node data = "+root.data);
        LevelOrderTraversal(root);
    }
}
