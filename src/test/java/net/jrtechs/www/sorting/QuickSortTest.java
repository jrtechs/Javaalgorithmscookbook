package net.jrtechs.www.sorting;

import net.jrtechs.www.DataStructures.Lists.ArrayList.ArrayBackedList;
import net.jrtechs.www.Sorting.MergeSort;
import net.jrtechs.www.Sorting.QuickSort;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class QuickSortTest
{
    @Test
    public void testInitalization()
    {
        QuickSort<Double> sorter = new QuickSort<>(MergeSort.DECREASING_ORDER);

        assertNotNull(sorter);
    }


    @Test
    public void testInsertionSortAscending()
    {
        QuickSort<Double> sorter = new QuickSort<>(QuickSort.INCREASING_ORDER);
        ArrayBackedList<Double> list = new ArrayBackedList<>();
        list.add(1.0);
        list.add(0.0);
        list.add(3.0);
        list.add(-12.0);
        sorter.quickSort(list);

        assertTrue(list.get(0) == -12.0);
        assertTrue(list.get(list.size() -1) == 3);
    }

    @Test
    public void testInsertionSortDescending()
    {
        QuickSort<Double> sorter = new QuickSort<>(QuickSort.DECREASING_ORDER);
        ArrayBackedList<Double> list = new ArrayBackedList<>();
        list.add(1.2);
        list.add(1.0);
        list.add(0.0);
        list.add(3.0);
        list.add(-12.0);
        sorter.quickSort(list);
        assertTrue(list.get(0) == 3.0);
        assertTrue(list.get(list.size() -1) == -12);
    }
}
