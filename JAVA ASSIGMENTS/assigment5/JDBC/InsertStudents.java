package assigment5.JDBC;

import java.sql.*;

public class InsertStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String user = "root";  
        String password = "root";  

        String insertQuery = "INSERT INTO students (name, marks) VALUES (?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database.");

            PreparedStatement pstmt = con.prepareStatement(insertQuery);

            pstmt.setString(1, "Alice");
            pstmt.setInt(2, 85);
            pstmt.executeUpdate();

            pstmt.setString(1, "Bob");
            pstmt.setInt(2, 90);
            pstmt.executeUpdate();

            pstmt.setString(1, "Charlie");
            pstmt.setInt(2, 78);
            pstmt.executeUpdate();

            pstmt.setString(1, "David");
            pstmt.setInt(2, 92);
            pstmt.executeUpdate();

            pstmt.setString(1, "Eve");
            pstmt.setInt(2, 88);
            pstmt.executeUpdate();

            System.out.println(" 5 student records inserted successfully!");

            pstmt.close();
            con.close();
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
