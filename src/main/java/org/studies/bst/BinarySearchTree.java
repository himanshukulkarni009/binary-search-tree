package org.studies.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {


    private Node<T> root;

    @Override
    public void insert(T value) {
        Node<T> node = new Node<>(value);
        if (root == null)
            root = node;

        int compareTo = root.getValue().compareTo(value);
        if (compareTo > 0) {

            insertToLeft(value, root);
        }
    }

    private void insertToLeft(T value, Node<T> node) {
        node.setLeft(new Node<>(value));
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }


}
