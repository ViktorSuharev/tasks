package com.visu.tasks.tree.bfs;

import com.visu.tasks.tree.TreeNode;
import com.visu.tasks.tree.TreeSearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch implements TreeSearch {

    private List<Integer> nodes = new ArrayList<>();

    public void goRound(TreeNode node) {
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();

        while (node != null) {
            if (node == null) {
                return;
            }

            nodes.add(node.getVal());

            if (node.getLeft() != null) {
                nodeQueue.add(node.getLeft());
            }

            if (node.getRight() != null) {
                nodeQueue.add(node.getRight());
            }
            node = nodeQueue.poll();
        }
    }

    public void printPath() {
        for (Integer nodeValue : nodes) {
            System.out.print(nodeValue);
            System.out.print(" ");
        }
        System.out.println();
    }
}
