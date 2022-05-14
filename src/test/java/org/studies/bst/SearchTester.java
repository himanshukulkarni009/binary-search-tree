package org.studies.bst;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchTester {

    Tree<Integer> bst;

    @Before
    public void setup() {
        bst = new BinarySearchTree<>();
    }


    @Test
    public void testSearch() {
        bst.insert(5);
        bst.insert(4);
        bst.insert(3);
        bst.insert(6);
        bst.insert(2);
        bst.insert(7);


        Assert.assertFalse(bst.contains(0));
        Assert.assertTrue(bst.contains(5));
        Assert.assertTrue(bst.contains(4));
        Assert.assertTrue(bst.contains(3));
        Assert.assertTrue(bst.contains(6));
        Assert.assertTrue(bst.contains(2));
        Assert.assertTrue(bst.contains(7));

    }
}
