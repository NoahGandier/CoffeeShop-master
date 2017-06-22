import greenfoot.*;
/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands 
{
    /**
     * execute prints out different sentences with the names of commands.
     * @param idx is a integer that comes from commands string and World w is a world.
     * @return Nothing is returned.
     */
    public void execute(int idx, World w)
    {
        UIMainWorld guiWorld = (UIMainWorld)w;
        
        if (idx == 0)
        {
            guiWorld.salesScreen();
        }
        else if(idx == 1)
        {
            guiWorld.startScreen();
        }
        else if(idx == 2)
        {
            guiWorld.thankYou();
        }
        
    }
    
    /**
     * Constructor for objects of class FileCommands
     */
    public FileCommands()
    {
        
    }
}
