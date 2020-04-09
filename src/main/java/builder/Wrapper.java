package builder;

public class Wrapper implements Packing {

    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing {

    public String pack() {
        return "Bottle";
    }
}
