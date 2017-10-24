package com.visu.tasks.tree.binarytreepaths;

public class Main {
    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    private static void testCase1() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;

        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        binaryTreePaths.binaryTreePaths(root);
    }

    private static void testCase2() {
        TreeNode root = new TreeNode(1);

        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        binaryTreePaths.binaryTreePaths(root);
    }
}
