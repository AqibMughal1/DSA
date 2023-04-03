package DSA_Lab6;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

      

    void printPostorder(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    void printInorder(Node node) {
        if (node == null)
            return;

        // fi/st recur on left child 
        printInorder(node.left);

        // then print the data of node 
        System.out.print(node.key + " ");

        // now recur on right child 
        printInorder(node.right);
    }


}
