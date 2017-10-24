package com.visu.tasks.tree.dfs;

import com.visu.tasks.tree.TreeNode;
import com.visu.tasks.tree.TreeSearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DepthFirstSearch implements TreeSearch {

    private List<Integer> nodes = new ArrayList<>();

    public void goRound(TreeNode node) {
        if (node == null) {
            return;
        }

        nodes.add(node.getVal());

        goRound(node.getLeft());
        goRound(node.getRight());
    }

    public void printPath() {
        for (Integer nodeValue : nodes) {
            System.out.print(nodeValue);
            System.out.print(" ");
        }
        System.out.println();
    }
}
