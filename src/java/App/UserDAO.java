package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class UserDAO {
   
    
    
    public UserDTO logincheck(String uname,String pwd)
    {
          UserDTO result =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("checking1");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root",null);
            System.out.println("checking 2");
            Statement stmt = con.createStatement();
            System.out.println(uname+"userdao");
            String sql = "select * from master where UserName='"+uname+"' and Password = '"+pwd+"'";
            System.out.println("=============>>>> "+sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                result = new UserDTO();
                result.setFirstname(rs.getString("FirstName"));
                result.setLastname(rs.getString("LastName"));
                
            }
            
            
        } catch (SQLException ex) {
            System.out.println("checking");
            ex.printStackTrace();
        }catch (ClassNotFoundException cs){
            cs.printStackTrace();
        }
        return result;
    }
    public int addMaster(UserDTO udto)
    {
        int result=0;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root",null);
            Statement stmt = con.createStatement();
         //   System.out.println(uname);
            String sql = "insert into master (FirstName,LastName,UserName,Password,Mobile,Email) values ('"+udto.getFirstname()+"','"+udto.getLastname()+"','"+udto.getUsername()+"','"+udto.getPwd()+"','"+udto.getMobile()+"','"+udto.getEmail()+"')";
            System.out.println("check");
            System.out.println(sql);
           result = stmt.executeUpdate(sql);
        
            
        } catch (SQLException ex) {

        }catch (ClassNotFoundException cs){
            
        }
       
    return result;
    }
    
}
