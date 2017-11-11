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
        Node superParent = parent.getParent();
        if (parent.equals(superParent.getLeft())) {
            superParent.setLeft(child);
            chooseChildAndSwap(parent, child);
        } else {
            superParent.setRight(child);
            chooseChildAndSwap(parent, child);
        }
        child.setParent(superParent);
        parent.setParent(child);
    }

    private void chooseChildAndSwap(Node parent, Node child) {
        if (child.equals(parent.getLeft())) {
            child.setLeft(parent);
        } else {
            child.setRight(parent);
        }
    }
}
