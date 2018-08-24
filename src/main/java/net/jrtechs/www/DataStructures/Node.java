package net.jrtechs.www.DataStructures;

/**
 * @author Jeffery Russell 8-24-18
 */


/**
 *
 * @param <E>
 */
public class Node<E>
{
    private E data;

    private Node<E> next;

    public Node(E d)
    {
        this.data = d;
        this.next = null;
    }

    public Node(E d, Node<E> newNext)
    {
        this.data = d;
        this.next = newNext;
    }

    public Node<E> getNext()
    {
        return this.next;
    }

    public E getData()
    {
        return data;
    }

    public void setNext(Node<E> newNext)
    {
        this.next = newNext;
    }
}
