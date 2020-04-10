package factory.simple;

public class SimpleFatoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("square");
        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
