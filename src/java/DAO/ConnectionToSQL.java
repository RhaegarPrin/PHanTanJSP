/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author hoa
 */
public class ConnectionToSQL {
    private static String DB_URL = "jdbc:sqlserver://10.244.204.162:1433;"
            + "databaseName=T2;";
    private static String USER_NAME = "prin";
    private static String PASSWORD = "nghia198";
    Connection conn = null;
    Connection ConnectionToSQL() {
        this.conn = getConnection(DB_URL, USER_NAME, PASSWORD);
        return this.conn;
    }
    
    public static Connection getConnection(String dbURL, String userName, 
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
