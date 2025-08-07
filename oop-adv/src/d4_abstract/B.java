package d4_abstract;

public class B extends A {
    // 一个类如果继承抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义为抽象类
    @Override
    public void run(){
        System.out.println("B run");
    }


}
