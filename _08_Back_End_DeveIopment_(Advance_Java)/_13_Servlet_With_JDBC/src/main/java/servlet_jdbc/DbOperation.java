package servlet_jdbc;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbOperation {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studb","root","");
        System.out.println("✅ Connected to MySQL!");
        return con;
    }

    public static int save(Student_Info si) throws SQLException, ClassNotFoundException {
        int status = 0;
        try {
            Connection con = DbOperation.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO studtbl(Name,DOB,Gender,Email,Phone,Subject) VALUES (?,?,?,?,?,?)"
            );

            System.out.println("Inserting: " + si.getName() + ", " + si.getDob() + ", " + si.getGender() + ", " +
                    si.getEmail() + ", " + si.getPhone() + ", " + si.getSubject());

            ps.setString(1, si.getName());
            ps.setString(2, si.getDob());
            ps.setString(3, si.getGender());
            ps.setString(4, si.getEmail());
            ps.setString(5, si.getPhone());
            ps.setString(6, si.getSubject());

            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // log error to console
        }
        return status;
    }

    public static List<Student_Info> getAllStudent()
    {
        List<Student_Info> list = new ArrayList<>();
        try{
            Connection con = DbOperation.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from studtbl");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Student_Info si = new Student_Info();
                si.setId(rs.getInt(1));
                si.setName(rs.getString(2));
                si.setDob(rs.getString(3));
                si.setGender(rs.getString(4));
                si.setEmail(rs.getString(5));
                si.setPhone(rs.getString(6));
                si.setSubject(rs.getString(7));

                list.add(si);

            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
