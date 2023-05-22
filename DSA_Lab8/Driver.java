package DSA_Lab8;

public class Driver {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree(20);
        tree.add(30);
        tree.add(40);
        tree.add(50);
        System.out.println(tree);
        tree.printTree();
    }
}
