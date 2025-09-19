import java.util.*;

public class InfixPostfix
{

    Stack<Integer> stack = new Stack<>();

    /**
     * In lecture, We went over converting Infix notation to Postfix using stacks.
     * An infix expression has the notation of a normal expression, Example: a + b.
     * A postfix expression has the notation of having the operands (variables/constants) come before the operator (+ - / *). Example: ab+
     */

    public InfixPostfix()
    {

    }

    void infixpostfix()
    {

    }

    boolean check(char c)
    {
        if(c == '^' | c == '/' | c == '*' | c == '+' | c == '-')
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        new InfixPostfix();
    }
}
