package d13_extends_visit;

public class Z extends F {
    String name = "子类名字";

    public void print2() {
        String name = "局部名字";
        System.out.println(name);       // 此处会打印局部变量
        System.out.println(this.name);  // 此处会打印子类变量
        System.out.println(super.name); // 此处会打印父类变量
    }

    @Override
    public void print1() {
        System.out.println("========子类的方法1执行了============");
    }

    public void showMethod() {
        print1();   // 此处访问的肯定是父类的print1方法
        super.print1();
    }
}
