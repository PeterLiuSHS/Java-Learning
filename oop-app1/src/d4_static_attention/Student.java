package d4_static_attention;

public class Student {
    static String schoolName; // 类变量
    double score;  // 实例变量

    // 1.类方法中可以直接访问类的成员，不可以直接访问实例成员。
    public static void printCitizen() {
        // 注意： 同一个类中，访问类成员，可以省略类名不写
        Student.schoolName = "theCitizen西铁城鹰爵";   // 可以直接访问类变量
        Student.printCitizen2();  // 可以直接访问其他的类方法

//        System.out.println(score);

    }

    // 第二个类方法
    public static void printCitizen2() {

    }

    // 创建了一个实例方法
    public void printCasio(){

    }


}
