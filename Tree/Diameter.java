// This program computes the Diameter of a Binary Tree in O(n) time complexity.
// Diameter of a tree = Number of nodes on the longest path between any two leaf nodes.

public class Diameter {

    // Class to store diameter and height together
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(OperationsTree.Node root) {
        // Base case: if node is null, return diameter and height as 0
        if (root == null) {
            return new Info(0, 0);
        }

        // Recursive calls for left and right subtrees
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        // Height of current node
        int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        // Diameter at current node = height of left + height of right + 1 (for current node)
        int diameterThroughRoot = leftInfo.ht + rightInfo.ht + 1;

        // Max diameter so far
        int maxDiameter = Math.max(diameterThroughRoot, Math.max(leftInfo.diam, rightInfo.diam));

        return new Info(maxDiameter, height);
    }

    public static void main(String[] args) {
        OperationsTree.Node root = OperationsTree.createTree();
        Info treeInfo = diameter(root);
        System.out.println("Diameter of the tree: " + treeInfo.diam);
    }
}
