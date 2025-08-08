package d7_interface_demo;

public class Student {
    private String name;
    private char sex;
    private double score;

    // 提供一个无参构造器，构造器不能有返回值类型，所以public后面不能跟void
    public Student() {

    }

    // 提供一个有参构造器
    public Student(String name, char sex, double score) {
        this.name = name;
        this.sex=sex;
        this.score=score;
    }

    public String getName(){
        return name; // get方法，返回值的类型应该和原始的变量类型一致
    }

    public char getSex(){
        return sex;
    }

    public double getScore(){
        return score;
    }

    public void setName(String name){
        this.name = name;  // set方法，没有返回值，但是要有对应的传入
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public void setScore(double score){
        this.score = score;
    }
}
