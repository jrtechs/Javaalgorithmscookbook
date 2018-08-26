package net.jrtechs.www.DataStructures.Lists;

import net.jrtechs.www.DataStructures.Lists.Stack.Stack;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * JUnit tests for {@link Stack}
 *
 * @author Jeffery Russell 8-25-18
 */
public class StackTest
{

    @Test
    public void testCreation()
    {
        assertNotNull(new Stack<>(12.0));

        assertNotNull(new Stack<>(14.0));
    }

    @Test
    public void testInsertion()
    {
        Stack<Double> stack = new Stack<>();
        stack.push(13.0);

        stack.push(23.0);
    }

    @Test
    public void testPeek()
    {
        Stack<Double> stack = new Stack<>();
        stack.push(13.0);

        stack.push(23.0);

        assertTrue(stack.peek() == 23.0);
    }


    @Test
    public void testPop()
    {
        Stack<Double> stack = new Stack<>();
        stack.push(13.0);

        stack.push(23.0);

        assertTrue(stack.pop() == 23.0);
        assertTrue(stack.pop() == 13.0);
    }


    @Test
    public void testEmpty()
    {
        Stack<Double> stack = new Stack<>();

        assertTrue(stack.empty());


        Stack<Double> stack22 = new Stack<>(234.0);
        assertFalse(stack22.empty());

        stack.push(13.0);

        stack.push(23.0);

        assertTrue(stack.pop() == 23.0);
        assertTrue(stack.pop() == 13.0);

        assertTrue(stack.empty());
    }
}
