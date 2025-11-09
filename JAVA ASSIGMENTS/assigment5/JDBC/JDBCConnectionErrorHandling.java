package assigment5.JDBC;

import java.sql.*;

public class JDBCConnectionErrorHandling {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/fake_database"; 
        String user = "wrong_user"; 
        String password = "wrong_password"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver loaded successfully.");

            System.out.println(" Trying to connect to database...");
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println(" Connected successfully!");
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println(" Error: MySQL JDBC Driver not found!");
            System.out.println(" Hint: Make sure 'mysql-connector-j-8.0.xx.jar' is added to your classpath.");
        } catch (SQLException e) {
            System.out.println(" SQL Error occurred while connecting to the database.");
            System.out.println(" Error Message: " + e.getMessage());
            System.out.println(" SQL State: " + e.getSQLState());
            System.out.println(" Error Code: " + e.getErrorCode());
            System.out.println(" Hint: Check database name, username, or password.");
        } catch (Exception e) {
            System.out.println(" Unexpected error occurred!");
            e.printStackTrace();
        } finally {
            System.out.println(" Program finished.");
        }
    }
}
