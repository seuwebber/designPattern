package factory.abstractFactory;

import factory.simple.Shape;

//何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}

class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        String type = color.toLowerCase();
        switch (type) {
            case "red" :
                return new Red();
            case "bule" :
                return new Bule();
            case "green" :
                return new Green();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}


