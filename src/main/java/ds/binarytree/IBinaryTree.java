package main.java.ds.binarytree;

import main.java.ds.binarytree.impl.BTNode;

public interface IBinaryTree {

    void add(int data);
    boolean search(int data);
    void printMiddle(BTNode node);
    int height(BTNode node);
}
