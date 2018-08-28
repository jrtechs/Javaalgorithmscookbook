package net.jrtechs.www.sorting;

import net.jrtechs.www.DataStructures.Lists.ArrayList.ArrayBackedList;
import net.jrtechs.www.Sorting.MergeSort;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class MergeSortTest
{
    @Test
    public void testInitalization()
    {
        MergeSort<Double> sorter = new MergeSort<>(MergeSort.DECREASING_ORDER);

        assertNotNull(sorter);
    }


    @Test
    public void testInsertionSortAscending()
    {
        MergeSort<Double> sorter = new MergeSort<>(MergeSort.INCREASING_ORDER);
        ArrayBackedList<Double> list = new ArrayBackedList<>();
        list.add(1.0);
        list.add(0.0);
        list.add(3.0);
        list.add(-12.0);
        list = sorter.mergeSort(list);

        assertTrue(list.get(0) == -12.0);
        assertTrue(list.get(list.size() -1) == 3);
    }

    @Test
    public void testInsertionSortDescending()
    {
        MergeSort<Double> sorter = new MergeSort<>(MergeSort.DECREASING_ORDER);
        ArrayBackedList<Double> list = new ArrayBackedList<>();
        list.add(1.2);
        list.add(1.0);
        list.add(0.0);
        list.add(3.0);
        list.add(-12.0);
        list = sorter.mergeSort(list);
        assertTrue(list.get(0) == 3.0);
        assertTrue(list.get(list.size() -1) == -12);
    }
}
