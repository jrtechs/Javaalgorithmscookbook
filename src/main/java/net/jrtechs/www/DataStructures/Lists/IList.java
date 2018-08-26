package net.jrtechs.www.DataStructures.Lists;


/**
 * Generic interface to define the behavior of
 * lists.
 *
 * @param <E> generic for lists to store
 *
 * @author Jeffery Russell 8-24-18
 */
public interface IList<E>
{
    /**
     * Adds an element to the list
     *
     * @param o element to get added
     * @return whether element was edded
     */
    public boolean add(E o);


    /**
     * Determines if the list contains
     * a certain element.
     *
     * @param o element to see if exists
     * @return if element o is in the list
     */
    public boolean contains(E o);


    /**
     * Returns the size of the list.
     *
     * @return size of list
     */
    public int size();


    /**
     * Removes an element from the list
     *
     * @param index of element to remove
     * @return element which is removed
     */
    public E remove(int index);


    /**
     * Removes an element from the list
     *
     * @param o element to remove
     * @return element which is removed
     */
    public E remove(E o);


    /**
     * Returns element at a particular index
     *
     * @param index of desired element
     * @return element at a certain index
     */
    public E get(int index);
}
