package net.jrtechs.www.Sorting;

import net.jrtechs.www.DataStructures.Lists.ArrayList.ArrayBackedList;


/**
 * Created an array list which is able to sort
 * itself upon request.
 *
 * @param <E>
 * @author Jeffery Russell
 */
public class SortableList<E extends Comparable> extends ArrayBackedList<E>
{
    /** Constant for an increasing list */
    public final int INCREASING_ORDER = 1;

    /** Constant for a decreasing list */
    public final int DECREASING_ORDER = -1;


    /**
     * Creates a new list of default size
     */
    public SortableList()
    {
        super();
    }


    /**
     * Creates a new list of non-default size
     */
    public SortableList(int size)
    {
        super(size);
    }


    /**
     * Sorts the list using insertion sort.
     *
     * @param sortOrder constant corresponding to sort type
     */
    public void insertionSort(int sortOrder)
    {
        for(int i = 1; i < this.size(); i++)
        {
            int reverseIndex = i;
            while(reverseIndex > 0 && this.get(reverseIndex-1)
                    .compareTo(this.get(reverseIndex)) == sortOrder)
            {
                this.swap(reverseIndex, reverseIndex-1);
                reverseIndex--;
            }
        }
    }
}
