package strategy;

//意图：一个类的行为或其算法可以在运行时更改，属于行为模式的一种
//主要解决：在有多种相似算法的情况下，使用if else带来的复杂和难以维护
//何时使用：一个系统有许多类，而区分它们的只是它们的直接行为
//如何解决：将这些算法封装成一个一个的类，任意地替换
//关键代码：实现同一个接口
public interface Strategy {
    public int doOperation(int num1, int num2);
}

class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
       return num1 - num2;
    }
}

class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

