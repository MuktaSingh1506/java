package assigment5.JDBC;

import java.sql.*;

public class CreateStudentsTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String user = "root"; 

        String createTableQuery = "CREATE TABLE students (" +
                                  "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                  "name VARCHAR(50), " +
                                  "marks INT)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.");

            Connection con = DriverManager.getConnection(url, user,"");
            System.out.println("Connected to MySQL database.");

            Statement stmt = con.createStatement();

            stmt.executeUpdate(createTableQuery);
            System.out.println("Table 'students' created successfully!");

            stmt.close();
            con.close();
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } 
        catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}
