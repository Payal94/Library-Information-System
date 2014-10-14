
package Connector;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/myfirstdb";
    static final String USER = "root";
    static final String PASS = "";
    public Connection conn = null;

    public Connect()
    {
       try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query

        } catch (SQLException se) {
            //Handle errors for JDBC
            System.out.println("Handle errors for JDBC ");
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            System.out.println("Handle errors for Class.forName ");
            e.printStackTrace();
        }
    }

}
