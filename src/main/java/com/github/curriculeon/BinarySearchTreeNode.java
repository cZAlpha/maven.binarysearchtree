package com.github.curriculeon;

public class BinarySearchTreeNode<Key extends Comparable<Key>, Value> {
    private Key key;
    private Value value;
    private BinarySearchTreeNode leftNode;
    private BinarySearchTreeNode rightNode;

    public BinarySearchTreeNode(Key key, Value value) {
        this.key   = key;
        this.value = value;
    }

    public Key getKey() {
        return this.key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public BinarySearchTreeNode<Key, Value> getLeft() {
        return this.leftNode;
    }

    public void setLeft(BinarySearchTreeNode<Key, Value> left) {
        this.leftNode = left;
    }

    public BinarySearchTreeNode<Key, Value> getRight() {
        return this.rightNode;
    }

    public void setRight(BinarySearchTreeNode<Key, Value> right) {
        this.rightNode = right;
    }

    @Override
    public String toString() {
        return "(" + getKey() + ", " + getValue() + ")";
    }
}

