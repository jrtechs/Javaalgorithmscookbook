package net.jrtechs.www.DataStructures.Lists.Queue;


import net.jrtechs.www.DataStructures.Node;


/**
 * Data structure which stores objects in a linked
 * list where objects inserted first are removed first,
 * and where objects inserted last are removed last.
 *
 * @author Jeffery Russell 8-26-18
 * @param <E> generic data type
 */
public class Queue<E> implements IQueue<E>
{
    /** Head node */
    private Node<E> head;

    /**Stored tail to make insertions o(1) */
    private Node<E> tail;


    /**
     * Creates an empty queue
     */
    public Queue()
    {
        this.head = null;
        this.tail = null;
    }


    /**
     * Creates a queue with a single element in it
     *
     * @param element object to add to queue
     */
    public Queue(E element)
    {
        this.head = new Node<>(element);
        this.tail = head;
    }


    /**
     * Adds a single element to the queue
     *
     * @param element object to add
     */
    @Override
    public void enqueue(E element)
    {
        Node<E> newElement = new Node<>(element);
        if(this.tail == null)
        {
            this.head = newElement;
            this.tail = newElement;
        }
        else
        {
            this.tail.setNext(newElement);
            this.tail = newElement;
        }
    }


    /**
     * Removes the element from the front of the queue
     *
     * @return element removed
     */
    @Override
    public E dequeue()
    {
        if(this.head != null)
        {
            E temp = this.head.getData();
            this.head = this.head.getNext();
            return temp;
        }
        return null;
    }
}
