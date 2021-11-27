/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class CustomerDAO {
    Connection conn = null ;
    public CustomerDAO(){
        conn = new ConnectionToSQL().ConnectionToSQL();
    }
    
    public int Insert_CustomerDAO( String id , String Address, String Mobile , String Note ,String fullName ) throws SQLException{
        String query = "insert into Custome values(?,?,?,?,?);";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, id);
        preparedStatement.setString(2, Note);
        preparedStatement.setString(3, Address);
        preparedStatement.setString(4, Mobile);
        preparedStatement.setString(5, fullName);
        int row = preparedStatement.executeUpdate();
        return row;
    }
    public List <Customer> select_CustomerDAO_By_ID_Or_ALL(String id) throws SQLException{
        List <Customer> c = new ArrayList<>();
        String Query_by_ID = "Select * from Custome where id ="+id+";";
        String Query_All = "Select * from Custome";
        String Query =  Query_All;
        if (id.length() > 0)
            Query = Query_by_ID;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(Query);
        while (rs.next()) {
                c.add(new Customer(
                        rs.getString(1),
                        rs.getString(2), 
                        rs.getString(3), 
                       rs.getString(4), 
                       rs.getString(5)
                ));
            }
        return c;
    }
    public int DeleteByID(String id) throws SQLException{
       PreparedStatement st = conn.prepareStatement("DELETE FROM Custome WHERE id = ?");
        st.setString(1,id);
        return st.executeUpdate();
    }
    
    public int UpdateByID(String id , String Address, String Mobile , String Note ,String fullName ) throws SQLException{
        String query = "Update Custome SET Address=? , Mobile = ? , Note = ? , Fullname = ? where id = ? ;";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(5, id);
        preparedStatement.setString(3, Note);
        preparedStatement.setString(1, Address);
        preparedStatement.setString(2, Mobile);
        preparedStatement.setString(4, fullName);
        int row = preparedStatement.executeUpdate();
        return row;
    }
}
