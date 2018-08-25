package net.jrtechs.www.DataStructures.Lists.LinkedList;


import net.jrtechs.www.DataStructures.Node;

/**
 * Implementation of a linked list.
 *
 * @author Jeffery Russell
 */
public class LinkedList<E> implements IList<E>
{
    /** Head node */
    private Node<E> head;

    /**Stored to make insertions o(1) */
    private Node<E> tail;

    /** Keeps track of size so it doesn't
     * have to be re-calculated each time it's used */
    private int size;


    /**
     * Creates a new empty linked list
     */
    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    /**
     * Creates a new linked list with an
     * initial element stored inside of it
     *
     * @param o initial element
     */
    public LinkedList(E o)
    {
        this.head = new Node<>(o);
        this.tail = head;
        this.size = 1;
    }


    /**
     * Adds a data element to the linked list.
     *
     * @param o element to get added
     * @return
     */
    @Override
    public boolean add(E o)
    {
        this.size++;

        if(this.head == null)
        {
            this.head = new Node<E>(o);
            this.tail = this.head;
        }
        else
        {
            this.tail.setNext(new Node<E>(o));
            this.tail = this.tail.getNext();
        }
        return true;
    }


    /**
     * Checks to see if list contains the element
     *
     * @param o element to see if exists
     * @return
     */
    @Override
    public boolean contains(E o)
    {
        Node current = this.head;
        while(current != null)
        {
            if(current.getData().equals(o))
            {

                return true;
            }
            current = current.getNext();
        }
        return false;
    }


    /**
     * Returns the size of the linked list
     *
     * @return
     */
    public int size()
    {
        return this.size;
    }


    /**
     * Removes an element at a specific index in the
     * linked list
     *
     * @param index of element to remove
     * @return element removed, or null if the
     * element is not found
     */
    public E remove(int index)
    {
        int count = 0;
        Node<E> current = this.head;
        Node<E> previous = null;
        while(current != null)
        {
            if(count == index)
            {
                if(previous == null)
                {
                    this.head = current.getNext();
                }
                else
                {
                    previous.setNext(current.getNext());
                }
                this.size--;
                return current.getData();
            }
            previous = current;
            current = current.getNext();
            count++;
        }
        return null;
    }


    /**
     * Removes a specific element from the linked list
     *
     * @param o element to remove
     * @return element removed or null if element is not
     * in the list
     */
    @Override
    public E remove(E o)
    {
        Node<E> current = this.head;
        Node<E> previous = null;
        while(current != null)
        {
            if(current.getData().equals(o))
            {
                if(previous == null)
                {
                    this.head = current.getNext();
                }
                else
                {
                    previous.setNext(current.getNext());
                }
                this.size--;
                return current.getData();
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }


    /**
     * Returns the element at a specific index
     * of the linked list.
     *
     * @param index of desired element
     * @return
     */
    public E get(int index)
    {
        int count = 0;

        Node<E> current = this.head;
        while(current != null)
        {
            if(count == index)
            {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }
}
