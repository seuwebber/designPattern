package strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 10 = " + context.executeStrategy(10, 10));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 10 = " + context.executeStrategy(10, 10));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 10 = " + context.executeStrategy(10, 10));
    }
}
