/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CityDAO {
    
    
    
    public ArrayList getCity()
    {
         ArrayList al = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "select CityName from city";
          

            ResultSet rs = stmt.executeQuery(qry);
            
  System.out.println(qry+"====================");
            while (rs.next()) {

                CityDTO cdto = new CityDTO();
               
                cdto.setCityname(rs.getString("CityName"));
                al.add(cdto);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        return al;
    
    
    
    
    
    }
    
    public int AddCity(CityDTO cdto)
    {
         int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "insert into city (CityName,State,Pin,Country) values ('" + cdto.getCityname() + "','" + cdto.getState()+ "','" + cdto.getPin() + "','" + cdto.getCountry() + "')";
           System.out.println(qry);
            i = stmt.executeUpdate(qry);

            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        return i;
        
        
        
        
        
    }
    public int UpdateCity(CityDTO cdto) {
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "update city set CityName='" + cdto.getCityname() + "',State ='" + cdto.getState() + "',Pin = '" + cdto.getPin() + "',Country = '" + cdto.getCountry() + "'where ID"
                    + " = "+ cdto.getId()+"";
            System.out.println("======UPDATE========"+qry);
            i = stmt.executeUpdate(qry);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        return i;

    }
    
    
    public ArrayList GetCityList()
    {
    
      ArrayList al = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "select * from city";
          

            ResultSet rs = stmt.executeQuery(qry);
            
  System.out.println(qry+"====================");
            while (rs.next()) {

                CityDTO cdto = new CityDTO();
                cdto.setId(rs.getInt("ID"));
                System.out.println(rs.getInt("ID"));
                cdto.setCityname(rs.getString("CityName"));
                cdto.setState(rs.getString("State"));
                cdto.setPin(rs.getString("Pin"));
                cdto.setCountry(rs.getString("Country"));
                al.add(cdto);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        return al;
    
    
    
    
    
    }
    
    public int deleteCity(String id)
    {
    
    
     int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "delete from city where ID = "+id;
            System.out.println("==========="+qry);
            i = stmt.executeUpdate(qry);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        return i;
    
    
    
    }
    
      public CityDTO getCityDTO(String id) {
        
        CityDTO cdto = new CityDTO();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "select * from city where ID = "+id;
            System.out.println("================="+qry);
            ResultSet rs = stmt.executeQuery(qry);

            while (rs.next()) {

                cdto.setId(rs.getInt("ID"));
               
                cdto.setCityname(rs.getString("CityName"));
                cdto.setState(rs.getString("State"));
                cdto.setPin(rs.getString("Pin"));
                cdto.setCountry(rs.getString("Country"));
               

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        System.out.println("========"+cdto.getId());
        return cdto;

    }
  
    
}
