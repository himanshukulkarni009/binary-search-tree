package org.studies.bst;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.studies.bst.Tree.Node;

public class Tester {

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
    public void testChildAddition() {
        bst.insert(2);
        bst.insert(1);

        Node<Integer> root = bst.getRoot();
        Node<Integer> left = root.getLeftNode();

        int value = left.getValue();
        Assert.assertEquals(1, value);
    }

}
