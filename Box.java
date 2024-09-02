/**
 * Box
 * @author (Rachit Jha)
 * @version (3/31/24)
 */
import java.awt.*;
public class Box extends Form {
    private int length;
    private int width;

    public Box() {
        super(60, 50, "red", false);
        length=40;
        width=20;
    }

    public void changeSize(int width) {
        changeSize(2 * width, width);
    }

    public void changeSize(int length, int width) {
        this.length=length;
        this.width=width;
        super.changeSize();
    }



    @Override
    public void draw() {
        if(isVisible) {
            Canvas canvas=Canvas.getCanvas();
            canvas.draw(this, color, new Rectangle(xPosition, yPosition, length, width));
            canvas.wait(10);
        }
    }
}

