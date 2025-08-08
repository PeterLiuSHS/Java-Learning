package d7_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("--------全班全部学生信息如下-------");
        int count1 = 0; // numbers of boys
        int count2 = 0; // numbers of girls
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("Name: " + s.getName() + ", Gender: " + s.getSex() + ", Score: " + s.getScore());
            if (s.getSex() == 'F') {
                count2++;
            } else {
                count1++;
            }
        }
        System.out.println("The total number of students is " + students.size() + ", and the number of boys is " + count1 + ", and the number of girls is " + count2);
        System.out.println("------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allScore = 0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);  // 这里的.get(i)是ArrayList的get方法，和Student类里面的get方法不是一回事
            // 上面这行代码，students.get(i)里面，返回的是第i个Student对象
            if (s.getScore() > max) {
                max = s.getScore();
            }
            if (s.getScore() < min) {
                min = s.getScore();
            }
            allScore += s.getScore();
        }
        System.out.println("The highest score is " + max + ", and the lowest score is " + min);
        System.out.println("全班同学的平均分是：" + (allScore - min - max) / (students.size() - 2));
    }
}
