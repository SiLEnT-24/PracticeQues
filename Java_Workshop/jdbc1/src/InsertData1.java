import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData1 {
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

            PreparedStatement ps=c.prepareStatement(
					"insert into student(name,phone)values(?,?)");
			ps.setString(1,"Rohan");
			ps.setString(2,"1122336655");
			ps.executeUpdate();
			System.out.println("Data Inserted!!");
		}catch(Exception e) {
			e.printStackTrace();
		}
    }
}
