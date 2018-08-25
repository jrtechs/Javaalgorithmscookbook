package net.jrtechs.www.DataStructures.Lists.Stack;

/**
 * Interface for defining behavior of a Stack
 *
 * @author Jeffery Russell 8-25-18
 * @param <E>
 */
public interface IStack<E>
{
    public boolean empty();

    public E peek();

    public E pop();

    public void push(E item);
}
