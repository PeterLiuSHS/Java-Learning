package d14_extends_constructor;

public class Teacher extends People {
    private String skill;

    public Teacher(int age, String name, String skill) {
        // 子类构造器中如果需要初始化父类的属性，应该优先用super()显示调用父类的构造器
        // setName(name);
        // setAge(age);
        super(name, age);  // 这里是调用父类构造器的过程
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
