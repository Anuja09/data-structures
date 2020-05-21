package main.java.ds.binarytree;

import main.java.ds.binarytree.impl.BTNode;

public interface IBinarySearchTree {
    BTNode insertKey(BTNode parent, int data);
    BTNode search(BTNode parent, int key);
    void delete(BTNode parent, int key);
    int height(BTNode parent);
}
