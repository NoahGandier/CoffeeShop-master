import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    private Textbox titleBar;
    private Textbox menuItems;
    private MenuCommands menuCommands;
    private int fontSize = 24;
    private boolean visible = false;
    private Color mainFG;
    private Color mainBG;
    private Color secondFG;
    private Color secondBG;
    private int titleHeight;
    private int menuHeight;
    
    public Menu(String tb, String items, int fs, Color fgMain, Color bgMain, Color fgSecond, Color bgSecond, MenuCommands mc)
    {
        menuCommands = mc;
        fontSize = fs;
        mainFG = fgMain;
        mainBG = bgMain;
        secondFG = fgSecond;
        secondBG = bgSecond;
        titleBar = new Textbox( tb, fontSize, true, mainFG, mainBG);
        menuItems = new Textbox( items, fontSize, true, secondFG, secondBG);
        
    }
    
    public Menu()
    {
        this("not initialized", "none", 24, Color.BLACK, Color.lightGray, Color.BLACK, Color.WHITE, null);
    }
    

    public void addedToWorld(World w)
    {
        w.addObject(titleBar ,getX(), getY());
        titleHeight = (titleBar.getImage().getHeight());
        menuHeight = (menuItems.getImage().getHeight());
    }
    
   
    public void handleMouse()
    {
        MouseInfo mi;
        int menuIndex;
        
        if( Greenfoot.mouseClicked(titleBar))
        {
            if( visible == false)
            {
                getWorld().addObject(menuItems, getX(), getY() + (titleHeight + menuHeight)/2);
            }
            else if ( visible = true)
            {
                getWorld().removeObject(menuItems);
            }
            visible = !visible;
        }
        else if( Greenfoot.mouseClicked(menuItems))
        {
            mi = Greenfoot.getMouseInfo();
            menuIndex = ( (mi.getY() - menuItems.getY() + menuHeight / 2) - 1 ) / fontSize;
            getWorld().removeObject(menuItems);
            menuCommands.execute( menuIndex, getWorld());
        }
    }
    
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouse();
    }    
}
