// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

import java.util.*
import java.util.Scanner;


public class lec2{
    public static void main(String[] args) {
        String s = "{[()]}"; // Example input string
        System.out.println(isValid(s)); // Output: true
    }public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
    for(char c:s.array)
    }
}