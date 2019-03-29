package mystuff;
import java.sql.*;
public class Driverjdbc {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            //1. Get a connection to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClaimCenter", "root", "root");
            //2. Create a statement

            Statement myStmt = conn.createStatement();
            //3. Execute a Query

            ResultSet rs = myStmt.executeQuery("Select * from Claim");

            //4.Process the result set
            while(rs.next())
                System.out.println(rs.getInt("claimno") + "," + rs.getString("Losstype"));
        }catch(Exception exc){
            exc.printStackTrace();


        }
    }
}










