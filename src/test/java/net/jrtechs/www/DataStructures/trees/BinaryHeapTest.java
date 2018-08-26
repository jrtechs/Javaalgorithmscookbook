package net.jrtechs.www.DataStructures.trees;


import net.jrtechs.www.DataStructures.Trees.Heap.BinaryHeap;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for binary heap
 *
 * @author Jeffery Russell 8-26-18
 */
public class BinaryHeapTest
{

    @Test
    public void testCreation()
    {
        BinaryHeap<Double> heap = new BinaryHeap<>();
        assertNotNull(heap);
    }

    @Test
    public void testInsertion()
    {
        BinaryHeap<Double> heap = new BinaryHeap<>();
        heap.insert(12.9);

        heap.insert(12.8);

        assertTrue(heap.peek() == 12.8);
    }

    @Test
    public void testRemoval()
    {
        BinaryHeap<Double> heap = new BinaryHeap<>();
        heap.insert(1.5);
        heap.insert(-9.8);
        heap.insert(999.0);

        heap.remove();
        heap.remove();
        heap.remove();

        assertNull(heap.remove());
    }

    @Test
    public void testMinOrdering()
    {
        BinaryHeap<Double> heap = new BinaryHeap<>(BinaryHeap.MIN_HEAP);
        heap.insert(2.0);  //
        heap.insert(-4.0); //
        heap.insert(69.0);
        heap.insert(-99.0); //
        heap.insert(1.0); //
        heap.insert(3.0); //
        heap.insert(99.0);


        assertTrue(heap.remove() == -99.0);
        assertTrue(heap.remove() == -4.0);
        assertTrue(heap.remove() == 1.0);
        assertTrue(heap.remove() == 2.0);
        assertTrue(heap.remove() == 3.0);
        assertTrue(heap.remove() == 69.0);
        assertTrue(heap.remove() == 99.0);
    }


    @Test
    public void testMaxOrdering()
    {
        BinaryHeap<Double> heap = new BinaryHeap<>(BinaryHeap.MAX_HEAP);
        heap.insert(1.0);
        heap.insert(3.0);
        heap.insert(2.0);
        heap.insert(-4.0);
        heap.insert(99.0);
        assertTrue(heap.remove() == 99.0);
        assertTrue(heap.remove() == 3.0);
        assertTrue(heap.remove() == 2.0);
        assertTrue(heap.remove() == 1.0);
        assertTrue(heap.remove() == -4.0);
        assertNull(heap.remove());
    }
}
