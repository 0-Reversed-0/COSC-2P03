package DOMTrees;

public interface DomTree<E>
{

    /**
     * This method returns what we call the "root" of a tree.
     * A root is the first node of a tree and has no nodes that precedes it and no neighbouring nodes. (kind of like a head).
     * @return the element of the root node.
     */

    E root();

    /**
     * Adds an element at the lowest layer.
     * @param element the element to add to tree.
     */

    void add (E element);

    /**
     * Adds an element to a certain layer.
     * @param element the element to add to tree.
     * @param layer the layer you would like to add the element to.
     */

    void add(E element, int layer);

    /**
     * Adds an element to a certain layer and a specific position on that layer.
     * @param element the element you want to add to the tree.
     * @param layer the specific layer of the tree you want to add the element to.
     * @param index the specific index of the layer you want to add the element to.
     */

    void add(E element, int layer, int index);

    /**
     * Removes an element from the tree
     * @param layer the specific layer you want to remove an element from.
     * @param index the specific index you want to remove an element from.
     * @return the element you removed
     */

    E remove(int layer, int index);

    /**
     * Gets a specific element from the tree
     * @param layer the specific layer you want to get an element from
     * @param index the specific index you want to get an element from
     * @return an element that was called
     */

    E get(int layer, int index);

    /**
     * Gets the amount of layers deep a specific element is from a tree.
     * @param element the element to search for in the tree
     * @return the layer index of an element
     */

    int depth(E element);

    /**
     * Gets the total amount of layers in a tree.
     * @return the height of a tree.
     */

    int height();
}
