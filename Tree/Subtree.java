// Node class definition
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Subtree {
    public static boolean isSubtree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
          
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

  
    public static boolean isIdentical(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.data != node2.data) {
            return false;
        }
        return isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
    }

    // Example main function
    public static void main(String[] args) {
        Node root = createTree();

        // Sample subroot
        Node subroot = new Node(2);
        subroot.left = new Node(4);

        boolean result = isSubtree(root, subroot);
        System.out.println("Is subroot a subtree of root? " + result);
    }

    // Sample tree structure
    //        1
    //       / \
    //      2   3
    //     /
    //    4
    public static Node createTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        return root;
    }
}
