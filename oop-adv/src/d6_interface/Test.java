package d6_interface;

public class Test {
    public static void main(String[] args) {
        // 目标： 搞清楚使用接口的好处
        Student s1 = new A();  // 向上转型upcasting：用父类类型（或接口类型）的引用变量，去指向子类的对象  -> 父类类型，指向子类对象
        Driver d1 = new A();
        d1.drive();
    }
}

class A extends Student implements Driver, Singer {
    @Override
    public void drive(){

    }
    @Override
    public void sing(){

    }

}

class Student {

}

interface Driver{
    void drive();
}

interface Singer{
    void sing();
}

