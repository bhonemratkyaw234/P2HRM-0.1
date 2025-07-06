
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbProcessor {
     private String dbUrl;
    private String user;
    private String pwd;
    

public DbProcessor() {
        dbUrl = "jdbc:mysql://localhost:3306/nightduty";
        user = "root";
        pwd = "selena007gomax";
    }
    
    public Connection getDBConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, user, pwd);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DbProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
      
    
    public void add(SGdutyroster sg){
        
    }
    
  
}
