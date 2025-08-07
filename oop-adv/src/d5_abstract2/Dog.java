package d5_abstract2;

public class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println(this.getName() + "汪汪汪地叫");
    }
}
