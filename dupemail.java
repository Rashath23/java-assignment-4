import java.sql.*;
import java.util.Scanner;

public class CheckDuplicateEmail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company", "root", "password");

            // Check duplicate email
            String checkQuery = "SELECT * FROM employees WHERE email=?";
            PreparedStatement checkPs = con.prepareStatement(checkQuery);
            checkPs.setString(1, email);

            ResultSet rs = checkPs.executeQuery();

            if (rs.next()) {
                System.out.println("Email already exists!");
            } else {
                String insertQuery = "INSERT INTO employees(name, email) VALUES(?, ?)";
                PreparedStatement insertPs = con.prepareStatement(insertQuery);
                insertPs.setString(1, name);
                insertPs.setString(2, email);

                insertPs.executeUpdate();
                System.out.println("Employee inserted successfully!");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
