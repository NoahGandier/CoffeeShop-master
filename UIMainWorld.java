import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author Klavs Eglitis
 * @version 6/7/2017
 */
public class UIMainWorld extends World
{
    private boolean onSales;
    
    private SalesItem[] salesItem;
    
    private int numItemsAdded;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        startScreen();
        
    }
    
    /**
     * startScreen will and a menu option at the start of the interface.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void startScreen()
    {
        onSales = false;
        salesItem = new SalesItem[50];
        numItemsAdded = 0;
        
        Menu guiMenu = new Menu( "File", "New Sale...\nClose\nExit", 20, Color.RED, Color.BLACK, Color.WHITE, Color.RED, new FileCommands());
        clearScreen();
        addObject(guiMenu,100,20);
    }
    
    /**
     * salesScreen creates and add the right buttons in the right places of the world.
     * @param There are no parameters.
     * @return Nothing is returnded.
     */
    public void salesScreen()
    {
        onSales = true;
        Button timbitAdd = new Button(20, "button-blue.png", "button-green.png", "Add Timbit");
        Button doughnutAdd = new Button(20, "button-blue.png", "button-green.png","Add Doughnut");
        Button coffeeAdd = new Button(20, "button-blue.png", "button-green.png","Add Coffee");
        
        addObject(timbitAdd, 100, 200);
        addObject(doughnutAdd, 300, 200);
        addObject(coffeeAdd, 500, 200);
    }
    
    /**
     * thankYou removes all objects of the world, stops the Greenfoot and shows text.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void thankYou()
    {
        List objects = getObjects(null);
        onSales = false;
        if(objects != null)
        {
            removeObjects(objects);
        }
        showText("See You soon \n Your Tims", 300, 100);
        Greenfoot.stop();
    }
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(onSales == true)
        {
            calculateSale();
        }
    }
    
    /**
     * calculateSale creates the text in middle of interface and adds the right amount of money to it by 
     * inputing the amount.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void calculateSale()
    {
        double finalPrice = 0;
        int numTimbits = 0;
        int numDoughnut = 0;
        int numSmall = 0;
        int numMed = 0;
        int numLarge = 0;
        String numOfItems;
        
        for( int i = 0;salesItem[i] != null && i < salesItem.length; i++ )
        {
            if( salesItem[i] instanceof Timbit )
            {
                numTimbits = salesItem[i].getNumOfItem();
            }
            else if( salesItem[i] instanceof Doughnut)
            {
                numDoughnut = salesItem[i].getNumOfItem();
            }
            else if( salesItem[i] instanceof Coffee)
            {
                if(salesItem[i].getNumOfItem() == 1)
                {
                    numSmall ++;
                }
                else if(salesItem[i].getNumOfItem() == 2)
                {
                    numMed ++;
                }
                else if(salesItem[i].getNumOfItem() == 3)
                {
                    numLarge ++;
                }
            }
            
            finalPrice += salesItem[i].getFinalPrice();
        }
        
        numOfItems = "Timbits: " + numTimbits + "\nDoughnuts: " + numDoughnut + "\nSmall Coffee: " + numSmall + "\nMedium Coffee" + numMed + "\nLarge Coffee" + numLarge;
        showText(numOfItems + String.format("\nTotal Price: $%5.2f", finalPrice), 300, 100);
    }
    
    /**
     * addItem adds new item to the sales item list.
     * @param si is Salesitem variable that equals to numItemsAdded arrey..
     * @return Nothing is returned.
     */
    public void addItem(SalesItem si)
    {
        salesItem[numItemsAdded] = si;
        numItemsAdded++;
    }
    
    /**
     * clearScreen just cleans the screen of all the objects and shows blank text in the middle.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void clearScreen()
    {
        showText("", 300, 100);
        List objects = getObjects(null);
        
        if( objects != null)
        {
            removeObjects(objects);
        }
    }
}
