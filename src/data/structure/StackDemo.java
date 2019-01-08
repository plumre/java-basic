package data.structure;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

    static void showPush(Stack<Integer> stack, int i) {
        stack.push(new Integer(i));
        System.out.println("push(" + i + ")");
        System.out.println("stack: " + stack);
    }

    static void showPop(Stack<Integer> stack) {
        System.out.print("pop ---> ");
        Integer integer = stack.pop();
        System.out.println(integer);
        System.out.println("stack: " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("stack: " + stack);
        showPush(stack, 42);
        showPush(stack, 66);
        showPush(stack, 99);
        showPop(stack);
        showPop(stack);
        showPop(stack);
        try {
            showPop(stack);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
            System.out.println(e);
        }
    }
}
