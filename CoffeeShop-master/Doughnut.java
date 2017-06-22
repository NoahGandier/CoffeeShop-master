import javax.swing.*;
/**
 * Write a description of class Doughnut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doughnut extends SalesItem 
{
   
    public Doughnut()
    {
        final double DOUGHNUT_PRICE = 0.99;
        final int BOX_CAPACITY = 6;
        final double BOX_PRICE = 5.00;
        
        int numDoughnut;
        int numBoxes;
        
        numDoughnut = Integer.parseInt( JOptionPane.showInputDialog( null, "Enter the number of Doughnuts:" ) );
        setNumber(numDoughnut);
        
        numBoxes = numDoughnut / BOX_CAPACITY;
        numDoughnut = numDoughnut % BOX_CAPACITY;
        
        setPrice(numBoxes * BOX_PRICE + numDoughnut * DOUGHNUT_PRICE);
    }


}
