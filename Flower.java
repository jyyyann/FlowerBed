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
        
        // set top, left and bottom
        this.setTop();
        this.setLeft();
        this.setBottom();
    }

    /**
     * Set left
     */
    public void setLeft() {
        this.left = this.flowerX - this.flowerSize/2.0;
    }
    
    /**
     * Set top
     */
    public void setTop() {
        this.top = this.flowerY - this.flowerHeight/2.0;
    }
    
    /**
     * Set bottom
     */
    public void setBottom() {
        this.bottom = this.flowerY + this.flowerHeight;
    }
}
