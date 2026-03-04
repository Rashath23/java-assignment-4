import java.util.*;

class Assignment12 {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Ravi");
        names.add("Kumar");
        names.add("Anu");
        names.add("Priya");

        Iterator<String> it = names.iterator();

        System.out.println("Set elements using Iterator:");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
