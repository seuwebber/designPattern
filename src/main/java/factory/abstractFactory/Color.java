package factory.abstractFactory;

public interface Color {
    void fill();
}

class Red implements Color {

    @Override
    public void fill() {
       System.out.println("Inside Red::fill() method");
    }
}

class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method");
    }
}

class Bule implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Bule::fill() method");
    }
}
