/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcu;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class Jdbcu {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "udaysql@350");

        // System.out.println("SUCCESS");
        String quert = "insert into data values('uday','udaymourya921@gmail.com','ususussu','indore')";
        PreparedStatement ps;
        ps = con.prepareStatement(quert);

        int i =0;
        try {

            i = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

        System.out.println("4");
        if (i > 0) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }

}
