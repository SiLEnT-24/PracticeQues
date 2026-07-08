import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadData {
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

		PreparedStatement ps=c.prepareStatement("select * from student where name=?");
			ps.setString(1,"Alok");
			ResultSet rs=ps.executeQuery();
			int count=0;
			while(rs.next()) {
				count++;
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("phone"));
				
				System.out.println("------------");
			}
			if(count==0) {
				System.out.println("No record found!!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
    }
}
