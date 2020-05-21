package main.java.ds.binarytree.impl;

import main.java.ds.binarytree.IBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree implements IBinaryTree {
    BTNode parent;

    public BinaryTree(BTNode node) {
        this.parent = node;
        System.out.println("Binary Tree created");
    }

    public BinaryTree() {
        this.parent = null;
    }


    @Override
    public void add(int data) {
        BTNode newNode = new BTNode(data);
        if (parent == null) {
            parent = newNode;
            return;
        }

        Queue<BTNode> queue = new LinkedList<>();
        queue.add(parent);
        while (!queue.isEmpty()) {
            BTNode temp = queue.poll();

            if (temp.left == null) {
                temp.left = newNode;
                System.out.println(data + " added to left of " + temp.data);
                break;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                System.out.println(data + " added to right of " + temp.data);
                break;
            } else {
                queue.add(temp.right);
            }
        }

    }

    @Override
    public boolean search(int data) {
        if (parent == null) {
            System.out.println("Tree is empty.");
            return false;
        }
        BTNode node = parent;
        return search(node, data);
    }

    private boolean search(BTNode node, int data) {
        if (node == null) {
            return false;
        }

        if (node.data == data) {
            return true;
        }

        if (search(node.left, data)) {
            return true;
        }

        return search(node.right, data);
    }

    /**
     * Note - This is for printing middle level of perfect binary tree
     */
    @Override
    public void printMiddle(BTNode parent) {
        if (parent == null) {
            System.out.println("Tree is empty.");
            return;
        }
        BTNode node = parent;
        printMiddle(node, node);
    }

    private void printMiddle(BTNode a, BTNode b) {
        if (a == null || b == null) {
            return;
        }
        if ((b.left == null && b.right == null) || (b.left.left == null)) {
            System.out.print(a.data + " ");
            return;
        }
        printMiddle(a.left, b.left.left);
        printMiddle(a.right, b.right.left);
    }

    @Override
    public int height(BTNode parent) {
        if (parent == null) {
            return -1;
        }
        return max(height(parent.left), height(parent.right)) + 1;
    }

    private int max(int leftCnt, int rightCnt) {
        return leftCnt > rightCnt ? leftCnt : rightCnt;
    }
}
