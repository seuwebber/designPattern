package observer;

//意图：定义对象间一种一对多的关系，当一个对象发生变化时，所有依赖于它的对象都能得到通知并被自动更新
//何时使用：当一个对象的状态发生变化时，需要对所有依赖对象进行广播
//关键代码：在抽象类里有一个ArrayList存放观察者们
//注意：1.避免循环引用 2.如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}

class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}

class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}