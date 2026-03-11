1.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        int sum = 0;

        // Loop to find even numbers
        for (int num : numbers) {
            if (num % 2 == 0) {   // check even
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}

Output:  Sum of even numbers: 60


2. Write a Java program to implement Stack.

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Pop element
        System.out.println("Popped element: " + stack.pop());

        // Peek element
        System.out.println("Top element: " + stack.peek());

        System.out.println("Stack after operations: " + stack);
    }
}

Output: Stack: [10, 20, 30]
Popped element: 30
Top element: 20
Stack after operations: [10, 20]