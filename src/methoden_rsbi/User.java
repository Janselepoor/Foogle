/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methoden_rsbi;

/**
 *
 * @author JF
 */
//Die Klasse user wird genutzt um in der Anwendung zu wissen welcher User angemeldet ist!
// wird beim login/registration erzeugt bzw überschrieben
public class User {
    static String username = null;
    static int user_id = -1;
    
    public static void setUser(String uname,int id){
        username = uname;
        user_id = id;
    }
    
    public String getUserName(){
        return username;
    }
}
