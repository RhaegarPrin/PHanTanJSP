/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.*;
/**
 *
 * @author hoa
 */
public class CoffeeBarDAO {
    Connection conn = null ;
    public CoffeeBarDAO(){
        conn = new ConnectionToSQL().ConnectionToSQL();
    }
    
    public int Insert_confeeBar( String id ,String name, String Address, String Hotline , String Description , String Mail) throws SQLException{
        String query = "insert into CoffeBar values(?,?,?,?,?,?);";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, Address);
        preparedStatement.setString(4, Hotline);
        preparedStatement.setString(5, Description);
        preparedStatement.setString(6, Mail);
        int row = preparedStatement.executeUpdate();
        return row;
    }
    public List <CoffeBar> select_CoffeBar_By_ID_Or_ALL(String id) throws SQLException{
        List <CoffeBar> coffs = new ArrayList<>();
        String Query_by_ID = "Select * from CoffeBar where id ="+id+";";
        String Query_All = "Select * from CoffeBar";
        String Query =  Query_All;
        if (id.length() > 0)
            Query = Query_by_ID;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(Query);
        while (rs.next()) {
                coffs.add(new CoffeBar(
                        rs.getString(1),
                        rs.getString(2), 
                        rs.getString(3), 
                       rs.getString(4), 
                       rs.getString(5),
                        rs.getString(6)
                ));
            }
        return coffs;
    }
    public int DeleteByID(String id) throws SQLException{
       PreparedStatement st = conn.prepareStatement("DELETE FROM CoffeBar WHERE id = ?");
        st.setString(1,id);
        return st.executeUpdate();
    }
}
