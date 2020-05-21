package main.java.ds.binarytree;

import main.java.ds.binarytree.impl.BTNode;

public interface IBinaryTreeTraversals {

    void dfsPreorder(BTNode parent);
    void dfsInorder(BTNode parent);
    void dfsPostOrder(BTNode parent);
    void bfsTraversal(BTNode parent);

}
