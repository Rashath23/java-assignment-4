import java.util.*;

class Assignment12 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("B");
        list.add("C");
        list.add("D");

        list.addFirst("A");   // Insert at beginning
        list.addLast("E");    // Insert at end

        System.out.println("LinkedList elements:");
        for(String s : list) {
            System.out.println(s);
        }
    }
}
