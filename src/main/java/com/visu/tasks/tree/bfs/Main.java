package com.visu.tasks.tree.bfs;

import com.visu.tasks.tree.TestData;
import com.visu.tasks.tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    private static void testCase1() {
        TreeNode root = TestData.getTree1();

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.goRound(root);
        breadthFirstSearch.printPath();
    }

    private static void testCase2() {
        TreeNode root = TestData.getTree2();

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.goRound(root);
        breadthFirstSearch.printPath();
    }
}
