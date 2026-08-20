import java.util.*;

public class redundant {

    public static void main(String[] args) {
        boolean result = solve();
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != ')') {
                stack.push(ch);
            }
            else {
                if (stack.peek() == '(') {
                    return true;
                }
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            }
        }

        return false;
    }
}