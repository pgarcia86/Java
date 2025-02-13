import abstractFactory.AbstractFactory;
import factories.CircleFactoy;
import factories.SquareFactory;
import factories.TriangleFactory;
import shape.Shape;

public class main {
    public static void main(String[] args) throws Exception {

        AbstractFactory squareFactory = new SquareFactory();
        AbstractFactory circleFactory = new CircleFactoy();
        AbstractFactory tringleFactory = new TriangleFactory();

        Shape square = squareFactory.createShape();
        Shape circle = circleFactory.createShape();
        Shape triangle = tringleFactory.createShape();

        square.draw();
        circle.draw();
        triangle.draw();
        
    }
}
