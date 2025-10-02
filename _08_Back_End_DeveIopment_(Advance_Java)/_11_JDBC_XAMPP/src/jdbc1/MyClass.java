package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyClass {

//    static final String dburl = "jdbc:mysql://localhost";
    static final String dburl = "jdbc:mysql://localhost/India";
    static final String user = "root";
    static final String password = "mysql";
    // add jar file of mysql-connector-j-9.0.0.jar to libraries

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement stmt = null;

        System.out.println("Connecting to Database....");
        con = DriverManager.getConnection(dburl,user,password);
        stmt = con.createStatement();

//        System.out.println("Creating Database!!");
//        String sql = "create database India";
//        stmt.executeUpdate(sql);
//        System.out.println("Databases Created.");

//        System.out.println("Creating tables!!");
//        String sql = "create table mytable (id integer primary key, name varchar(50),city varchar(100))";
//        stmt.executeUpdate(sql);
//        System.out.println("Table Created.");

        System.out.println("Inserting Data");
        String sql = "insert into mytable (id,name,city) values (1,'Ravi','Bhilai')";
        stmt.executeUpdate(sql);
        System.out.println("Successfully inserted.");



    }
}
