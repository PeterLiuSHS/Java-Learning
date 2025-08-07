package d8_extends_application;

public class Demo {
    public static void main(String[] args) {
        // 目标：掌握不同权限修饰符的作用
        Fu f = new Fu();
        // f.privateMethod(); // private修饰的方法，只能在本类中使用
        f.protectedMethod();
        f.method();
        f.publicMethod();
    }
}
