package net.jrtechs.www.Sorting;

import net.jrtechs.www.DataStructures.Lists.ArrayList.ArrayBackedList;


/**
 * Object used to sort lists
 *
 * @author Jeffery Russell 8-27-18
 * @param <E>
 */
public class MergeSort<E extends Comparable>
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
    public MergeSort(int sortType)
    {
        this.sortType= sortType;
    }


    /**
     * Divides and conquer approach to sorting an array
     *
     * @param list list to sort
     * @return sorted list
     */
    public ArrayBackedList<E> mergeSort(ArrayBackedList<E> list)
    {
        if(list.size() <= 1)
            return list;

        ArrayBackedList<E> left = new ArrayBackedList<>(list.size()/2);
        ArrayBackedList<E> right = new ArrayBackedList<>(list.size()/2);


        for(int i = 0; i < list.size()/2; i++)
        {
            left.add(list.get(i));
        }
        for(int i = list.size()/2; i< list.size(); i++)
        {
            right.add(list.get(i));
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeLists(left, right);
    }


    /**
     * Merges two ordered lists together in a way in which produces
     * another ordered list.
     *
     * @param left ordered list
     * @param right ordered list
     * @return ordered list
     */
    private SortableList<E> mergeLists(ArrayBackedList<E> left,
                               ArrayBackedList<E> right)
    {
        SortableList<E> result = new SortableList<>
                (left.size() + right.size());

        //Trick I did because the remove operation of the
        //arraybackedList is not O(N)
        int rightRemoved = 0, leftRemoved = 0;

        while(left.size() != leftRemoved && right.size() != rightRemoved)
        {
            if(left.get(leftRemoved).compareTo(right.get(rightRemoved))
                    != this.sortType)
                result.add(left.get(leftRemoved++));
            else
                result.add(right.get(rightRemoved++));
        }

        while(left.size() != leftRemoved)
            result.add(left.get(leftRemoved++));

        while(right.size() != rightRemoved)
            result.add(right.get(rightRemoved++));

        return result;
    }
}
