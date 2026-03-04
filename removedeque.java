import java.util.*;

class Assignment16 {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        System.out.println("Original Deque: " + deque);

        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());

        System.out.println("Deque after removal: " + deque);
    }
}
