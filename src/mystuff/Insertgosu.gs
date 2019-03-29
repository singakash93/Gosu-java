package mystuff



uses java.sql.*
class Insertgosu {
  static function main(args : String[]) {
    print("Connecting to database...")
    using(var conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClaimCenter", "root", "root"))
    {
      var myStmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE)
      var rs = myStmt.executeQuery("Select * from Claim")
      rs.moveToInsertRow()
      rs.updateString("claimno", " 9")
      rs.updateString("Losstype", "Auto")
      //if(rs.next()){
      // rs.move              //rs.updateString("Losstype", "AINSWORTH")ToInsertRow()
      //rs.updateInt("claimno", 5)
      rs.insertRow();
      rs.moveToCurrentRow()
    }

  }


}

