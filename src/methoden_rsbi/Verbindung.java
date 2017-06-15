/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methoden_rsbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JF
 */
public class Verbindung {
    public Connection starteVerbindung () throws
            ClassNotFoundException, InstantiationException,
            IllegalAccessException, SQLException
                {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
                                            Connection conn = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11180394","sql11180394","xgJyrQK6SB");
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?"+"user=root&password=xxx");
        return conn;        
    }
    
    /*
    checks if the pw stored by user 'username' is the same as 'password'
    return true or false
    */
    public Boolean CheckPw (String username,String password)
    {
        Boolean pwcheck = false;
        String pwfromdb = null;
        try
        {
        Connection conn = this.starteVerbindung();
        Statement stmt = conn.createStatement();
        //System.out.println("Step1");
        ResultSet rs = stmt.executeQuery("SELECT password FROM user WHERE username = \""+username+"\";");
        //System.out.println("Step2");
        while(rs.next()){
        pwfromdb = rs.getString(1);
        }
        //System.out.println("Step3");
        if(pwfromdb.equals(password))
            {
                pwcheck = true;
                System.out.println("PW is correct");
            }
        else
            {
                JOptionPane.showMessageDialog(null,"Password incorrect!");
            }
        return pwcheck;
        }
        catch (Exception e){
            System.out.println("Fehler beim Auslesen der Werte aus der DB!");
            System.out.println("Fehler: "+e);
        }
        return pwcheck;
    }
    
    public ArrayList<String> ReadOutOfDB ()
    {
        ArrayList<String> tmpListe = new ArrayList<String>();
        
        try
        {
           
            Connection conn = this.starteVerbindung();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Testemich");

            while (rs.next())
            {
                tmpListe.add(rs.getString(1));
                //tmpListe.add(rs.getString(2));
                //tmpListe.add(rs.getString(3));
            } 
            return tmpListe;  
        }
        catch (Exception e)
        {
            System.out.println("Fehler beim Auslesen der Werte aus der DB!");
            System.out.println("Fehler: "+e);
        }
        return tmpListe;  
    }
    
    public boolean RegisterUser (String username, String email, String password, String password_conf)
    {
        try
        {
            Connection conn = this.starteVerbindung();
            Statement stmt = conn.createStatement();
            
            //if (password.equals(password_conf))
            //{
                stmt.executeUpdate("Insert INTO user(email,username,password) VALUES (\""+email+"\",\""+username+"\",\""+password+"\")");
                return true;
            //}
            /*else
            {
                JOptionPane.showConfirmDialog(null,"Password confirmation incorrect!");
            }*/
        }
        catch (Exception e)
        {
            System.out.println("Fehler beim Schreiben in DB!");
            System.out.println("Fehler "+e);
            return false;
        }
    }
    
    /*public boolean WriteInDB (String tmpText)
    {
        try
        {
            Connection conn = this.starteVerbindung();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("Insert into testemich values (\""+tmpText+"\");");
            
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Schreiben in DB!");
            System.out.println("Fehler "+e);
            return false;
        }
    }
    */
}
