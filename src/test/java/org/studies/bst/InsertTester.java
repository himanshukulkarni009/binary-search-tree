package org.studies.bst;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.studies.bst.Tree.Node;

public class InsertTester {

    Tree<Integer> bst;

    @Before
    public void setup() {
        bst = new BinarySearchTree<>();
    }

    @Test
    public void testRootAddition() {
        bst.insert(1);

        Node<Integer> root = bst.getRoot();
        int val = root.getValue();

        Assert.assertEquals(1, val);
    }

    @Test
    public void testLeftChildInsertion() {
        bst.insert(2);
        bst.insert(1);

        Node<Integer> root = bst.getRoot();
        Node<Integer> left = root.getLeftNode();

        int value = left.getValue();
        Assert.assertEquals(1, value);
    }

    @Test
    public void testLeftChildInsertion_level2() {
        bst.insert(3);
        bst.insert(2);
        bst.insert(1);

        Node<Integer> root = bst.getRoot();
        Node<Integer> left_level1 = root.getLeftNode();
        Node<Integer> left_level2 = left_level1.getLeftNode();

        int value = left_level2.getValue();
        Assert.assertEquals(1, value);
    }

    @Test
    public void testLeftRightChildInsertion_level2() {
        bst.insert(4);
        bst.insert(2);
        bst.insert(3);

        Node<Integer> root = bst.getRoot();
        Node<Integer> left_level1 = root.getLeftNode();
        Node<Integer> right_level2 = left_level1.getRightNode();

        int value = right_level2.getValue();
        Assert.assertEquals(3, value);
    }

    @Test
    public void testRightChildInsertion() {
        bst.insert(2);
        bst.insert(3);

        Node<Integer> root = bst.getRoot();
        Node<Integer> rightChild = root.getRightNode();

        int value = rightChild.getValue();
        Assert.assertEquals(3, value);
    }
}
