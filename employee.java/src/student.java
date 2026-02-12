import java.sql.*;
public class student {
    public static void main(String[] args) throws SQLException {
        //1. import he package
        //2. load and register the drive
          // class.forName("com.mysql.ci.jdbc.Drive")
        // 3.establish the connection
        String url="jdbc:mysql://localhost:3306/student_details";
        String user_name="root";
        String password="Nithya@240505";
        Connection con = DriverManager.getConnection(url, user_name, password);
        //System.out.println("MYSQL is Connected Successfully");
        // 4 Statement

        // Create a Table
        int rool_no = 3;
        String Tname = "Team-3";
        String sql = "insert into Team values(?,?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,rool_no);
        st.setString(2,Tname);
        int ans = st.executeUpdate();
        System.out.println(ans+" row's Affected");

        //String sql = "select * from student";
        //ResultSet rs = st.executeQuery(sql);
//        while(rs.next()){
//            System.out.println(rs.getInt(1)+" " + rs.getString(2) +" "+ rs.getInt(3));
//        }
// 4 CREATE A STATEMENT(Statement, PreparedStatement
// 5 EXECUTE THE SQL QUERY
// 6 Process the Result (Using Result Set)
// 7 close the connection



        con.close();
    }
}
