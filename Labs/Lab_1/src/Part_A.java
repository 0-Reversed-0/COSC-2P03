public class Part_A
{

    Part_A()
    {
        System.out.println(fibonacci(8));
    }

    int fibonacci(int n)
    {
        int fib1 = 0;
        int fib2 = 1;

        int fib = 0;

        for(int i = 0; i < n; i++)
        {
            fib = fib1 + fib2;

            fib2 = fib1;
            fib1 = fib;
        }

        return fib;
    }

    public static void main(String[] args)
    {
        new Part_A();
    }
}