/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methoden_rsbi;

import javax.swing.JFrame;
import package_rsbi_gui.JFrame_rsbi_addrecipeform;
import package_rsbi_gui.JFrame_rsbi_confirmrecipe;
import package_rsbi_gui.JFrame_rsbi_login;
import package_rsbi_gui.JFrame_rsbi_main;
import package_rsbi_gui.JFrame_rsbi_recipetable;
import package_rsbi_gui.JFrame_rsbi_registration;
import package_rsbi_gui.JFrame_rsbi_searchrecipe;
import package_rsbi_gui.JFrame_rsbi_showrecipe;

/**
 *
 * @author JF
 */
//Der Frame Manager erzeugt jedes Frame einmalig und kümmert sich um die spätere wiederverwendung
public abstract class FrameManager {
    //Unsere Frames
    static public JFrame loginFrame,
                          registrationFrame,
                          mainFrame,
                          addrecipeFrame,
                          confirmrecipeFrame,
                          searchrecipeFrame,
                          recipetableFrame,
                          showrecipeFrame;

// LOGIN methode
    static public synchronized JFrame getloginFrame()
{
    //Existenzcheck
    if(loginFrame == null)
    {
        //
        loginFrame = new JFrame_rsbi_login();
        //
    }
    //Gibt Instanz zurück
    return loginFrame;
}
// Ab hier nur für alle anderen Frames kopiert und angepasst

    static public synchronized JFrame getregistrationFrame()
{
    if(registrationFrame == null)
    {
        registrationFrame = new JFrame_rsbi_registration();
    }
    return registrationFrame;
}
    static public synchronized JFrame getmainFrame()
{
    if(mainFrame == null)
    {
        mainFrame = new JFrame_rsbi_main();
    }
    return mainFrame;
}
    static public synchronized JFrame getaddrecipeFrame()
{
    if(addrecipeFrame == null)
    {
        addrecipeFrame = new JFrame_rsbi_addrecipeform();
    }
    return addrecipeFrame;
}
    static public synchronized JFrame getconfirmrecipeFrame()
{
    if(confirmrecipeFrame == null)
    {
        confirmrecipeFrame = new JFrame_rsbi_confirmrecipe();
    }
    return confirmrecipeFrame;
}
    static public synchronized JFrame getsearchrecipeFrame()
{
    if(searchrecipeFrame == null)
    {
        searchrecipeFrame = new JFrame_rsbi_searchrecipe();
    }
    return searchrecipeFrame;
}
    static public synchronized JFrame getshowrecipeFrame()
{
    if(showrecipeFrame == null)
    {
        showrecipeFrame = new JFrame_rsbi_showrecipe();
    }
    return showrecipeFrame;
}
        static public synchronized JFrame getrecipetableFrame()
{
    if(recipetableFrame == null)
    {
        recipetableFrame = new JFrame_rsbi_recipetable();
    }
    return recipetableFrame;
}
}
