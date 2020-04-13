package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state change: 10");
        subject.setState(10);
        System.out.println("Second state change 20");
        subject.setState(20);
    }
}
