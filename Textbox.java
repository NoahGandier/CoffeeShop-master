import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Textbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Textbox extends Actor
{
    private GreenfootImage img;
    private boolean border = false;
    private int fontSize;
    private Color foreground;
    private Color background;
    
    public Textbox(String message, int fs,boolean b,Color fg,Color bg)
    {
        border = b;
        fontSize = fs;
        foreground = fg;
        background = bg;
        
        img = new GreenfootImage(message, fontSize, foreground, background);
        display();
    }
    
    /**
     * Textbox creates an new Greenfootimage and runs display method.
     * @param String message is string that shows text.
     * @return Nothing is return.
     */
    public void Textbox( String message)
    {
        img = new GreenfootImage(message, fontSize, foreground, background);
        display();
    }
    
    /**
     * display sets image to img and draws a black rectangle.
     * @param There are no paramaters.
     * @return Nothing is returned.
     */
    private void display()
    {
        setImage(img);
        if(border == true)
        {
            img.setColor(Color.BLACK);
            img.drawRect( 0, 0, img.getWidth() - 1, img.getHeight() - 1);
            setImage(img);
            
        }
    }
    
    /**
     * Act - do whatever the Textbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
