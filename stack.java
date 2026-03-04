import java.util.*;

class Assignment16 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after push: " + stack);

        // Peek
        System.out.println("Top element (Peek): " + stack.peek());

        // Pop
        System.out.println("Removed element (Pop): " + stack.pop());

        System.out.println("Stack after pop: " + stack);
    }
}
