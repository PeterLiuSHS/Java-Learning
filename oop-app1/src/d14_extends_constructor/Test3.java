package d14_extends_constructor;

public class Test3 {
    public static void main(String[] args) {
        // 目标： 掌握在类的构造器中，通过this(...)调用兄弟构造器的作用
        Student s1 = new Student("Burke Jack", 25, "TCD");

        // 需求： 如果学生没有填写学校，那么学校默认就是 黑马职业技术学院
        Student s2 = new Student("Burke Jack1", 25);
        System.out.println(s2.getName());
        System.out.println(s1.getAge());
        System.out.println(s2.getSchoolName());
    }
}

class Student {
    private String name;
    private int age;
    private String schoolName;

    // 构造一个无参构造器
    public Student() {
    }

    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.schoolName = "黑马职业技术学院";
        this(name, age, "黑马职业技术学院");   // 任意类的构造器中，是可以通过this(...)去调用该类的其他构造器的
        // this(...), super(...) 都只能放在构造器的第一行，因此，有了this(...)就不能写super(...)了，反之亦然
    }

    // 构造一个有参构造器
    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    // 构造getter和setter方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
