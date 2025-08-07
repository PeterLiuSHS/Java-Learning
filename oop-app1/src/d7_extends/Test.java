package d7_extends;

public class Test {
    public static void main(String[] args) {
        // 目标：认识继承、掌握继承的特点
        B b = new B();
        System.out.println(b.i);

        b.print1();
       //  b.print2();   // 因为print2()方法是父类中的私有方法，因此子类的成员是无法使用的
    }
}
