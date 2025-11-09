package assigment5.JDBC;

import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String user = "root";   
        String password = "root"; 

        String deleteQuery = "DELETE FROM students WHERE id = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(" JDBC Driver loaded successfully.");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database.");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student ID to delete: ");
            int id = sc.nextInt();

            PreparedStatement pstmt = con.prepareStatement(deleteQuery);
            pstmt.setInt(1, id);

            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0)
                System.out.println(" Record deleted successfully!");
            else
                System.out.println(" No record found with ID: " + id);

            pstmt.close();
            con.close();
            sc.close();

        } catch (ClassNotFoundException e) {
            System.out.println(" JDBC Driver not found! Please check your MySQL connector.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(" Database error occurred!");
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
        } catch (Exception e) {
            System.out.println(" Unexpected error!");
            e.printStackTrace();
        }
    }
}
