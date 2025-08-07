package d14_extends_constructor;

public class Test {
    public static void main(String[] args) {
        // 目标：搞清楚子类构造器为什么要调用父类构造器，有什么应用场景
        Teacher t = new Teacher(36, "DickJ", "JAVA");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSkill());
    }
}
