import java.util.*;

class Assignment12 {
    public static void main(String[] args) {

        Set<Integer> empIDs = new HashSet<>();

        empIDs.add(101);
        empIDs.add(102);
        empIDs.add(103);
        empIDs.add(101);  // Duplicate

        System.out.println("Employee IDs (No Duplicates Allowed):");

        for(Integer id : empIDs) {
            System.out.println(id);
        }
    }
}
