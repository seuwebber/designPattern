package factory.simple;

public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}

class Square implements Shape {

    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}

 class Circle implements Shape {

    public void draw() {
        System.out.println("Inside Cirle::draw() method");
    }
}