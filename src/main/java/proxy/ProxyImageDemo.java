package proxy;

public class ProxyImageDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        //图像从磁盘加载
        image.disPaly();
        System.out.println("need not from disk");
        //图像不需要从磁盘加载
        image.disPaly();
    }
}
