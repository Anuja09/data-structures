package main.java.sorting;

import java.util.Stack;

public class SortStackOfIntegers {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(34);
        integerStack.push(3);
        integerStack.push(31);
        integerStack.push(98);
        integerStack.push(92);
        integerStack.push(23);

        Stack<Integer> sortedStack = sortStack(integerStack);
        System.out.println(sortedStack);
    }

    private static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<>();
        while (!input.isEmpty()) {
            int tmp = input.pop();
            while((!tempStack.isEmpty()) && (tempStack.peek() > tmp)) {
                input.push(tempStack.pop());
            }
            tempStack.push(tmp);
        }
        return tempStack;
    }
}
