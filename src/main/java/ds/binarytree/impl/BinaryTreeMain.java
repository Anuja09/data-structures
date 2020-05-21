package main.java.ds.binarytree.impl;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BTNode node = new BTNode(10);
        BinaryTree binaryTree = new BinaryTree(node);
        binaryTree.add(20);
        binaryTree.add(30);
        binaryTree.add(40);
        binaryTree.add(50);
        binaryTree.add(60);
        binaryTree.add(70);

        BinaryTreeTraversals binaryTreeTraversals = new BinaryTreeTraversals();
        System.out.print("\nPreorder Traversal = ");
        binaryTreeTraversals.dfsPreorder(binaryTree.parent);
        System.out.print("\nInorder Traversal = ");
        binaryTreeTraversals.dfsInorder(binaryTree.parent);
        System.out.print("\nPostorder Traversal = ");
        binaryTreeTraversals.dfsPostOrder(binaryTree.parent);

        System.out.print("\nSearch 30 , found? = " + binaryTree.search(30));
        System.out.print("\nSearch 40 , found? = " + binaryTree.search(40));
        System.out.print("\nSearch 100 , found? = " + binaryTree.search(100));

        System.out.print("\nPrint Middle Level of tree = ");
        binaryTree.printMiddle(binaryTree.parent);

        System.out.println("\nHeight of binary tree = " +
                binaryTree.height(binaryTree.parent));



        //binaryTree.delete(20);
        System.out.print("\nBFS = ");
        binaryTreeTraversals.bfsTraversal(binaryTree.parent);

    }
}
