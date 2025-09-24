package DOMTrees;

public interface DomTree<E>
{
    /**
     * This method returns what we call the "root" of a tree
     * A root is the first node of a tree and has no nodes that precedes it and no neighbouring nodes. (kind of like a head)
     * @return the element of the root node
     */

    E root();

    
}
