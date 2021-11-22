package Question2;

public class ShapeMaker {
    private iShape Circle;
    private iShape Rectangle;
    private iShape Square;

    public ShapeMaker(){
        Circle = new Circle();
        Rectangle = new Recatngle();
        Square = new Square();
    }

    public void drawCircle(){
        Circle.draw();
    }
    public void drawRectangle(){
        Rectangle.draw();
    }
    public void drawSquare(){
        Square.draw();
    }
}
