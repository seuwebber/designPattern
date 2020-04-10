package factory.simple;

import factory.abstractFactory.AbstractFactory;
import factory.abstractFactory.Color;

public class ShapeFactoryA extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        String type = shape.toLowerCase();
        switch (type) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}