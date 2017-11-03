package com.visu.tasks.heap;

public class BinaryTreeHeap implements Heap {
    private Node root;
    private Node last;

    public Node getRoot() {
        return root;
    }

    private void rebuild(Node curNode) {
        if (curNode.getKey() > curNode.getParent().getKey()) {
            swap(curNode, curNode.getParent());
            rebuild(curNode);
        }
    }

    public void insert(Node node) {
        if (last.getLeft() == null) {
            last.setLeft(node);
        } else {
            last.setRight(node);
            last = node;
        }
        rebuild(node);
    }

    public Node peak() {
        return null;
    }

    public void delete(int key) {

    }

    private void swap(Node parent, Node child) {


        Node tmpNode = parent;
        child = parent;
        parent = tmpNode;
    }
}
