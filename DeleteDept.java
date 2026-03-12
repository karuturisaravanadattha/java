//delete

import java.sql.*;
import java.util.Scanner;

public class DeleteDept {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student","root","root");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter did to delete: ");
            int id = sc.nextInt();

            PreparedStatement ps =
                    con.prepareStatement("DELETE FROM Department WHERE did=?");

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Deleted successfully");

            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

