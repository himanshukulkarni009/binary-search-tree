package org.studies.bst;

public interface Tree<T extends Comparable<T>> {

    default String printTree() {
        return "";
    }

    void insert(T value);

    Node<T> getRoot();


    class Node<T extends Comparable<T>> {
        private final T value;
        private Node<T> right;
        private Node<T> left;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getLeftNode() {
            return left;
        }

        public void setLeft(Node<T> node) {
            this.left = node;
        }

        public Node<T> getRightNode() {
            return right;
        }

        public void setRight(Node<T> node) {
            this.right = node;
        }
    }

}
