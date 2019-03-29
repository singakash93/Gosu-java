package mystuff;

import java.sql.*;

public class Insertjdbc {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            try {
                //1. Get a connection to database
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClaimCenter", "root", "root");
                //2. Create a statement
                System.out.println("Inserting records into the table...");
                Statement myStmt = conn.createStatement();
                //3. Execute SQL Query
                //insert into Claim(claimno, Losstype) values('3','Commercial');
                String sql = "insert into Claim"
                        + "(Claimno,Losstype)"
                        +"values('4','Auto')";

                myStmt.executeUpdate(sql);
                System.out.println("Inserted records into the table......");

                //4.Process the result set

            }catch(Exception exc){
                exc.printStackTrace();


            }
        }
    }














