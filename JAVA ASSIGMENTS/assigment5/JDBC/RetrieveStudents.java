package assigment5.JDBC;

import java.sql.*;

public class RetrieveStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String user = "root";  
        String password = "root";  
        String selectQuery = "SELECT * FROM students WHERE marks > ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database.");

            PreparedStatement pstmt = con.prepareStatement(selectQuery);
            pstmt.setInt(1, 80);

            ResultSet rs = pstmt.executeQuery();

            System.out.println("\nStudents with marks > 80:");
            System.out.println("------------------------------------");
            System.out.printf("%-5s %-15s %-10s\n", "ID", "Name", "Marks");
            System.out.println("------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.printf("%-5d %-15s %-10d\n", id, name, marks);
            }

            rs.close();
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

