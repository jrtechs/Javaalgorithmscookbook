package net.jrtechs.www.DataStructures.Lists.Queue;

/**
 * @author Jeffery Russell 8-26-18
 */
public interface IQueue<E>
{
    /**
     * Adds a new element to the end of the queue
     *
     * @param element object to add
     */
    public void enqueue(E element);


    /**
     * Removes an object from the queue.
     *
     * @return the object removed
     */
    public E dequeue();
}
