package net.jrtechs.www.DataStructures;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import net.jrtechs.www.DataStructures.LinkedList.LinkedList;
import org.junit.Test;



public class NodeTest
{

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCreation()
    {
        assertNotNull(new Node<Double>(12.0));

        assertNotNull(new Node<Double>(12.2, new Node<Double>(13.0)));
    }

    @Test
    public void testSetNext()
    {
        Node<Double> node = new Node<>(13.0);

        Node<Double> node2 = new Node<>(14.5);

        node.setNext(node2);

        assertTrue(node.getNext().getData().equals(14.5));
    }

}
