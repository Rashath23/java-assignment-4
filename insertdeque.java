import java.util.*;

class Assignment16 {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);  // Insert at front
        deque.addLast(20);   // Insert at rear
        deque.addFirst(5);
        deque.addLast(25);

        System.out.println("Deque after insertions: " + deque);
    }
}
