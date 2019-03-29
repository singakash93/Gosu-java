package mystuff
uses java.sql.*
class Database {
  static function main(args : String[]) {
      print("Connecting to database...")
      using(var conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClaimCenter", "root", "root"),
            var myStmt = conn.createStatement(),
            var rs = myStmt.executeQuery("Select * from Claim")) {
        while(rs.next())
          print (rs.getInt("claimno") + ", " + rs.getString("Losstype"))
        rs.close()
        myStmt.close()
        conn.close()
    }
    }
    }

