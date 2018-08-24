package net.jrtechs.www.DataStructures.LinkedList;


import net.jrtechs.www.DataStructures.IList;
import net.jrtechs.www.DataStructures.Node;

/**
 * @author Jeffery Russell
 */
public class LinkedList<E> implements IList<E>
{
    private Node<E> head;

    private Node<E> tail;


    private int size;


    public LinkedList(E o)
    {
        this.head = new Node<>(o);
        this.tail = head;
        this.size = 1;
    }


    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


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


    public int size()
    {
        return this.size;
    }


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
