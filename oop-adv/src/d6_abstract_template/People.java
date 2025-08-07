package d6_abstract_template;

public abstract class People {
    /**
     * 设计模板方法设计模式
     * 1、定义一个模板方法出来
     */
    public void write(){
        System.out.println("\t\t\t\t\t\t\t我的日记");
        System.out.println("\t\t我正在写日记，而且是用java写作的日记。这是一种新的创作方式。");
        // 2、模板方法也不知道正文部分会写什么，但是它知道子类肯定要写
        System.out.println(writeMain());
        System.out.println("\t\t今天的日记就写到这里，让我们明天继续！");
    }

    // 3、设计一个抽象方法写正文，具体的实现交给子类完成
    public abstract String writeMain();
}
