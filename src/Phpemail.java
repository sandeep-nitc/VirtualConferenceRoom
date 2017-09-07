/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author thelastlaugh
 */
public class Phpemail {
private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://192.168.1.101:3306/vcr";
    
    private static final String USER = "root";
    private static final String PASS = "root";
    Connection conn= null;
    Statement stmt= null;     
//add user object here
    public String Sendmail(String a,String msg) throws Exception {
        String email,name,result;
        result="";
        try{
        Connection conne = DriverManager.getConnection(DB_URL,USER,PASS);
               Class.forName("com.mysql.jdbc.Driver");
               stmt = conne.createStatement();
               //System.out.println("Hello1");
               String sql;
               //sql = "select email,name from user where username <>\'" + a+"\';";
               sql = "select email,name from user where name not in(select name from user where username=\'"+a+"\');";
               
               System.out.println(sql);
               ResultSet res=stmt.executeQuery(sql);
               //System.out.println("Hello2");
               msg="A new Notice has been Uploaded by "+a+":"+msg;
               while(res.next()){
               email = res.getString("email");
               //System.out.println(name);
               name=res.getString("name");
                //result="  ";
                
                URL url = new URL("http://192.168.1.106/VCR/sendmail.php");
                URLConnection conn = url.openConnection();
                conn.setDoOutput(true);
                PrintStream ps= new PrintStream(conn.getOutputStream());
            ps.print("&email="+email);
            ps.print("&name="+name);
            ps.print("&msg="+msg);
            ps.print("&flag=A new Notice has Been Uploaded to VCR.");
            conn.getInputStream();
            ps.close();
            BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                conn.getInputStream()));
            String inputLine;

        while ((inputLine = in.readLine()) != null) 
        {   result=result+inputLine;
            System.out.println(inputLine);
        }
            in.close();
        
               }}
        catch(Exception e)
        {System.out.println(e.getMessage());}
      return result;
    }
        public String Sendmailfile(String a,String msg) throws Exception {
            String email,name,result;
        result="";
        try{
        Connection conne = DriverManager.getConnection(DB_URL,USER,PASS);
               Class.forName("com.mysql.jdbc.Driver");
               stmt = conne.createStatement();
               //System.out.println("Hello1");
               String sql;
               //sql = "select email,name from user where username <>\'" + a+"\';";
               sql = "select email,name from user where name not in(select name from user where username=\'"+a+"\');";
               
               System.out.println(sql);
               ResultSet res=stmt.executeQuery(sql);
               //System.out.println("Hello2");
               msg="A new File has been Uploaded by "+a+" : "+msg;
               while(res.next()){
               email = res.getString("email");
               //System.out.println(name);
               name=res.getString("name");
                //result="  ";
                
                URL url = new URL("http://192.168.1.106/VCR/sendmail.php");
                URLConnection conn = url.openConnection();
                conn.setDoOutput(true);
                PrintStream ps= new PrintStream(conn.getOutputStream());
            ps.print("&email="+email);
            ps.print("&name="+name);
            ps.print("&msg="+msg);
            ps.print("&flag=A new File Has Been Uploaded to VCR");
            conn.getInputStream();
            ps.close();
            BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                conn.getInputStream()));
            String inputLine;

        while ((inputLine = in.readLine()) != null) 
        {   result=result+inputLine;
            System.out.println(inputLine);
        }
            in.close();
        
               }}
        catch(Exception e)
        {System.out.println(e.getMessage());}
      return result;
    }}
