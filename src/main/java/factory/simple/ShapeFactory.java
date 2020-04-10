package factory.simple;

import factory.abstractFactory.Color;

public class ShapeFactory {
    public  Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        String type = shapeType.toLowerCase();
        switch (type) {
            case "circle" :
                return new Circle();
            case "square" :
                return new Square();
            case "rectangle" :
                return new Rectangle();
            default:
                return null;
        }
    }
}
