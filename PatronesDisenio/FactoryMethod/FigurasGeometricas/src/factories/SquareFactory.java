package factories;
import abstractFactory.AbstractFactory;
import shape.Shape;
import square.Square;

public class SquareFactory extends AbstractFactory{

    @Override
    public Shape createShape() {
        return new Square();
    }

}
