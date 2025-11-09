package assigment5.JDBC;

import java.sql.*;
import java.util.Scanner;

public class UpdateStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String user = "root";  
        String password = "root";  

        String updateQuery = "UPDATE students SET name = ?, marks = ? WHERE id = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database.");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student ID to update: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            System.out.print("Enter new marks: ");
            int newMarks = sc.nextInt();

            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, newName);
            pstmt.setInt(2, newMarks);
            pstmt.setInt(3, id);

            int rows = pstmt.executeUpdate();

            if (rows > 0)
                System.out.println("✅ Record updated successfully!");
            else
                System.out.println("⚠️ No record found with ID: " + id);

            pstmt.close();
            con.close();
            sc.close();
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } 
        catch (SQLException e) {
            System.out.println("Database error!");
            e.printStackTrace();
        }
    }
}

