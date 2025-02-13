package factories;
import abstractFactory.AbstractFactory;
import circle.Circle;
import shape.Shape;

public class CircleFactoy extends AbstractFactory{

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
