
package main;
import java.sql.*;

public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/employee_database_mgt","root","");
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
    return con;
    }
}

