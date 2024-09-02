import java.awt.*;

/**
 * A triangle that can be manipulated and that draws itself on a canvas.
 * 
 * @author	Michael Kolling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Triangle extends Form
{
    private int height;
    private int width;

    /**
     * Create a new triangle at default position with default color.
     */
    public Triangle()
    {
        super(50, 15, "green", false);
        height = 30;
        width = 40;

    }

	

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    @Override public void changeSize(int n) {
        changeSize(n, n);
    }

    protected void changeSize(int newHeight, int newWidth)
    {
        
        height = newHeight;
        width = newWidth;
        super.changeSize();
    }

    /*
     * Draw the triangle with current specifications on screen.
     */
    @Override protected void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { xPosition, xPosition + (width/2), xPosition - (width/2) };
            int[] ypoints = { yPosition, yPosition + height, yPosition + height };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }

}
