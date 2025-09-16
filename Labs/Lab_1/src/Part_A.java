import java.util.Scanner;

public class Part_A
{

    Part_A()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose an position of a value in the fibonacci sequence: ");
        int position = input.nextInt();
        System.out.println("The value at that position is: " + fibonacci(position));
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