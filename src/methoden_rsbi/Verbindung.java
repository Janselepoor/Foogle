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
    
    public Boolean CheckName (String username)
    {
        Boolean namecheck = false;
        String namefromdb = "";
        try
        {
        Connection conn = this.starteVerbindung();
        Statement stmt = conn.createStatement();
        //System.out.println("Step1");
        ResultSet rs = stmt.executeQuery("SELECT username FROM user WHERE username = \""+username+"\";");
        //System.out.println("Step2");
        while(rs.next()){
        namefromdb = rs.getString(1);
        }
        //System.out.println("Step3");
        if(namefromdb.equals(username))
            {
                namecheck = true;
                System.out.println("Username correct");
            }
        else
            {
                JOptionPane.showMessageDialog(null,"Username incorrect!");
            }
        conn.close();
        return namecheck;
        }
        catch (Exception e){
            System.out.println("Fehler beim Auslesen der Werte aus der DB!");
            System.out.println("Fehler: "+e);
        }
        return namecheck;
    }
    public Boolean CheckPw (String username,char[] password)
    {
        Boolean pwcheck = false;
        String pwfromdb = null;
        try
        {
        // Erstellen von Verbindung und speichert Passwort im Resultset rs
        Connection conn = this.starteVerbindung();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT password FROM user WHERE username = \""+username+"\";");
        while(rs.next()){
        pwfromdb = rs.getString(1);
        }
        // Passwortabgleich
            if(pwfromdb.equals(new String (password)))
            {
                    pwcheck = true;
            }
            else
            {
                pwcheck = false;
                JOptionPane.showMessageDialog(null,"Password incorrect!");
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println("Fehler beim Auslesen der Werte aus der DB!");
            System.out.println("Fehler: "+e);}
        return pwcheck;
    }
    
        public int ReadUserId(String username)
    {
        int user_id=-1;
        try
        {
            Connection conn = this.starteVerbindung();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM user WHERE username = \""+username+"\";");
            while(rs.next())
            {
                user_id = rs.getInt(1);
                System.out.println("User courrently logged in");
                System.out.println("Username:"+username);
                System.out.println("ID      :"+user_id);
            }
            conn.close();
            }
            catch(Exception e)
            {
                System.out.println("Fehler beim Auslesen der Werte aus der DB!");
                System.out.println("Fehler: "+e); 
            }
        return user_id;
    }
    
    
    /*public ArrayList<String> ReadOutOfDB ()
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
    }*/
    
    public boolean RegisterUser (String username, String email, String password, String password_conf)
    {
        boolean allesgut = false;
        try
        {
            Connection conn = this.starteVerbindung();
            Statement stmt = conn.createStatement();
            
            if (password.equals(password_conf))
            {
                stmt.executeUpdate("Insert INTO user(email,username,password) VALUES (\""+email+"\",\""+username+"\",\""+password+"\")");
                allesgut = true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Password confirmation incorrect!");
            }
            conn.close();
        }
        catch (Exception e)
        {
            System.out.println("Fehler beim Schreiben in DB!");
            System.out.println("Fehler "+e);
        }
        return allesgut;
    }
    
    //getter für diff id nimmt: name gibt id
    public int getDiffID(String name)
    {
        int id = -1;
        try
        {
           Connection conn = this.starteVerbindung();
           Statement stmt = conn.createStatement(); 
           ResultSet rs = stmt.executeQuery("SELECT id FROM difficulty WHERE diff_name = \""+name+"\";");
           while(rs.next())
           {
               id = rs.getInt(1);
           }
           conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Auslesen der Werte aus der DB!");
            System.out.println("Fehler: "+e);
        }
        return id;
    }
    
        //getter für rezepte id nimmt: name gibt id
    public int getRecID(String name)
    {
        int id = -1;
        try
        {
           Connection conn = this.starteVerbindung();
           Statement stmt = conn.createStatement(); 
           ResultSet rs = stmt.executeQuery("SELECT id FROM recipe WHERE rec_name = \""+name+"\";");
           while(rs.next())
           {
               id = rs.getInt(1);
           }
           conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Auslesen der Werte aus der DB!");
            System.out.println("Fehler: "+e);
        }
        return id;
    }
    
            //getter für kategorien id nimmt: name gibt id
    public int getCatID(String name)
    {
        int id = -1;
        try
        {
           Connection conn = this.starteVerbindung();
           Statement stmt = conn.createStatement(); 
           ResultSet rs = stmt.executeQuery("SELECT id FROM category WHERE cat_name = \""+name+"\";");
           while(rs.next())
           {
               id = rs.getInt(1);
           }
           conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Auslesen der Werte aus der DB!");
            System.out.println("Fehler: "+e);
        }
        return id;
    }
    
            //getter für Zutaten id nimmt: name gibt id
    public int getIngrID(String name)
    {
        int id = -1;
        try
        {
           Connection conn = this.starteVerbindung();
           Statement stmt = conn.createStatement(); 
           ResultSet rs = stmt.executeQuery("SELECT id FROM ingredient WHERE ingr_name = \""+name+"\";");
           while(rs.next())
           {
               id = rs.getInt(1);
           }
           conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Auslesen der Werte aus der DB!");
            System.out.println("Fehler: "+e);
        }
        return id;
    }
    
            //getter für measurements id nimmt: name gibt id
    public int getMeasID(String name)
    {
        int id = -1;
        try
        {
           Connection conn = this.starteVerbindung();
           Statement stmt = conn.createStatement(); 
           ResultSet rs = stmt.executeQuery("SELECT id FROM measurement WHERE meas_name = \""+name+"\";");
           while(rs.next())
           {
               id = rs.getInt(1);
           }
           conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Auslesen der Werte aus der DB!");
            System.out.println("Fehler: "+e);
        }
        return id;
    }
    
    // Fügt ein Rezept in die Datenbank ein und gibt die ID zurück!!!!
    public boolean addRecipe (int user_id,int diff_id,String rec_name,int prep_time,int servings, String preparation)
    {
        boolean check = false;
            try
            {
                Connection conn = this.starteVerbindung();
                Statement stmt = conn.createStatement();
                
                stmt.executeUpdate("Insert INTO recipe(user_id,diff_id,prep_time,rec_name,servings,preparation) "
                                 + "VALUES (\""+user_id+"\",\""+diff_id+"\",\""+prep_time+"\",\""+rec_name+"\",\""+servings+"\",\""+preparation+"\")");
                check = true;
                conn.close();
            }
            catch(Exception e)
            {
                System.out.println("Fehler beim Schreiben oder Lesen!");
                System.out.println("Fehler "+e);
            }
        return check;
    }
    
    public boolean addRecCat(int rec_id,int cat_id)
    {
        boolean check = false;
        try
        {
            Connection conn = this.starteVerbindung();
            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate("Insert INTO recipe_category(recipe_id,category_id)"
                             + "VALUES (\""+rec_id+"\",\""+cat_id+"\")");
            check = true;
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Schreiben in DB!");
            System.out.println("Fehler "+e);
            check =false;
        }
        return check;
    }
    public boolean addRecIng(int rec_id,int ingr_id,int meas_id,int amount)
    {
        boolean check = false;
        try
        {
            Connection conn = this.starteVerbindung();
            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate("Insert INTO recipe_ingredient(recipe_id,ingredient_id,measurement_id,amount)"
                             + "VALUES (\""+rec_id+"\",\""+ingr_id+"\",\""+meas_id+"\",\""+amount+"\")");
            check = true;
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Schreiben in DB!");
            System.out.println("Fehler "+e);
            check =false;
        }
        return check;
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
