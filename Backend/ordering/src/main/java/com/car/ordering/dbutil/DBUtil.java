package com.car.ordering.dbutil;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@CrossOrigin("http://localhost:4200")
public class DBUtil
{
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException
    {
        if(connection!= null)
        {
            return connection;
        }
        else
        {
         String driver = "org.postgresql.Driver";
         String url = "jdbc:postgresql://localhost:5432/carordering";
         String user = "postgres";
         String password = "root";

         try
         {
             Class.forName(driver);
             connection = DriverManager.getConnection(url,user, password);
         }
         catch (ClassNotFoundException e)
         {
             e.printStackTrace();
         }
        }
        return connection;
    }
}
