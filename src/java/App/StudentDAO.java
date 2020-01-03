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
public class StudentDAO {
    
    public int AddStudent(StudentDTO sdto)
    {
          int result=0;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root",null);
            Statement stmt = con.createStatement();
         //   System.out.println(uname);
            String sql = "insert into student (Name,Class,Section,FatherName,MotherName,Email,Mobile,Address,City) values ('"+sdto.getName()+"','"+sdto.getCclass()+"','"+sdto.getSec()+"','"+sdto.getFname()+"','"+sdto.getMname()+"','"+sdto.getEmail()+"','"+sdto.getMob()+"','"+sdto.getAdd()+"','"+sdto.getCity()+"')";
            System.out.println("check");
            System.out.println(sql);
           result = stmt.executeUpdate(sql);
        
            
        } catch (SQLException ex) {

        }catch (ClassNotFoundException cs){
            
        }
       
    return result;
   
    }
    
    
    public ArrayList StudentList()
    {
         ArrayList al = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "select * from student";

            ResultSet rs = stmt.executeQuery(qry);

            while (rs.next()) {

                StudentDTO sdto = new StudentDTO();
                sdto.setId(rs.getInt("ID"));
                sdto.setName(rs.getString("Name"));
                sdto.setCclass(rs.getString("Class"));
                sdto.setSec(rs.getString("Section"));
                sdto.setFname(rs.getString("FatherName"));
                sdto.setMname(rs.getString("MotherName"));
                sdto.setEmail(rs.getString("Email"));
                sdto.setMob(rs.getString("Mobile"));
                sdto.setAdd(rs.getString("Address"));
                sdto.setCity(rs.getString("City"));
                al.add(sdto);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        return al;
 
    }
    
    
    public int DeleteStudent(String id)
    {
         int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "delete from student where ID = "+id;
            System.out.println("==========="+qry);
            i = stmt.executeUpdate(qry);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        System.out.println(i+"=================\\\\");
        return i;
        
        
       
        
    }
    
    
    public StudentDTO getStudentDTO(String id)
    {
         StudentDTO sdto = new StudentDTO();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "select * from student where ID = "+id;
            System.out.println("================="+qry);
            ResultSet rs = stmt.executeQuery(qry);

            while (rs.next()) {

                sdto.setId(rs.getInt("ID"));
                sdto.setName(rs.getString("Name"));
                sdto.setCclass(rs.getString("Class"));
                sdto.setSec(rs.getString("Section"));
                sdto.setFname(rs.getString("FatherName"));
                sdto.setMname(rs.getString("MotherName"));
                sdto.setEmail(rs.getString("Email"));
                sdto.setMob(rs.getString("Mobile"));
                sdto.setAdd(rs.getString("Address"));
                sdto.setCity(rs.getString("City"));

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        System.out.println("========"+sdto.getId());
        return sdto;

        
        
    }
    
    public int UpdateStudent(StudentDTO sdto)
    {
                int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root",null);
            Statement stmt = con.createStatement();

            String qry = "update student set Name='" + sdto.getName() + "',Class ='" + sdto.getCclass()+ "',Section = '" + sdto.getSec() + "',FatherName = '" + sdto.getFname() + "',MotherName = '"+sdto.getMname()+"',Email = '"+sdto.getEmail()+ "',Mobile = '"+sdto.getMob()+ "',Address = '"+sdto.getAdd()+"',City = '"+sdto.getCity()+"'where id = "+ sdto.getId()+"";
            System.out.println("======UPDATE========"+qry);
            i = stmt.executeUpdate(qry);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {

        }
        System.out.println(i);
        return i;
        
        
        
        
        
        
    }
    
    
    
}
