/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.DriverManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Abin
 */
public class User {
    public String username;
    public String name;
    public String email;
    private String password;
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://192.168.1.101:3306/vcr";
    
    private static final String USER = "root";
    private static final String PASS = "root";
    Connection conn= null;
    Statement stmt= null;
    User(String usernam,String pass){
        this.username = usernam;
        this.password = pass;
                
    }
    public Boolean validate()
    {
        try{
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
               Class.forName("com.mysql.jdbc.Driver");
               stmt = conn.createStatement();
               String sql;
               sql = "select email,name from user where username=\"" + this.username+"\" and password=\"" + this.password+"\";";
               ResultSet res=stmt.executeQuery(sql);
               System.out.println(this.password);
               if(res.next())
               {
                   name=res.getString("name");
                  email=res.getString("email");
                  
                  return true;
                                  }
               else
               {   System.out.println("else false");
                   return false;
               }
               
        }
        catch(SQLException s){s.printStackTrace();s.getMessage();}
        catch(Exception e){e.getMessage();}
        return false;
    }
    public String getUsername(){
        return username;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public static void main(String[] args )
        {
          User a=new User("YASH","yash");
          System.out.println(a.getUsername());
          System.out.println(a.getName());
          System.out.println(a.getEmail());
        }
}
