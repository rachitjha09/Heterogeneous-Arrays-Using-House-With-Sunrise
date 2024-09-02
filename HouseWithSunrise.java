
/**
 * Write a description of class HouseWithSunrise here.
 *
 * @author(Rachit J)
 * @version(9/11/23)
 */
import java.awt.*;

public class HouseWithSunrise {
    public static void main(String[] args){
        Object[] literals={3.14, 41, true, false, 2.72};

        for(Object obj : literals){
            if(obj instanceof Double){
                System.out.println("Decimal: " + obj);
            } else if(obj instanceof Integer){
                System.out.println("Integer: " + obj);
            } else if(obj instanceof Boolean){
                System.out.println("Boolean: " + obj);
            }
        }


        Square house=new Square();
        house.changeSize(140); 
        house.changeColor("magenta");
        house.moveDown();
        house.moveDown();
        
        Square leftWindow=new Square();
        Square rightWindow=new Square();

        leftWindow.changeColor("red");
        rightWindow.changeColor("red");

        leftWindow.moveRight();

        
        leftWindow.moveDown();
        leftWindow.moveDown();
        leftWindow.moveDown();
        leftWindow.moveDown();
        
        rightWindow.moveRight();
        rightWindow.moveRight();
        rightWindow.moveRight();
        rightWindow.moveRight();
        
        rightWindow.moveDown();
        rightWindow.moveDown();
        rightWindow.moveDown();
        rightWindow.moveDown();
        
        Square doorUpper=new Square();
        Square doorLower=new Square();
        doorUpper.changeColor("red");
        doorLower.changeColor("red");
        
        doorUpper.moveDown();
        doorUpper.moveDown();
        doorUpper.moveDown();
        doorUpper.moveDown();
        doorUpper.moveDown();
        doorUpper.moveDown();
        doorLower.moveDown();
        doorLower.moveDown();
        doorLower.moveDown();
        doorLower.moveDown();
        doorLower.moveDown();
        doorLower.moveDown();
        doorLower.moveDown();
        

        doorUpper.moveRight();
        doorLower.moveRight();
        doorUpper.moveRight();
        doorLower.moveRight();
        doorUpper.moveRight();
        doorLower.moveRight();
        
        Circle sun=new Circle();
        sun.changeColor("red");
        sun.moveRight();
        sun.moveRight();
        sun.moveRight();
        sun.moveRight();
        sun.moveRight();
        sun.moveRight();
        sun.moveRight();
        sun.moveRight();
        sun.moveRight();
        sun.moveDown();
        sun.moveDown();
        
        Triangle roof=new Triangle();
        roof.moveUp();  
        roof.changeSize(100, 170);
        roof.moveRight();
        roof.moveRight();
        roof.moveRight();
        roof.moveRight();
        
        Box box1=new Box();
        Box box2=new Box();
        Box box3=new Box();

        box1.changeSize(60, 30);
        box2.changeSize(80, 40);
        box3.changeSize(100, 50);

        box1.moveRight();
        box1.moveDown();
        box1.moveHorizontal(10);
        box1.makeVisible();

        box2.moveRight();
        box2.moveDown();
        box2.moveHorizontal(210);
        box2.makeVisible();

        box3.moveRight();
        box3.moveDown();
        box3.moveHorizontal(410);
        box3.makeVisible();
        
        roof.makeVisible();
        house.makeVisible();
        leftWindow.makeVisible();
        rightWindow.makeVisible();
        doorUpper.makeVisible();
        doorLower.makeVisible();
        sun.makeVisible();
        
        Form[] shapeList={new Circle(),new Box(),new Box(),new Box(),new Square(),new Triangle(),new Triangle(),new Triangle()};

        shapeList[0].changeSize(80);     
        shapeList[1].changeSize(60); 
        shapeList[2].changeSize(80); 
        shapeList[3].changeSize(10); 
        shapeList[4].changeSize(100);
        shapeList[5].changeSize(70); 
        shapeList[6].changeSize(120);
        shapeList[7].changeSize(40); 

        int x=10;
        for(Form shape : shapeList){
            shape.moveRight();
            shape.moveDown();
            shape.moveHorizontal(x);
            shape.makeVisible();
            x += 200;
        }

        for(Form shape : shapeList){
            if(shape instanceof Circle){
                shape.changeColor("red");
            } else if(shape instanceof Box){
                shape.changeColor("blue");
            } else if(shape instanceof Square){
                shape.changeColor("magenta");
            } else if(shape instanceof Triangle){
                shape.changeColor("green");
            }
        }


        
        sun.slowMoveVertical(-100);  
    }
}