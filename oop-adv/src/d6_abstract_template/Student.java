package d6_abstract_template;

public class Student extends People {
    @Override
    public String writeMain() {
        // 重写的话，返回值的类型要匹配，原来的抽象方法返回值是String，所以重写时也要用String
        return "\t\t我用的是学生专用笔记本写的日记。";
    }

}
