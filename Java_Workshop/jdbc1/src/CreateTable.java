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

            st.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}