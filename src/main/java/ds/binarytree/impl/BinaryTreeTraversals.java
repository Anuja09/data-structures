package main.java.ds.binarytree.impl;

import main.java.ds.binarytree.IBinaryTreeTraversals;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversals implements IBinaryTreeTraversals {
    @Override
    public void dfsPreorder(BTNode parent) {
        if(parent != null) {
            System.out.print(parent.data + " ");
            dfsPreorder(parent.left);
            dfsPreorder(parent.right);
        }
    }

    @Override
    public void dfsInorder(BTNode parent) {
        if(parent != null) {
            dfsInorder(parent.left);
            System.out.print(parent.data + " ");
            dfsInorder(parent.right);
        }
    }

    @Override
    public void dfsPostOrder(BTNode parent) {
        if(parent != null) {
            dfsPreorder(parent.left);
            dfsPreorder(parent.right);
            System.out.print(parent.data + " ");
        }
    }

    @Override
    public void bfsTraversal(BTNode parent) {
        if (parent == null) {
            return;
        }

        Queue<BTNode> queue = new LinkedList<>();
        queue.add(parent);
        System.out.println("BTree : ");
        while (!queue.isEmpty()) {
            BTNode temp = queue.poll();

            System.out.print(" " + temp.data);
            if (temp.left == null) {

            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {

            } else {
                queue.add(temp.right);
            }
        }
    }
}
