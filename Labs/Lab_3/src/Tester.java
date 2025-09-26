import Part_ABCDE.BinaryTree;

public class Tester
{
    public static void main(String[] args)
    {
        BinaryTree<Character> tree =
                new BinaryTree<>('a',
                        new BinaryTree<>('b', new BinaryTree<>('d'), null),
                        new BinaryTree<>('c', new BinaryTree<>('e'), new BinaryTree<>('f', new BinaryTree<>('g'), null)));


        tree.bfTraversal(System.out::print);
        System.out.println();
        tree.preorderTraversal(System.out::print);
        System.out.println();
        tree.inorderTraversal(System.out::print);
        System.out.println();
        tree.postorderTraversal(System.out::print);
        System.out.println("\n" + tree.containsNode('g'));
        System.out.println(tree.height());
    }
}
