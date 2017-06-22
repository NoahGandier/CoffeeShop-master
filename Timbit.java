import javax.swing.*;
/**
 * Write a description of class Timbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timbit extends SalesItem 
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Timbit
     */
    public Timbit()
    {
        final double TIMBIT_PRICE = 0.30;
        final int BOX_CAPACITY = 12;
        final double BOX_PRICE = 3.00;
        
        int numTimbits;
        int numBoxes;
        
        numTimbits = Integer.parseInt( JOptionPane.showInputDialog( null, "Enter the number of Timbits:" ) );
        setNumber(numTimbits);
        
        numBoxes = numTimbits / BOX_CAPACITY;
        numTimbits = numTimbits % BOX_CAPACITY;
        
        setPrice(numBoxes * BOX_PRICE + numTimbits * TIMBIT_PRICE);
    }
}
