import java.util.ArrayList;
/**
 * Write a description of class Menu here.
 *
 * @author Cody Malay
 * @version 2022.12.03
 */
public class Menu
{
    private String name;
    private ArrayList<FoodDish> appetizers;
    private ArrayList<FoodDish> entrees;

    /**
     * Constructor for objects of class Menu
     */
    public Menu(String name)
    {
        this.name = name;
        appetizers = new ArrayList<>();
        entrees = new ArrayList<>();
    }

    /**
     * name getter
     *
     * @return    name
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * appetizers getter
     *
     * @return    appetizers
     */
    public ArrayList<FoodDish> getAppetizers()
    {
        // put your code here
        return appetizers;
    }
    
    /**
     * entrees getter
     *
     * @return    entrees
     */
    public ArrayList<FoodDish> getEntrees()
    {
        // put your code here
        return entrees;
    }
    
    /**
     * name setter
     *
     * @param    name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * appetizers setter
     *
     * @param    appetizers
     */
    public void setAppetizers(ArrayList<FoodDish> appetizers)
    {
        if (appetizers != null) {
            this.appetizers = appetizers;
        }
    }
    
    /**
     * entrees setter
     *
     * @param    entrees
     */
    public void setEntrees(ArrayList<FoodDish> entrees)
    {
        if (entrees != null) {
            this.entrees = entrees;
        };
    }
}
