package net.jrtechs.www.sorting;


import net.jrtechs.www.Sorting.SortableList;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Class for testing insertion sort
 *
 * @author Jeffery Russell 8-27-18
 */
public class InsertionSortTest
{
    @Test
    public void testInitalization()
    {
        SortableList<Double> list = new SortableList<>();

        assertNotNull(list);
    }


    @Test
    public void testInsertionSortAscending()
    {
        SortableList<Double> list = new SortableList<>();
        list.add(1.0);
        list.add(0.0);
        list.add(3.0);
        list.add(-12.0);
        list.insertionSort(list.INCREASING_ORDER);
        assertTrue(list.get(0) == -12.0);
        assertTrue(list.get(list.size() -1) == 3);
    }

    @Test
    public void testInsertionSortDescending()
    {
        SortableList<Double> list = new SortableList<>();
        list.add(1.2);
        list.add(1.0);
        list.add(0.0);
        list.add(3.0);
        list.add(-12.0);
        list.insertionSort(list.DECREASING_ORDER);
        assertTrue(list.get(0) == 3.0);
        assertTrue(list.get(list.size() -1) == -12);
    }
}
