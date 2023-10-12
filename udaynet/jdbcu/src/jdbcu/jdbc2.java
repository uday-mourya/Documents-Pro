/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcu;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import static javax.swing.UIManager.getInt;

/**
 *
 * @author dell
 */
public class jdbc2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "udaysql@350");
        
        //String sql="select * from data";
        Statement st=con.CreateStatement();
        
        String sql="select * from data";
        Resultset rs=st.exceuteQuery(sql);
        
    }
    
}
