package net.jrtechs.www.Sorting;

import net.jrtechs.www.DataStructures.Lists.ArrayList.ArrayBackedList;

import java.util.Random;


/**
 * Basic implementation of quick sort in java.
 *
 * @author Jeffery Russell
 * @param <E>
 */
public class QuickSort<E extends Comparable>
{
    /** Constant for an increasing list */
    public static final int INCREASING_ORDER = 1;

    /** Constant for a decreasing list */
    public static final int DECREASING_ORDER = -1;

    /** Type of ordering*/
    private int sortType;


    /**
     * Creates a new sorter with a specific ordering
     *
     * @param sortType sorting constant
     */
    public QuickSort(int sortType)
    {
        this.sortType= sortType;
    }


    /**
     * Wrapper function for initial call.
     *
     * @param list
     */
    public void quickSort(ArrayBackedList<E> list)
    {
        quickSort(list, 0, list.size() -1);
    }


    /**
     * Quick sorts the array.
     *
     * @param list array to sort
     * @param left left index
     * @param right right index
     */
    public void quickSort(ArrayBackedList<E> list, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(list, left, right);
            quickSort(list, left, pivot -1);
            quickSort(list, pivot + 1, right);
        }
    }


    /**
     * Selects a random pivot and swaps everything less than the pivot value
     * to the left and everything greater than the pivot to the right.
     *
     * @param list array list to sort
     * @param left left index
     * @param right right index
     * @return index of the sorted part
     */
    private int partition(ArrayBackedList<E> list, int left, int right)
    {
        Random random = new Random();
        int p = random.nextInt((right - left) + 1) + left; //select pivot

        list.swap(p, right);

        int store = left;

        for(int i = left; i < right; i++)
        {
            if(list.get(i).compareTo(list.get(right)) != this.sortType)
            {
                list.swap(i, store);
                store++;
            }
        }
        list.swap(store, right);
        return store;
    }
}
