import java.util.List;
import java.util.LinkedList;

public class Part_C
{

    Part_C()
    {
        List<Integer> list = primeFactors(800);

        for (Integer integer : list)
        {
            System.out.print(integer + " ");
        }
    }

    /**
     * Iterative Version
     *
     * @param n the number you want to find the factors of
     * @return a list of all the factors
     */

    List<Integer> primeFactors(int n)
    {
        List<Integer> list = new LinkedList<>();

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0 & isPrime(i))
            {
                list.add(i);
            }
        }

        return list;
    }

    /**
     * An O(n) method to check if a number is prime or not
     *
     * @param n the number to be checked if it is prime
     * @return true if it's prime and false if it's not prime
     */

    boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }

        if (n == 2) // 2 is a special exception because 2%2 = 0 but 2 is a prime number
        {
            return true;
        }

        for (int i = 2; i < n; i++) //checks from 2 to n-1 to check if any number is divisible by n
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        new Part_C();
    }
}
