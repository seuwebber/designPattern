package singleton;

//单例模式
public class Singleton {
    //恶汉模式等

    //双检索/双重校验锁
    //是否Lazy初始化：是
    //是否线程安全：是
    //实现难度：复杂
    private volatile static Singleton singleton;
    private Singleton() {};
    public Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }




    //静态内部类方式
    //是否lazy初始化：是
    // 是否线程安全：是
    //实现难度：一般
    //注：多数情况下应使用该方式，既为lazy模式，而且还线程安全
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance2() {
        return SingletonHolder.INSTANCE;
    }

}
