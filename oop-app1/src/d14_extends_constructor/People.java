package d14_extends_constructor;

public class People {
    private String name;
    private int age;

    // 构造一个无参构造器
    public People() {
    }

    // 构造一个有参构造器：
    // 构造器的语法规则：名字必须和类名完全一致+没有返回值类型（连void都不能写）+是在用new创建对象时自动调用的
    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
