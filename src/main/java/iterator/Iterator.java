package iterator;

//意图：提供一种方法顺序访问一个聚合对象中各个元素，而又无需暴露该对象的内部表示
//何时使用：遍历一个聚合对象，如 java中的iterator
//关键代码： hasNext， next
public interface Iterator {
    boolean hasNext();
    Object next();
}

interface Container {
    Iterator getIterator();
}