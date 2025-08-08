package d7_interface_demo;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl1();

    public ClassManager() {
        students.add(new Student("Dilireba", 'F', 99));
        students.add(new Student("Maerzhaha", 'F', 72));
        students.add(new Student("Yiyangqianxi", 'M', 89));
        students.add(new Student("Wangzhihe", 'M', 59));
    }

    // 打印全班全部学生的信息
    public void printInfo(){
        studentOperator.printAllInfo(students);
    }

    // 打印全班全部学生的平均分
    public void printScore(){
        studentOperator.printAverageScore(students);
    }

}
