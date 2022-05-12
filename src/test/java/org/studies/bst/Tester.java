package org.studies.bst;

import org.junit.Assert;
import org.junit.Test;

public class Tester {


    @Test
    public void test() {
        Tree<Integer> bst = new BinarySearchTree<>();
        bst.insert(1);

        Tree.Node<Integer> root = bst.getRoot();

        int val = root.getValue();
        Assert.assertEquals(1, val);
    }

}
