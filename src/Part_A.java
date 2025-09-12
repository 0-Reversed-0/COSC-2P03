import java.util.Scanner;

public class Part_A
{
    Scanner input = new Scanner(System.in);

    Part_A()
    {
        System.out.print("Choose an index for a number in the Fibonacci sequence: ");
        int in = input.nextInt();


        System.out.println("The number at that index is: " + fibonacci(in));
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