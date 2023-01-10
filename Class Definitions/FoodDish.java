
/**
 * Write a description of class FoodDish here.
 *
 * @author Cody Malay
 * @version 2022.12.03
 */
public class FoodDish
{
    private String name;
    private String description;
    private int calories;

    /**
     * Constructor for objects of class FoodDish
     */
    public FoodDish(String name, String description, int calories)
    {
        this.name = name;
        this.description = description;
        setCalories(calories);
    }

    /**
     * name getter
     *
     * @return    name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * description getter
     *
     * @return    description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * calories getter
     *
     * @return    calories
     */
    public int getCalories()
    {
        return calories;
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
     * description setter
     *
     * @param    description
     */
    public void setDescription(String description)
    {  
        this.description = description;
    }
    
    /**
     * set calories if it is not a negative value
     *
     * @param    calories
     */
    public void setCalories(int calories)
    {
        if (calories > -1) {
            this.calories = calories;
        } else {
            System.out.println("Please enter a non-negative number");
        }
    }
}
