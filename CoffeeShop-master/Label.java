import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    
    private final Color TRANSPARENT = new Color(0, 0, 0, 0);
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public Label(String v, int fs)
    {
        value = v;
        fontSize = fs;
        
        updateImage();
    }
    
    public Label(int v, int fs)
    {
        this(Integer.toString(v), fs);
    }
    
    /**
     * setValue sets value equal to newValue and runs update Image method.
     * @param String newValue that shows the new, updated value.
     * @return Nothing is returned.
     */
    public void setValue(String newValue)
    {
        value = newValue;
        updateImage();
    }
    
    /**
     * setValue sets value equal to newValue string and runs Image method.
     * @param integer newValue that takes the new value.
     * @return Nothing is returned.
     */
    public void setValue(int newValue)
    {
        value = Integer.toString(newValue);
        updateImage();
    }
    
    /**
     * setFill sets fillColor to newColor and runs update Image method.
     * @param newColor is a Color.
     * @return Nothing is returned.
     */
    public void setFill(Color newColor)
    {
        fillColor = newColor;
        updateImage();
    }
    
    /**
     * setLine sets lineColor equal to newColor and runs update Image method.
     * @param newColor is a Color.
     * @return Nothing is returned.
     */
    public void setLine(Color newColor)
    {
        lineColor = newColor;
        updateImage();
    }
    
    /**
     * updateImage updates the new image with right font and color.
     * @param There are no parameters.
     * @return Nothing is returned. 
     */
    public void updateImage()
    {
        setImage(new GreenfootImage(value, fontSize, fillColor, TRANSPARENT, lineColor));
    }
}
