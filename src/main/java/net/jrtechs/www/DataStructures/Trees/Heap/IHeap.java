package net.jrtechs.www.DataStructures.Trees.Heap;


/**
 * Definition for behavior of heaps
 *
 * @author Jeffery Russell 8-26-18
 */
public interface IHeap<E extends Comparable>
{
    /**
     * Add element to heap.
     *
     * @param o
     */
    public void insert(E o);


    /**
     * Remove top element from heap
     *
     * @return top element
     */
    public E remove();


    /**
     * Fetches top element
     *
     * @return top element
     */
    public E peek();
}
