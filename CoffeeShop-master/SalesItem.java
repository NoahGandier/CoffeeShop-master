/**
 * Write a description of class SalesItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalesItem  
{
    // instance variables - replace the example below with your own
    private double salesPrice;
    private int numOfItem;
    
    /**
     * Constructor for objects of class SalesItem
     */
    public SalesItem()
    {
        salesPrice = 0;
        numOfItem = 0;
    }
    
    public SalesItem(double sp)
    {
        salesPrice = sp;
        numOfItem = 0;
    }
    
    public int getNumOfItem()
    {
        return numOfItem;
    }
    
    public double getFinalPrice()
    {
        return ( 1.13 * salesPrice);
    }
    
    public void setPrice( double fp)
    {
        salesPrice = fp;
    }
    
    public void setNumber(int ni)
    {
        numOfItem = ni;
    }
}
