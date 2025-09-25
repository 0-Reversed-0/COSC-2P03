package Part_ABCDE;

import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.List;

public class BinaryTree<A>
{

    /**
     * Part A
     */

    A item;
    BinaryTree<A> root = null;
    BinaryTree<A> left;
    BinaryTree<A> right;

    public BinaryTree(A item, BinaryTree<A> left, BinaryTree<A> right)
    {
        this.item = item;
        this.left = left;
        this.right = right;

        root = this;
    }

    public BinaryTree(A item)
    {
        this.item = item;
        left = null;
        right = null;
    }

    /**
     * Part B
     */

    public void bfTraversal(Consumer<A> action)
    { //todo study this later
        if (root == null)
        {
            return;
        } else
        {
            List<BinaryTree<A>> list = new LinkedList<BinaryTree<A>>();

            BinaryTree<A> current = root;
            list.add(root);

            while (!list.isEmpty())
            {
                current = list.remove(0);
                action.accept(current.item);

                if (current.left != null)
                {
                    list.add(current.left);
                }
                if (current.right != null)
                {
                    list.add(current.right);
                }
            }
        }
    }

    /**
     * Part C
     */

    /*
     * Pre order
     */
    public void preorderTraversal(Consumer<A> action)
    {
        preorderTraverse(action, root);
    }

    private void preorderTraverse(Consumer<A> action, BinaryTree<A> current)
    {
        if (current == null)
        {
            return;
        }

        action.accept(current.item);
        preorderTraverse(action, current.left);
        preorderTraverse(action, current.right);
    }

    /*
     * In order
     */

    public void inorderTraversal(Consumer<A> action)
    {
        inorderTraverse(action, root);
    }

    private void inorderTraverse(Consumer<A> action, BinaryTree<A> current)
    {
        if (current == null)
        {
            return;
        }

        inorderTraverse(action, current.left);
        action.accept(current.item);
        inorderTraverse(action, current.right);
    }

    /*
     * Post order
     */

    public void postorderTraversal(Consumer<A> action)
    {
        postorderTraverse(action, root);
    }

    private void postorderTraverse(Consumer<A> action, BinaryTree<A> current)
    {
        if (current == null)
        {
            return;
        }

        postorderTraverse(action, current.left);
        postorderTraverse(action, current.right);
        action.accept(current.item);
    }


    /**
     * Part D
     */

    public int height()
    {
        return height(root);
    }

    private int height(BinaryTree<A> current)
    {
        if (current == null)
        {
            return -1; // cuz of the plus 1
        }

        int leftMax = height(current.left);
        int rightMax = height(current.right);

        return Math.max(rightMax, leftMax) + 1;
    }

    /**
     * Part E
     */

    public boolean containsNode(A x)
    {
        return contain(x, root);
    }

    private boolean contain(A x, BinaryTree<A> current)
    {
        if (current == null)
        {
            return false;
        } else if (current.item == x)
        {
            return true;
        }

        return contain(x, current.left) || contain(x, current.right); //todo study this later
    }
}
