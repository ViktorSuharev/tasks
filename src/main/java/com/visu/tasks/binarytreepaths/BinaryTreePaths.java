package com.visu.tasks.binarytreepaths;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    List<String> paths = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return paths;
        }
        String path = String.valueOf(root.val);

        if (root.left == null && root.right == null) {
            paths.add(path);
        }

        binaryTreePaths(root.left, path);
        binaryTreePaths(root.right, path);

        System.out.println(paths);
        return paths;
    }

    private void binaryTreePaths(TreeNode node, String path) {
        if (node == null) {
            return;
        }

        path = path + "->" + node.val;

        if (node.left == null && node.right == null) {
            paths.add(path);
        }

        binaryTreePaths(node.left, path);
        binaryTreePaths(node.right, path);
    }
}
