
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cata
 */
public class MyDb {
    Connection con;
    public Connection getCon()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://sql7.freesqldatabase.com:3306/sql7287415","sql7287415","eVszZdEM8y");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
