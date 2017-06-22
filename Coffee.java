import javax.swing.*;
/**
 * Write a description of class Coffee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coffee extends SalesItem 
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Coffee
     */
    public Coffee()
    {
        final double SMALL_PRICE = 1.33;
        final double MEDIUM_PRICE = 1.59;
        final double LARGE_PRICE = 1.86;

        String size = JOptionPane.showInputDialog( null, "Enter the size of Coffee:");
        
        if( size.equalsIgnoreCase("s") == true)
        {
            setNumber(1);
            setPrice(SMALL_PRICE);
        }
        
        if( size.equalsIgnoreCase("m") == true)
        {
            setNumber(2);
            setPrice(MEDIUM_PRICE);
        }
        
        if( size.equalsIgnoreCase("l") == true)
        {
            setNumber(3);
            setPrice(LARGE_PRICE);
        }
    }
}
