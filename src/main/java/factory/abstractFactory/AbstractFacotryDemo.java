package factory.abstractFactory;

import factory.simple.Shape;

public class AbstractFacotryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Shape shape = shapeFactory.getShape("circle");
        Color color = colorFactory.getColor("red");

        shape.draw();
        color.fill();
    }
}
