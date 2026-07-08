import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/alok",
                    "root",
                    "orion24"
            );

            // Create Statement
            Statement st = c.createStatement();

            // SQL Query
            String sql = "CREATE TABLE student ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "name VARCHAR(50),"
                    + "phone VARCHAR(10))";

            st.executeUpdate(sql);

            System.out.println("Table created successfully.");

            // Insert sample data
            String insertSql1 = "INSERT INTO student (name, phone) VALUES ('Alok', '9876543210')";

            st.executeUpdate(insertSql1);

            System.out.println("Data inserted successfully.");

            st.close();
            c.close();

        } catch (ClassNotFoundException | java.sql.SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}