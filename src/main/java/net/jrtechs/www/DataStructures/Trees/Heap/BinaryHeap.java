package net.jrtechs.www.DataStructures.Trees.Heap;


import net.jrtechs.www.DataStructures.Lists.ArrayList.ArrayBackedList;

/**
 * Basic implementation of a {@link IHeap}. By default, this is
 * a min heap, however, using the second constructor with
 * (BinaryHeap.MAX_HEAP) will create a max heap. To keep the
 * performance of using an array, while having a dynamically scalable
 * heap, {@link ArrayBackedList} was used since it.
 *
 * Operation complexities:
 *      insertion: O(logN)
 *      delete extrema: O(logN)
 *      get extrema: O(1)
 *
 * Basic Heap Operations:
 *      Parent index = (i-1)/2 or (i-2)/2
 *      Left Node = 2n + 1
 *      Right Node = 2n + 1
 *
 * @author Jeffery Russell 8-26-18
 */
public class BinaryHeap<E extends Comparable>
        implements IHeap<E>
{
    /** Used to define comparisons for a Max heap */
    public static final int MAX_HEAP = -1;

    /** Used to define comparisons for a Min heap */
    public static final int MIN_HEAP = 1;

    /** Where the heap is storing data */
    private ArrayBackedList<E> data;

    /** Ordering which heap is using defined by
     * MAX_HEAP, and  MIN_HEAP */
    private int ordering;


    /**
     * Creates a new min Binary Heap
     */
    public BinaryHeap()
    {
        this.data = new ArrayBackedList<>();
        this.ordering = MIN_HEAP;
    }


    /**
     * Creates a new binary heap with a specific ordering defined by
     * the MAX_HEAP, and MIN_HEAP constants
     *
     * @param ordering type of ordering to use
     */
    public BinaryHeap(int ordering)
    {
        this.ordering = ordering;
        this.data = new ArrayBackedList<>();
    }


    /**
     * Inserts a new element at the end of the array, and then shifts it
     * up to perserve the order of the heap.
     *
     * @param o element to insert
     */
    @Override
    public void insert(E o)
    {
        this.data.add(o);
        this.shiftUp(this.data.size() -1);
    }


    /**
     * Preserves structure of heap after a element has been
     * added to the end of the heap.
     *
     * @param nodeIndex index of node to recursively bring up
     */
    private void shiftUp(int nodeIndex)
    {
        if(nodeIndex != 0)
        {
            int parentIndex = (nodeIndex -1)/2;

            if(data.get(parentIndex).compareTo(data.get(nodeIndex)) == ordering)
            {
                data.swap(nodeIndex, parentIndex);

                shiftUp(parentIndex);
            }
        }
    }


    /**
     * Preserves the order of heap after the top element has been
     * removed.
     *
     * @param i index of element to recursively heapify
     */
    private void heapify(int i)
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int extrema = (left < data.size() &&
                data.get(left).compareTo(data.get(i)) != ordering)
                ? left : i;
        extrema = (right < data.size() &&
                data.get(right).compareTo(data.get(extrema)) != ordering)
                ? right: extrema;

        if(extrema != i)
        {
            this.data.swap(i, extrema);
            heapify(extrema);
        }
    }


    /**
     * Removes the top element of the heap.
     *
     * @return top element
     */
    @Override
    public E remove()
    {
        if(this.data.size() == 0)
            return null;

        E element = this.data.get(0);

        this.data.set(0, this.data.remove(this.data.size() -1));

        this.heapify(0);

        return element;
    }


    /**
     * Returns the min/max value of the heep
     *
     * @return extrema value
     */
    @Override
    public E peek()
    {
        if(data.size() == 0)
            return null;
        return data.get(0);
    }
}
