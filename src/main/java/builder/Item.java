package builder;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

abstract class Buger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}

abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}

class VegBurger extends Buger {

    public String name() {
        return "veg Burger";
    }

    public float price() {
        return 2.5f;
    }
}

class ChickenBurger extends Buger {

    public String name() {
        return "chicken Burger";
    }

    public float price() {
        return 2.0f;
    }
}

class Coke extends ColdDrink {

    public String name() {
        return "Coke";
    }

    public float price() {
        return .5f;
    }
}

class Pepsi extends ColdDrink {

    public String name() {
        return "Pepsi";
    }

    public float price() {
        return .4f;
    }
}