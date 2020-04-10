package factory.abstractFactory;

import factory.simple.ShapeFactoryA;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactoryA();
        }
        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
