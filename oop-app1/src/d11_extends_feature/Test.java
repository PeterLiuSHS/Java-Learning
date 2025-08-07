package d11_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握继承的两个注意事项
        //1.java是单继承的：一个类只能继承一个直接父类；java中的类不支持多继承，但是支持多层继承
        //2.Object类是java中所有类的祖宗
        A a = new A();
//        Object
    }
}

class A extends Object {
}

class B {
}

class C extends B {
}
