package main.java.ds.binarytree.impl;

import main.java.ds.binarytree.IBinarySearchTree;

public class BinarySearchTree implements IBinarySearchTree {

    BTNode parent;

    public BinarySearchTree(BTNode node) {
        this.parent = node;
        System.out.println("Binary Search Tree created");
    }

    public BinarySearchTree() {
        this.parent = null;
    }

    @Override
    public BTNode insertKey(BTNode parent, int key) {
        if(parent == null) {
            parent = new BTNode(key);
            return parent;
        }
        if(key < parent.data) {
            parent.left = insertKey(parent.left, key);
        } else if(key > parent.data) {
            parent.right = insertKey(parent.right, key);
        }
        return parent;
    }

    @Override
    public BTNode search(BTNode parent, int key) {
        if(parent == null || parent.data == key) {
            return parent;
        }
        if(parent.data > key)  {
            return search(parent.left, key);
        } else   {
            return search(parent.right, key);
        }
    }

    @Override
    public void delete(BTNode parent, int key) {
        //TODO
    }

    @Override
    public int height(BTNode parent) {
        if(parent==null) {
            return -1;
        }
        return max(height(parent.left), height(parent.right)) + 1;
    }

    private int max(int leftCnt, int rightCnt) {
        return leftCnt > rightCnt ? leftCnt : rightCnt;
    }
}
