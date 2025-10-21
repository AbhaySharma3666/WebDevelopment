package jdbc2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class JDBC_CURD {
    static final String dburl = "jdbc:mysql://localhost/india";
    static final String user = "root";
    static final String password = "mysql";

    public static void main(String[] args) throws SQLException, IOException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        int choice;

        con = DriverManager.getConnection(dburl,user,password);

        do {
            System.out.println("\n");
            System.out.println("Menu : ");
            System.out.println("1. Insert record into table.");
            System.out.println("2. Update the existing record.");
            System.out.println("3. Display all the record.");
            System.out.println("4. Delete the record.");
            System.out.println("5. Exit.");

            System.out.println("Enter your operation:- ");
            // another way to taking input
            // BufferedReader always take input in String format we want to convert it into int
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter Your First Name: ");
                    String FirstName = br.readLine();
                    System.out.println("Enter Your Last Name: ");
                    String LastName = br.readLine();
                    System.out.println("Enter Your Roll No.: ");
                    int Roll = Integer.parseInt(br.readLine());

                    String sql = "insert into mytbl value (?,?,?)";
                    PreparedStatement p = con.prepareStatement(sql);
                    p.setString(1, FirstName);
                    p.setString(2, LastName);
                    p.setInt(3, Roll);
                    p.executeUpdate();
                    System.out.println("Record Add Successful");
                    break;
                case 2:
                    System.out.println("Enter Your Roll No. for the record you wish to update: ");
                    Roll = Integer.parseInt(br.readLine());
                    System.out.println("Enter New First Name: ");
                    FirstName = br.readLine();
                    System.out.println("Enter New Last Name: ");
                    LastName = br.readLine();

                    sql = "update mytbl set FirstName=?, LastName=? where Roll=?";
                    p = con.prepareStatement(sql);
                    p.setString(1, FirstName);
                    p.setString(2, LastName);
                    p.setInt(3, Roll);
                    p.executeUpdate();
                    System.out.println("Record Update Successful");
                    break;
                case 3:
                    stmt = con.createStatement();
                    System.out.println("Displaying the table details : ");
                    sql = "select * from mytbl;";
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        System.out.println(rs.getString(1) + " ");
                        System.out.print(rs.getString(2) + " ");
                        System.out.print(rs.getString(3) + " ");
                    }
                    System.out.println("Successfully display");
                    break;
                case 4:
                    System.out.println("Enter Your Roll No. for the record you wish to delete: ");
                    Roll = Integer.parseInt(br.readLine());
                    sql = "delete from mytbl where roll=?";
                    p = con.prepareStatement(sql);
                    p.setInt(1, Roll);
                    p.executeUpdate();
                    System.out.println("Record Deleted !!!...");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        while (choice != 5);
    }
}

