package net.jrtechs.www.DataStructures.Lists;

import net.jrtechs.www.DataStructures.Lists.ArrayList.ArrayBackedList;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for {@link ArrayBackedList}
 *
 * @author Jeffery Russell 8-26-18
 */
public class ArrayListTest
{
    /**
     * Makes sure that instantiations work
     */
    @Test
    public void testCreation()
    {
        assertNotNull(new ArrayBackedList<>());

        assertNotNull(new ArrayBackedList<Double>(12));
    }


    /**
     * Test Size of list
     */
    @Test
    public void testSize()
    {
        ArrayBackedList<Double> list = new ArrayBackedList<>();
        list.add(12.0);
        assertTrue(list.size() == 1);
        list.add(13.0);
        assertTrue(list.size() == 2);
    }


    /**
     * Testing addition of data elements
     */
    @Test
    public void testAddition()
    {
        ArrayBackedList<Double> list = new ArrayBackedList<>();
        list.add(12.0);
        list.add(13.0);
        list.add(44.9);

        assertTrue(list.contains(44.9));
        assertTrue(list.contains(12.0));
        assertTrue(list.contains(13.0));

        assertTrue(list.size() == 3);


        ArrayBackedList<Double> list2 = new ArrayBackedList<>(20);
        list2.add(18.0);

        assertTrue(list2.contains(18.0));
        assertTrue(list2.size() == 1);
    }


    /**
     * Testing deletion of data elements
     */
    @Test
    public void testDeletionByIndex()
    {
        ArrayBackedList<Double> list = new ArrayBackedList<>();
        list.add(12.0);
        list.add(13.0);
        list.add(44.9);

        assertTrue(list.contains(44.9));
        assertTrue(list.contains(12.0));
        assertTrue(list.contains(13.0));

        assertTrue(list.size() == 3);


        list.remove(0);
        list.remove(1);

        assertFalse(list.contains(12.0));
        assertFalse(list.contains(44.9));
        assertTrue(list.contains(13.0));
    }

    /**
     * Tests linked deletion based on element
     */
    @Test
    public void testDeletionByElement()
    {
        ArrayBackedList<Double> list = new ArrayBackedList<>();
        list.add(12.0);
        list.add(13.0);
        list.add(44.9);

        assertTrue(list.contains(44.9));
        assertTrue(list.contains(12.0));
        assertTrue(list.contains(13.0));

        assertTrue(list.size() == 3);


        list.remove(12.0);
        list.remove(44.9);

        assertFalse(list.contains(12.0));
        assertFalse(list.contains(44.9));
        assertTrue(list.contains(13.0));
    }


    @Test
    public void testArrayResize()
    {
        ArrayBackedList<Double> list = new ArrayBackedList<>();

        for(int i = 0; i < 3000; i++)
        {
            list.add(i * 3.14);
        }
        assertTrue(list.size() == 3000);

        for(int i = 0; i < 3000; i++)
        {
            list.remove(0);
        }
        assertTrue(list.size() == 0);

        for(int i = 0; i < 6000; i++)
        {
            list.add(i * 1.0);
        }
        assertTrue(list.size() == 6000);

        for(int i = 0; i < 6000; i++)
        {
            assertTrue(list.contains(i * 1.0));
            list.remove(i* 1.0);
        }

        for(int i = 0; i < 6000; i++)
        {
            assertFalse(list.contains(i * 1.0));
            list.remove(i* 1.0);
        }

    }
}
