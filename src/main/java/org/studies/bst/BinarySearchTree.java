package org.studies.bst;

public class BinarySearchTree<T extends Comparable<?>> implements Tree<T> {


    private Node<T> root;

    @Override
    public void insert(T value) {
        Node<T> node = new Node(value);
        if(root == null)
            root = node;
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }


}
