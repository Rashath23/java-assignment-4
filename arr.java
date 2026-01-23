import java.util.ArrayList;

class CreateArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i * 10);
        }

        System.out.println(list);
    }
}
