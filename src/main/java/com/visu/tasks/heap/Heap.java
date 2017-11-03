package com.visu.tasks.heap;

public interface Heap {
    void insert(Node node);
    Node peak();
    void delete(int key);
}
