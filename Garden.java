import ecs100.*;
import java.awt.Color;
/**
 * Driver class for flowers
 * Makes flowers and grows them
 *
 * @author JY
 * @version (a version number or a date)
 */
public class Garden
{
    // instance variables
    private Flower f1;
    private Flower f2;
    private Flower f3;

    /**
     * Constructor for objects of class Garden
     */
    public Garden()
    {
        // initialise instance variables
        f1 = new Flower(50, 100, 20, 20, Color.blue);
        f2 = new Flower(100, 100, 25, 25, Color.pink);
        f3 = new Flower(150, 100, 15, 15, Color.red);
        
        // Draw in the flowers to start
        f1.draw();
        f2.draw();
        f3.draw();
        
        // Grow our garden
        f2.grow();
        f3.grow();
        f2.grow();
        f1.grow();
        f3.grow();
    }
}
