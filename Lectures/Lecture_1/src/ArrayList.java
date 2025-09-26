/**
 * TODO
 */

@SuppressWarnings("unchecked")
// This is used to suppress every unchecked exception warnings the IDE gives you. You could also put "all" in the parameters to suppress all warnings.

public class ArrayList<E>
{

    /**
     * We use the count to check how many elements are within the ArrayList.
     *
     */

    private int count = 0;

    private E[] array; // Instead of using nodes we would instead use Linked lists

    /**
     * TODO
     */

    public ArrayList()
    {
        array = (E[]) new Object[10]; // 10 will be our default capacity and as we add more items to the list this number will grow
    }

    /**
     * Adds an element to the end of a list.
     * This method would be O(1) because it's just accessing an index, but if its full it can be O(n).
     *
     * @param element the object you want to add to the list
     */

    public void add(E element)
{
    if (isFull())
    {
        E[] newArray = (E[]) new Object[array.length + 1];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != null)
            {
                newArray[i] = array[i];
            }
        }

        array = newArray;
    }

    count++;
    array[count - 1] = element;
}

    /**
     * @param index a zero based position number within the list.
     * @return An element from the specified index.
     * @throws IndexOutOfBoundsException if the list is empty or the index is greater than the count of the list.
     */

    public E get(int index)
    {
        if (isEmpty())
        {
            throw new IndexOutOfBoundsException("List is empty.");
        } else if (index >= count)
        {
            throw new IndexOutOfBoundsException("Index is greater than the amount of elements.");
        }

        return array[index];
    }

    /**
     * @return gets the head's element without removing it.
     * @throws IndexOutOfBoundsException if the list is empty.
     */

    public E getHead()
    {
        if (isEmpty())
        {
            throw new IndexOutOfBoundsException("List is empty");
        }

        return array[0];
    }

    /**
     * Remove any element from the list.
     *
     * @param index a zero based position number within the list.
     * @return an element at the specified location.
     * @throws IndexOutOfBoundsException if the list is empty.
     */

    public E remove(int index)
    {
        if (isEmpty())
        {
            throw new IndexOutOfBoundsException("List is empty");
        } else if (index >= count)
        {
            throw new IndexOutOfBoundsException();
        }

        E value = array[index];
        array[index] = null;
        count--;

        E[] newArray = (E[]) new Object[count];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != null)
            {
                newArray[i] = array[i];
            }
        }

        array = newArray;

        return value;
    }

    /**
     * Removes the head.
     *
     * @return gets the element of the head.
     * @throws IndexOutOfBoundsException if the list is empty.
     */

    public E removeHead()
    {
        if (isEmpty())
        {
            throw new IndexOutOfBoundsException("List is empty");
        }

        E value = array[0];
        array[0] = null;
        count--;

        E[] newArray = (E[]) new Object[count];

        for (int i = 0; i < count; i++)
        {
            newArray[i] = array[i];
        }

        array = newArray;

        return value;
    }

    /**
     * @return the amount of elements in the list.
     */

    public int size()
    {
        return count;
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if it is empty and false if it's not empty.
     */

    public boolean isEmpty()
    {
        return count == 0;
    }

    /**
     * This is just a helper method, Helper methods are just methods used to help the inner workings of the class but are not methods users access.
     * Helps us determine if the array is count.
     *
     * @return false if it is not full and true if it is full.
     */

    private boolean isFull()
    {
        return count == array.length;
    }
}