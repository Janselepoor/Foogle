/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methoden_rsbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import package_rsbi_gui.JFrame_rsbi_recipetable;
import package_rsbi_gui.JFrame_rsbi_showrecipe;

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
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/rsbi_database?"+"user=root&password=hOto-213");
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
        // Suche 
    public boolean seachRecipe(
            int r1,
            int r2,
            int r3,
            int r4,
            int r5,
            int r6,
            int r7,
            int r8,
            int r9,
            int c1,
            int c2,
            int c3)
        {
        boolean check = false;
        try
        {
            Connection conn = this.starteVerbindung();
            DefaultTableModel model = (DefaultTableModel) JFrame_rsbi_recipetable.jTable_table_recipetable.getModel();
            PreparedStatement pst = conn.prepareStatement("select t1.rec_name, t1.amount, t2.amount, t1.create_date "
                            + "from "
                            + "(select recipe_ingredient.recipe_id,count(*) as amount,recipe.rec_name,recipe.create_date "
                            + "from recipe_ingredient, recipe "
                            + "where recipe_ingredient.recipe_id = recipe.id "
                            + "and recipe_ingredient.ingredient_id in("+r1+","+r2+","+r3+","+r4+","+r5+","+r6+","+r7+","+r8+","+r9+") "
                            + "group by recipe.rec_name "
                            + "having count(recipe_id) >=3 "
                            + "order by amount desc) t1 "
                            + "inner join "
                            + "(select recipe_category.recipe_id,count(*) as amount,recipe.rec_name "
                            + "from recipe_category, recipe "
                            + "where recipe_category.recipe_id = recipe.id "
                            + "and recipe_category.category_id in ("+c1+","+c2+","+c3+") "
                            + "group by recipe.rec_name "
                            + "order by amount desc) t2 "
                            + "on t1.recipe_id = t2.recipe_id "
                            + "group by t1.amount");
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getDate(4)});
            }
            conn.close();
            check = true;
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Auslesen von DB!");
            System.out.println("Fehler "+e);
        }
        return check;
    }
    
    public boolean showRecipe(int rec_id)
    {
        boolean check=false;
        try
        {
            Connection conn = this.starteVerbindung();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT a.rec_name, a.prep_time, a.servings, a.preparation, b.diff_name "
                    + "FROM recipe a,difficulty b "
                    + "WHERE a.id = "+rec_id+" "
                    + "AND b.id = a.diff_id;");
            while(rs.next())
            {
                JFrame_rsbi_showrecipe.jLabel_recipename_showrecipe.setText(rs.getString(1));
                JFrame_rsbi_showrecipe.jLabel_preptimedisplay_showrecipe.setText(rs.getString(2));
                JFrame_rsbi_showrecipe.jLabel_personsdisplay_showrecipe.setText(rs.getString(3));
                JFrame_rsbi_showrecipe.jTextArea_preparation_showrecipe.setText(rs.getString(4));
                JFrame_rsbi_showrecipe.jLabel_difficultydisplay_showrecipe.setText(rs.getString(5));
            }
            ArrayList<String> tmpListe = new ArrayList<String>();
            rs = stmt.executeQuery("SELECT b.cat_name "
                    + "FROM recipe_category a,category b "
                    + "WHERE a.recipe_id = "+rec_id+" "
                    + "AND b.id = a.category_id;");
            while(rs.next())
            {
               tmpListe.add(rs.getString(1)); 
            }
            int catcheck = tmpListe.size();
            
            if(catcheck >=1)
            {
                JFrame_rsbi_showrecipe.jLabel_category1_showrecipe.setText(tmpListe.get(0));
                JFrame_rsbi_showrecipe.jLabel_category1_showrecipe.setVisible(true);
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_category1_showrecipe.setVisible(false);
            }
            if(catcheck >=2)
            {
                JFrame_rsbi_showrecipe.jLabel_category2_showrecipe.setText(tmpListe.get(1));
                JFrame_rsbi_showrecipe.jLabel_category2_showrecipe.setVisible(true);
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_category2_showrecipe.setVisible(false);
            }
            if(catcheck >=3)
            {
                JFrame_rsbi_showrecipe.jLabel_category3_showrecipe.setText(tmpListe.get(2));
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_category3_showrecipe.setVisible(false);
            }
            
            rs = stmt.executeQuery("SELECT b.ingr_name, a.amount, c.meas_name "
                    + "FROM recipe_ingredient a,ingredient b, measurement c "
                    + "WHERE a.recipe_id = "+rec_id+" "
                    + "AND b.id = a.ingredient_id "
                    + "AND c.id = a.measurement_id; ");
            
            ArrayList<String> tmpListeIngr = new ArrayList<String>();
            ArrayList<String> tmpListeAmou = new ArrayList<String>();
            ArrayList<String> tmpListeMeas = new ArrayList<String>();
            
            while(rs.next())
            {
                tmpListeIngr.add(rs.getString(1));
                tmpListeAmou.add(rs.getString(2));
                tmpListeMeas.add(rs.getString(3));
            }
            int ingrcheck = tmpListeIngr.size();
            
            if(ingrcheck >= 1)
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient1_showrecipe.setText(tmpListeIngr.get(0));
                JFrame_rsbi_showrecipe.jLabel_ingredient1amount_showrecipe.setText(tmpListeAmou.get(0));
                JFrame_rsbi_showrecipe.jLabel_ingredient1measure_showrecipe.setText(tmpListeMeas.get(0));
                JFrame_rsbi_showrecipe.jLabel_ingredient1_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient1amount_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient1measure_showrecipe.setVisible(true);
                
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient1_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient1amount_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient1measure_showrecipe.setVisible(false);
            }
            if(ingrcheck >= 2)
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient2_showrecipe.setText(tmpListeIngr.get(1));
                JFrame_rsbi_showrecipe.jLabel_ingredient2amount_showrecipe.setText(tmpListeAmou.get(1));
                JFrame_rsbi_showrecipe.jLabel_ingredient2measure_showrecipe.setText(tmpListeMeas.get(1));
                JFrame_rsbi_showrecipe.jLabel_ingredient2_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient2amount_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient2measure_showrecipe.setVisible(true);
                
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient2_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient2amount_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient2measure_showrecipe.setVisible(false);
            }
            if(ingrcheck >= 3)
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient3_showrecipe.setText(tmpListeIngr.get(2));
                JFrame_rsbi_showrecipe.jLabel_ingredient3amount_showrecipe.setText(tmpListeAmou.get(2));
                JFrame_rsbi_showrecipe.jLabel_ingredient3measure_showrecipe.setText(tmpListeMeas.get(2));
                JFrame_rsbi_showrecipe.jLabel_ingredient3_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient3amount_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient3measure_showrecipe.setVisible(true);
                
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient3_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient3amount_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient3measure_showrecipe.setVisible(false);
            }
            if(ingrcheck >= 4)
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient4_showrecipe.setText(tmpListeIngr.get(3));
                JFrame_rsbi_showrecipe.jLabel_ingredient4amount_showrecipe.setText(tmpListeAmou.get(3));
                JFrame_rsbi_showrecipe.jLabel_ingredient4measure_showrecipe.setText(tmpListeMeas.get(3));
                JFrame_rsbi_showrecipe.jLabel_ingredient4_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient4amount_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient4measure_showrecipe.setVisible(true);
                
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient4_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient4amount_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient4measure_showrecipe.setVisible(false);
            }
            if(ingrcheck >= 5)
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient5_showrecipe.setText(tmpListeIngr.get(4));
                JFrame_rsbi_showrecipe.jLabel_ingredient5amount_showrecipe.setText(tmpListeAmou.get(4));
                JFrame_rsbi_showrecipe.jLabel_ingredient5measure_showrecipe.setText(tmpListeMeas.get(4));
                JFrame_rsbi_showrecipe.jLabel_ingredient5_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient5amount_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient5measure_showrecipe.setVisible(true);
                
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient5_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient5amount_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient5measure_showrecipe.setVisible(false);
            }
            if(ingrcheck >= 6)
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient6_showrecipe.setText(tmpListeIngr.get(5));
                JFrame_rsbi_showrecipe.jLabel_ingredient6amount_showrecipe.setText(tmpListeAmou.get(5));
                JFrame_rsbi_showrecipe.jLabel_ingredient6measure_showrecipe.setText(tmpListeMeas.get(5));
                JFrame_rsbi_showrecipe.jLabel_ingredient6_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient6amount_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient6measure_showrecipe.setVisible(true);
                
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient6_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient6amount_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient6measure_showrecipe.setVisible(false);
            }
            if(ingrcheck >= 7)
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient7_showrecipe.setText(tmpListeIngr.get(6));
                JFrame_rsbi_showrecipe.jLabel_ingredient7amount_showrecipe.setText(tmpListeAmou.get(6));
                JFrame_rsbi_showrecipe.jLabel_ingredient7measure_showrecipe.setText(tmpListeMeas.get(6));
                JFrame_rsbi_showrecipe.jLabel_ingredient7_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient7amount_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient7measure_showrecipe.setVisible(true);
                
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient7_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient7amount_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient7measure_showrecipe.setVisible(false);
            }
            if(ingrcheck >= 8)
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient8_showrecipe.setText(tmpListeIngr.get(7));
                JFrame_rsbi_showrecipe.jLabel_ingredient8amount_showrecipe.setText(tmpListeAmou.get(7));
                JFrame_rsbi_showrecipe.jLabel_ingredient8measure_showrecipe.setText(tmpListeMeas.get(7));
                JFrame_rsbi_showrecipe.jLabel_ingredient8_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient8amount_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient8measure_showrecipe.setVisible(true);
                
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient8_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient8amount_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient8measure_showrecipe.setVisible(false);
            }
            if(ingrcheck >= 9)
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient9_showrecipe.setText(tmpListeIngr.get(8));
                JFrame_rsbi_showrecipe.jLabel_ingredient9amount_showrecipe.setText(tmpListeAmou.get(8));
                JFrame_rsbi_showrecipe.jLabel_ingredient9measure_showrecipe.setText(tmpListeMeas.get(8));
                JFrame_rsbi_showrecipe.jLabel_ingredient9_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient9amount_showrecipe.setVisible(true);
                JFrame_rsbi_showrecipe.jLabel_ingredient9measure_showrecipe.setVisible(true);
                
            }
            else
            {
                JFrame_rsbi_showrecipe.jLabel_ingredient9_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient9amount_showrecipe.setVisible(false);
                JFrame_rsbi_showrecipe.jLabel_ingredient9measure_showrecipe.setVisible(false);
            }
            conn.close();
            check=true;
        }
        catch(Exception e)
        {
            System.out.println("Fehler beim Auslesen von DB!");
            System.out.println("Fehler "+e);
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
