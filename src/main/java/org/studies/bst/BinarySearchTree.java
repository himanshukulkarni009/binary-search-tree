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
                if(currentNode.getLeftNode() == null) {
                    currentNode.setLeft(new Node<>(value));
                    return;
                }
                currentNode = currentNode.getLeftNode();
            } else if (compareTo < 0) {
                if(currentNode.getRightNode() == null) {
                    currentNode.setRight(new Node<>(value));
                    return;
                }
                currentNode = currentNode.getRightNode();
            }
        }
    }



    @Override
    public Node<T> getRoot() {
        return root;
    }


}
