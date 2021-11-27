/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author hoa
 */
import DAO.*;
import models.*;
import java.sql.SQLException;
import java.util.List;

public class NewClass {
    
    public static void main(String args[]) throws SQLException{
        CoffeeBarDAO c = new CoffeeBarDAO();
        List <CoffeBar> coff = c.select_CoffeBar_By_ID_Or_ALL("");
        System.out.println(coff.size());
    }
}
