import ecs100.*;
import java.awt.Color;
/**
 * Flower support class
 * Createa flower of a size and colour
 * Can grow
 * It can tell the driver class where it is on the screen
 *
 * @author JY
 * @version March 2022
 */
public class Flower
{
    // instance variables 
    private double flowerX = -100; // x pos of the flower
    private double flowerY = -100; // y pos of the flower
    
    private int flowerSize;        // flower Size
    private int flowerHeight;      // flower Height
    private Color color;           // Color of flower
    
    private double left;           // left of flower
    private double top;            // top of flower
    private double bottom;         // bottom of flower
    
    /**
     * Constructor for objects of class Flower
     */
    public Flower(double x, double y, int size, int stem, Color col)
    {
        // initialise instance variables
        this.flowerX = x;
        this.flowerY = y;
        this.flowerSize = size;
        this.flowerHeight = stem;
        this.color = col;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        // put your code here
    }
}
