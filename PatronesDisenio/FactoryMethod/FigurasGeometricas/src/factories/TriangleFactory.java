package factories;
import abstractFactory.AbstractFactory;
import shape.Shape;
import triangle.Triangle;

public class TriangleFactory extends AbstractFactory{

    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
