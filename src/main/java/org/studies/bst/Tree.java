package org.studies.bst;

public interface Tree<T extends Comparable<?>> {

    default String printTree() {
        return "";
    }
    void insert(T value);

    Node<T> getRoot();


    public static class Node<T> {
        private T value;
        private Node<T> right;
        private Node<T> left;
        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

}
