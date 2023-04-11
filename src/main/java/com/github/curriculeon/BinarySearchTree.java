package com.github.curriculeon;

import java.util.NoSuchElementException;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private BinarySearchTreeNode<Key, Value> root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    public  BinarySearchTree(BinarySearchTreeNode root) {
        this.root = root;
        size      = 1;
    }

    private Value get(BinarySearchTreeNode<Key, Value> x, Key key) {
        return null; // TODO
    }

    private BinarySearchTreeNode<Key, Value> put(BinarySearchTreeNode<Key, Value> x, Key key, Value value) {
        return null; // TODO
    }

    private BinarySearchTreeNode<Key, Value> min(BinarySearchTreeNode<Key, Value> x) {
        return null; // TODO
    }

    private BinarySearchTreeNode<Key, Value> max(BinarySearchTreeNode<Key, Value> x) {
        return null; // TODO
    }

    private BinarySearchTreeNode<Key, Value> deleteMin(BinarySearchTreeNode<Key, Value> x) {
        return null; // TODO
    }

    private BinarySearchTreeNode<Key, Value> deleteMax(BinarySearchTreeNode<Key, Value> x) {
        return null; // TODO
    }

    private BinarySearchTreeNode<Key, Value> delete(BinarySearchTreeNode<Key, Value> x, Key key) {
        return null; // TODO
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public BinarySearchTreeNode<Key, Value> getRoot() {
        return root;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    public Key min() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        return min(root).getKey();
    }

    public Key max() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        return max(root).getKey();
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        root = deleteMin(root);
        size--;
    }

    public void deleteMax() {
        if (isEmpty()) {
            throw new NoSuchElementException("Symbol table is empty");
        }
        root = deleteMax(root);
        size--;
    }

    public void delete(Key key) {
        root = delete(root, key);
    }
}
