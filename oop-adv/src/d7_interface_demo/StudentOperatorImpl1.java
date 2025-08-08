package d7_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("--------全班全部学生信息如下-------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("Name: " + s.getName() + ", Gender: " + s.getSex() + ", Score: " + s.getScore());
        }
        System.out.println("------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allScore = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);  // 这里的.get(i)是ArrayList的get方法，和Student类里面的get方法不是一回事
            // 上面这行代码，students.get(i)里面，返回的是第i个Student对象
            allScore += s.getScore();
        }
        System.out.println("全班同学的平均分是：" + allScore / students.size());
    }

}
