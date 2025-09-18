/**
 *
 */

@SuppressWarnings("unchecked")
// This is used to suppress every unchecked exception warnings the IDE gives you. You could also put "all" in the parameters to suppress all warnings
public class ArrayList<E>
{
    private int size = 1;
    private E[] array;

    public ArrayList()
    {
        array = (E[]) new Object[size]; // You cannot directly make a parameterized object array without type casting due to type erasure
    }

    public void add(E element)
    {
        if (isFull())
        {
            size++;

            E[] newArray = (E[]) new Object[size];

            for (int i = 0; i < size - 2; i++)
            {
                newArray[i] = array[i];
            }

            array = newArray;
            array[size - 1] = element;
        }

        size++;
        array[size - 1] = element;
    }

    public E get(int index)
    {
        if (isEmpty())
        {
            throw new RuntimeException("List is empty");
        } else if (index >= size)
        {
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }

    public E getHead()
    {
        if (isEmpty())
        {
            throw new RuntimeException("Lust is empty");
        }

        return array[0];
    }

    public E remove(int index)
    {
        if (isEmpty())
        {
            throw new RuntimeException("List is empty");
        } else if (index >= size)
        {
            throw new IndexOutOfBoundsException();
        }

        E value = array[index];
        array[index] = null;
        size--;

        E[] newArray = (E[]) new Object[size];
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

    public E removeHead()
    {
        if (isEmpty())
        {
            throw new RuntimeException("List is empty");
        }

        E value = array[0];
        array[0] = null;
        size--;

        E[] newArray = (E[]) new Object[size];
        for (int i = 1; i < array.length; i++)
        {
            newArray[i] = array[i];
        }

        array = newArray;

        return value;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size == array.length;
    }
}