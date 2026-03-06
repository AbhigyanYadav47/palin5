import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "madam";
        Stack<Character> stack = new Stack<>();
        String reversed = "";

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        if (text.equals(reversed)) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is not a Palindrome.");
        }
    }
}
