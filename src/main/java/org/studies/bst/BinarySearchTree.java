package org.studies.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {


    private Node<T> root;

    @Override
    public void insert(T value) {
        Node<T> node = new Node<>(value);
        if (root == null) {
            root = node;
            return;
        }

        Node<T> currentNode = root;

        while (true) {
            int compareTo = currentNode.getValue().compareTo(value);

            if (compareTo > 0) {
                if (currentNode.getLeftNode() == null) {
                    currentNode.setLeft(new Node<>(value));
                    return;
                }
                currentNode = currentNode.getLeftNode();
            } else if (compareTo < 0) {
                if (currentNode.getRightNode() == null) {
                    currentNode.setRight(new Node<>(value));
                    return;
                }
                currentNode = currentNode.getRightNode();
            }
        }
    }

    @Override
    public boolean contains(T value) {
        Node<T> currentNode = this.root;

        while (true) {
            if (currentNode.getValue().equals(value))
                return true;

            int compareTo = currentNode.getValue().compareTo(value);
            if (compareTo > 0) {
                currentNode = currentNode.getLeftNode();
                if (currentNode == null)
                    return false;
            } else if (compareTo < 0) {
                currentNode = currentNode.getRightNode();
                if (currentNode == null)
                    return false;
            }
        }
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }


}
