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

            Statement st=c.createStatement();
			st.executeUpdate("create table student("
					+ "id int primary key auto_increment,"
					+ "name varchar(50),"
					+ "phone varchar(10))");
			System.out.println("Table created Successfully!!");

        } catch (ClassNotFoundException | java.sql.SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        }
    }
}