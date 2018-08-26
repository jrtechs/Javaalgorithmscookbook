package net.jrtechs.www.DataStructures.Lists;

import net.jrtechs.www.DataStructures.Lists.Queue.Queue;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;

/**
 * JUnit tests for
 * {@link net.jrtechs.www.DataStructures.Lists.Queue.Queue}
 *
 * @author Jeffery Russell 8-26-18
 */
public class QueueTest
{
    @Test
    public void testCreation()
    {
        assertNotNull(new Queue<>());

        assertNotNull(new Queue<>(12.0));
    }


    @Test
    public void testInsertion()
    {
        Queue<String> words = new Queue<>();

        words.enqueue("One");

        words.enqueue("Two");

        words.enqueue("Three");

        assertNotNull(words.dequeue());
    }

    @Test
    public void testDequeue()
    {
        Queue<String> words = new Queue<>();

        words.enqueue("One");
        words.enqueue("Two");
        words.enqueue("Three");

        assertTrue(words.dequeue().equals("One"));
        assertTrue(words.dequeue().equals("Two"));
        assertTrue(words.dequeue().equals("Three"));

        assertNull(words.dequeue());
    }
}
