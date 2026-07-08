import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

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
			st.executeUpdate(
					"insert into student(name,phone)values('Alok','4561237893')");
			System.out.println("Data Inserted!!");
		}catch(Exception e) {
			e.printStackTrace(); 
		}

    }
    
}
