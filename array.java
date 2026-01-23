import java.util.ArrayList;

class DisplayArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
