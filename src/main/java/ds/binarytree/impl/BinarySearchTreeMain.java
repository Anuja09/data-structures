package main.java.ds.binarytree.impl;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.parent =  binarySearchTree.insertKey(binarySearchTree.parent, 10);
        binarySearchTree.parent =  binarySearchTree.insertKey(binarySearchTree.parent, 20);
        binarySearchTree.parent =  binarySearchTree.insertKey(binarySearchTree.parent, 5);
        binarySearchTree.parent =  binarySearchTree.insertKey(binarySearchTree.parent, 7);
        binarySearchTree.parent =  binarySearchTree.insertKey(binarySearchTree.parent, 15);
        BinaryTreeTraversals traversals = new BinaryTreeTraversals();
        traversals.dfsInorder(binarySearchTree.parent);

        System.out.println("\nSearch 7 in tree");
        BTNode node = binarySearchTree.search(binarySearchTree.parent, 7);
        System.out.println("Found 7? = " + (node!=null));

        System.out.println("Search 12 in tree");
        node = binarySearchTree.search(binarySearchTree.parent, 12);
        System.out.println("Found 12? = " + (node!=null));

        System.out.println("\nHeight of binary tree = " +
                binarySearchTree.height(binarySearchTree.parent));
    }
}
