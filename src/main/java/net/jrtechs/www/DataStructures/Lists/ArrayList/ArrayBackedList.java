package net.jrtechs.www.DataStructures.Lists.ArrayList;

import net.jrtechs.www.DataStructures.Lists.IList;


/**
 * Implementation of {@link IList}. This implementation of an
 * array list stores data in an array and resizes when necessary
 * to fit more data. This dsta structure is intended to
 * be used for O(1) access on indexes. Although insertions and
 * deletions worst case is O(n),however, the average is closer to O(1)
 * since array re-sizes don't commonly occur.
 *
 * @param <E> generic stored in data structure
 *
 * @author Jeffery Russell 8-26-18
 */
public class ArrayBackedList<E> implements IList<E>
{
    /** Default size to increase size of array by */
    private int arraySegmentSize = 20;

    /** How many elements are currently in list */
    private int currentSize = 0;

    /** Array to store data elements in --
     * is an array of Objects since you can't
     * create a list of generics*/
    private Object[] dataList;


    /**
     * Creates an empty list
     */
    public ArrayBackedList()
    {
        this.dataList = new Object[this.arraySegmentSize];
    }


    /**
     * Specifies the size at which the array will be resized to
     *
     * @param size default size of array chunk
     */
    public ArrayBackedList(int size)
    {
        this.arraySegmentSize = size;
        this.dataList = new Object[size];
    }


    /**
     * Adds an element to the end of the list
     *
     * @param o element to get added
     * @return whether element was added
     */
    @Override
    public boolean add(E o)
    {
        makeArrayLarger();
        this.dataList[currentSize] = o;
        this.currentSize++;
        return true;
    }


    /**
     * Makes the array used to store the elements larger if it is necessary
     * for storing more data in the array.
     */
    private void makeArrayLarger()
    {
        if(this.currentSize + 1 > dataList.length)
        {
            Object[] data = new Object[dataList.length + arraySegmentSize];

            for(int i = 0; i < this.dataList.length; i++)
                data[i] = this.dataList[i];
            this.dataList = data;
        }
    }


    /**
     * Determines if the list contains a certain element.
     *
     * @param o element to see if exists
     * @return whether element is in list
     */
    @Override
    public boolean contains(E o)
    {
        for(int i = 0; i < currentSize; i++)
            if(dataList[i].equals(o))
                return true;
        return false;
    }


    /**
     * Returns the size of the list
     *
     * @return
     */
    @Override
    public int size()
    {
        return this.currentSize;
    }


    /**
     * Removes the element at a certain index.
     *
     * @Warning this can go out of bounds
     *
     * @param index of element to remove
     * @return element removed
     */
    @Override
    public E remove(int index)
    {
        Object old = this.dataList[index];

        for(int i = index; i < this.currentSize -1; i++)
        {
            this.dataList[i] = this.dataList[i + 1];
        }
        this.currentSize--;
        return (E)old;
    }


    /**
     * Removes an element from an array if it exists. If it does
     * not exist in the array, null is returned.
     *
     * @param o element to remove
     * @return element removed
     */
    @Override
    public E remove(E o)
    {
        for(int i = 0; i < this.currentSize; i++)
        {
            if(this.dataList[i].equals(o))
            {
                return remove(i);
            }
        }
        return null;
    }


    /**
     * Returns the element at a desired index in O(1) time.
     *
     * @Warning This can go out of bounds with bad input
     *
     * @param index of desired element
     * @return element of a specific index
     */
    @Override
    public E get(int index)
    {
        return (E)this.dataList[index];
    }


    /**
     * Sets an element in the array list
     *
     * @Warning This can go out of bounds with bad input
     *
     * @param index of desired element
     * @return element of a specific index
     */
    public void set(int index, E o)
    {
        this.dataList[index] = o;
    }


    /**
     * Swaps two elements in the list by their index
     *
     * @param index1 index of first element
     * @param index2 index of second element
     */
    public void swap(int index1, int index2)
    {
        Object temp = this.dataList[index1];
        this.dataList[index1] = dataList[index2];
        this.dataList[index2] = temp;
    }


    /**
     * Creates a string representation of the list.
     *
     * @return string corresponding to the list
     */
    public String toString()
    {
        String s = "";
        for(int i = 0; i < this.currentSize; i++)
        {
            s+= this.dataList[i] + ", ";
        }
        return s;
    }
}
