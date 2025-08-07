package d2_static_method;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握有无static修饰方法的用法
        // 1.类方法的用法
        // 类名.类方法（推荐）
        Student.printCasio();

        // 对象.类方法（虽然可以，但是不推荐）
        Student s = new Student();
        s.printCasio();

        s.printSeiko();

        // 总结：类方法 可以类名或者对象名来访问
        //      对象的方法 只能用对象名来访问
    }
}
