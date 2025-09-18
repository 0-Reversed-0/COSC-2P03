package Part_B;

import Part_A.*;

import java.util.Scanner;

public class Main
{

    public Main()
    {
        Scanner sc = new Scanner(System.in);

        if (bracketCheck(sc.nextLine()))
        {
            System.out.println("All the brackets are closed");
        } else
        {
            System.out.println("Not all the brackets are closed");
        }
    }

    /**
     * A method that checks if every bracket is closed
     * @param input a string of bracket
     * @return a true if all the brackets are closed and a false if the brackets are false
     */

    boolean bracketCheck(String input)
    {

        Stack<Character> leftBracket = new LinkedStack<>();
        Stack<Character> rightBracket = new LinkedStack<>();

        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++)
        {
            if (check(ch[i]) == 0)
            {
                leftBracket.push(ch[i]);
                for (int j = i; j < ch.length; j++)
                {
                    if (ch[j] == opposite(leftBracket.peek()))
                    {
                        leftBracket.pop();
                        break;
                    }
                }
            }
        }

        for (int i = ch.length-1; i >= 0; i--)
        {
            if (check(ch[i]) == 1)
            {
                rightBracket.push(ch[i]);
                for (int j = ch.length - i - 1; j >= 0; j--)
                {
                    if (ch[j] == opposite(rightBracket.peek()))
                    {
                        rightBracket.pop();
                        break;
                    }
                }
            }
        }

        return rightBracket.isEmpty() & leftBracket.isEmpty();
    }

    /**
     * A method to check if the bracket is a left or right bracket
     * @param c the bracket
     * @return 0 if it is a left bracket, 1 if it is a right bracket, -1 if it none.
     */

    int check(char c)
    {
        if (c == '{' || c == '[' || c == '(')
        {
            return 0;
        } else if (c == '}' || c == ']' || c == ')')
        {
            return 1;
        }

        return -1;
    }

    /**
     * A method that returns the opposing bracket for each bracket variant
     * @param input the bracket you want the opposite of
     * @return the opposite bracket
     */

    char opposite(char input)
    {
        switch (input)
        {
            case '{':
                return '}';
            case '[':
                return ']';
            case '(':
                return ')';
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
        }

        return '0';
    }

    public static void main(String[] args)
    {
        new Main();
    }
}
