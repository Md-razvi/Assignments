//18. Write a program to generate SQLException
package Day14;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Except_18 {
    public static void main(String[] args) {
        // JDBC URL, username, and password of the database
        String jdbcURL = "jdbc:mysql://localhost:3306/invalidDB";
        String username = "root";
        String password = "password";

        Connection connection = null;

        try {
            // Attempt to establish a connection to a non-existent database
            connection = DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException e) {
            // Handle SQLException
            System.err.println("SQLException caught! here try again");
            System.err.println("Error message: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Ensure the connection is closed if it was opened
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Failed to close connection.");
                }
            }
        }
    }
}
