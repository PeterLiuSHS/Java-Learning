package d6_singleInstance;

public class Test1 {
    public static void main(String[] args) {
        // 目标：掌握单例设计模式的写法
        A a1 = A.getObject();
        A a2 = A.getObject();
        System.out.println(a1);
        System.out.println(a2);
        // 通过A类生成的实例，都是同一个对象，A类只能生成一个对象
    }
}
