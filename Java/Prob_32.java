// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

import java.util.*
import java.util.Scanner;

import java.util.*;

class Prob_32 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char brkt : s.toCharArray()) {
            if (brkt == '(' || brkt == '{' || brkt == '[') {
                stack.push(brkt);
            } else {
             
                if (stack.isEmpty()) {
                    return false;
                }
                
                if ((stack.peek() == '(' && brkt == ')') ||
                    (stack.peek() == '{' && brkt == '}') ||
                    (stack.peek() == '[' && brkt == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        } 
        
        return stack.isEmpty();
    } 
} 
