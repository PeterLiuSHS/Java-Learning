package d8_extends_application;

public class Fu {
    // 1.私有：只能在本类中访问
    private void privateMethod() {
        System.out.println("===private===");
    }

    // 2.缺省： 本类中，以及同一个包下面的类中访问
    void method() {
        System.out.println("===缺省===");
    }

    // 3.protected: 本类，同一个包下面的类，任意包中的这个类的子类中（并不是任意的子类对象都可以访问）
    protected void protectedMethod() {
        System.out.println("===protected===");
    }

    // 4.public: 本类，同一个包下面的类，任意包中的这个类的子类中（同上），任意包的任意类中
    public void publicMethod() {
        System.out.println("===public===");
    }
}
