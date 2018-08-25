package net.jrtechs.www.DataStructures.Lists.Stack;

import net.jrtechs.www.DataStructures.Node;

/**
 * @author Jeffery Russell 8-25-18
 * @param <E> generic stored in collection
 */
public class Stack<E> implements IStack<E>
{
    /** Head node */
    private Node<E> head;

    public Stack()
    {
        this.head = null;
    }

    public Stack(E o)
    {
        this.head = new Node(o);
    }


    /**
     * Determines if the stack is empty
     *
     * @return
     */
    @Override
    public boolean empty()
    {
        return (this.head == null);
    }


    /**
     * Retrieves top element with out removing it
     *
     * @return top element
     */
    @Override
    public E peek()
    {
        if(this.head == null)
            return null;
        return head.getData();
    }


    /**
     * Returns and removes top element from
     * the stack.
     *
     * @return top element
     */
    @Override
    public E pop()
    {
        if(this.empty())
        {
            return null;
        }
        E temp = this.head.getData();
        this.head = this.head.getNext();
        return temp;
    }


    /**
     * Adds a new element to the Stack.
     *
     * @param item to add to stack
     */
    @Override
    public void push(E item)
    {
        this.head = new Node<>(item, this.head);
    }
}
