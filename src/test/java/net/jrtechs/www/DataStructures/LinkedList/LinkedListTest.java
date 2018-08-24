package net.jrtechs.www.DataStructures.LinkedList;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Jeffery Russell 8-24-18
 */
public class LinkedListTest
{
    /**
     * Makes sure that instantiations work
     */
    @Test
    public void testCreation()
    {
        assertNotNull(new LinkedList<Double>());

        assertNotNull(new LinkedList<Double>(12.2));
    }


    /**
     * Test Size of linked list
     */
    @Test
    public void testSize()
    {
        LinkedList<Double> list = new LinkedList<>();
        list.add(12.0);
        assertTrue(list.size() == 1);
        list.add(13.0);
        assertTrue(list.size() == 2);
    }


    /**
     * Testing addition of data elements
     */
    @Test
    public void testAddition()
    {
        LinkedList<Double> list = new LinkedList<>();
        list.add(12.0);
        list.add(13.0);
        list.add(44.9);

        assertTrue(list.contains(44.9));
        assertTrue(list.contains(12.0));
        assertTrue(list.contains(13.0));

        assertTrue(list.size() == 3);


        LinkedList<Double> list2 = new LinkedList<>(16.0);
        list2.add(18.0);

        assertTrue(list2.contains(16.0));
        assertTrue(list2.contains(18.0));
        assertTrue(list2.size() == 2);
    }


    /**
     * Testing addition of data elements
     */
    @Test
    public void testDeletion()
    {
        LinkedList<Double> list = new LinkedList<>();
        list.add(12.0);
        list.add(13.0);
        list.add(44.9);

        assertTrue(list.contains(44.9));
        assertTrue(list.contains(12.0));
        assertTrue(list.contains(13.0));

        assertTrue(list.size() == 3);


        list.remove(0);
        list.remove(1);


        assertFalse(list.contains(12.0));
        assertFalse(list.contains(44.9));
        assertTrue(list.contains(13.0));
    }


}
