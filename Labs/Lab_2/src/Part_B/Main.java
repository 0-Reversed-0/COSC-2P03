package Part_B;

import Part_A.*;

import java.util.Scanner;

public class Main {

    public Main() {
        Scanner sc = new Scanner(System.in);

        if(bracketCheck(sc.nextLine()))
        {
            System.out.println("All the brackets are closed");
        } else
        {
            System.out.println("Not all the brackets are closed");
        }
    }

    boolean bracketCheck(String input) {

        Stack<Character> leftBracket = new LinkedStack<>();
        Stack<Character> rightBracket = new LinkedStack<>();

        char[] ch = input.toCharArray();

        for (char c : ch) {
            if (check(c) == 0) {
                leftBracket.push(c);
            } else if (check(c) == 1) {
                if (!leftBracket.isEmpty()) {
                    leftBracket.pop();
                }
            }
        }

        for (int i = ch.length - 1; i >= 0; i--) {

            char c = ch[i];

            if (check(c) == 1) {
                rightBracket.push(c);
            } else if (check(c) == 0) {
                if (!rightBracket.isEmpty()) {
                    rightBracket.pop();
                }
            }
        }

        return rightBracket.isEmpty() && leftBracket.isEmpty();
    }

    int check(char c) {
        if (c == '{' || c == '[' || c == '(') {
            return 0;
        } else if (c == '}' || c == ']' || c == ')') {
            return 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        new Main();
    }
}
