package com.visu.tasks.tree.bfs;

import com.visu.tasks.tree.TestData;
import com.visu.tasks.tree.TreeNode;
import org.junit.Test;

public class Tester {

    @Test
    private void testCase1() {
        TreeNode root = TestData.getTree1();

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.goRound(root);
        breadthFirstSearch.printPath();
    }

    @Test
    private void testCase2() {
        TreeNode root = TestData.getTree2();

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.goRound(root);
        breadthFirstSearch.printPath();
    }
}
