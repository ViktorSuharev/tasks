package com.visu.tasks.tree.dfs;

import com.visu.tasks.tree.TestData;
import com.visu.tasks.tree.TreeNode;
import org.junit.Test;

public class Tester {

    @Test
    public void testCase1() {
        TreeNode root = TestData.getTree1();

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.goRound(root);
        depthFirstSearch.printPath();
    }

    @Test
    public void testCase2() {
        TreeNode root = TestData.getTree2();

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.goRound(root);
        depthFirstSearch.printPath();
    }
}
