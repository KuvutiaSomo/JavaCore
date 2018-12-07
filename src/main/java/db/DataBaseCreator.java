package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseCreator {

    private String jdbcDriver;
    private String dbURL;

    //  Database credentials
    private String user = "root";
    private String pass = "1111";

    private Connection conn = null;

    public void createDatabase()
    {

        Statement stmt = null;
        try{
            registerDatabaseDriver();
            connectToDataBase();
            createDataBase(stmt);
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt!=null)
                    stmt.close();
            }
            catch(SQLException se2)
            {
            }
            try
            {
                if(conn!=null)
                    conn.close();
            }
            catch(SQLException se)
            {
                se.printStackTrace();
            }
        }
    }

    private void registerDatabaseDriver() throws ClassNotFoundException {
        Class.forName(jdbcDriver);
    }

    private void connectToDataBase() throws SQLException {
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(dbURL, user, pass);
    };

    private void createDataBase(Statement stmt) throws SQLException {

        System.out.println("Creating database...");
        stmt = conn.createStatement();

        String sql = "CREATE DATABASE STUDENTS";
        stmt.executeUpdate(sql);
        System.out.println("Database created successfully...");
    }

}
