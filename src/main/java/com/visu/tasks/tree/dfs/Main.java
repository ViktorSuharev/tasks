package com.visu.tasks.tree.dfs;

import com.visu.tasks.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    /*
               0
              /\
             1  2
            /\  /\
           3 4 5  6
          /
         7
        /
       8
     */
    private static void testCase1() {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node2.setLeft(node5);
        node2.setRight(node6);
        node3.setLeft(node7);
        node7.setLeft(node8);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.goRound(root);
        depthFirstSearch.printPath();
    }

    private static void testCase2() {
        TreeNode root = new TreeNode(1);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.goRound(root);
        depthFirstSearch.printPath();
    }
}
