import java.util.*;

public class stack {

    int[] arr;
    int top;

    stack(int size) {
        arr = new int[size];
        top = -1;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty() {
        if (top == -1)
            return true;

        return false;
    }
}