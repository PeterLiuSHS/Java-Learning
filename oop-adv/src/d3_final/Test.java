package d3_final;

public class Test {
    public static final String SCHOOL_NAME = "TCD";  // 如果final对静态变量进行修饰，那么一定要同时完成赋值
    // 用public static final修饰的成员变量我们称之为常量， 建议名称全部大写，多个单词下划线连接

    public static void main(String[] args) {
        // 目标： 认识final的作用
        // 3. final可以修饰变量总规则： 有且仅能赋值一次
        /* 变量：
           一、 局部变量 -- 在method以内的变量，就是局部变量
           二、 成员变量 -- 在class以内，但是在method以外的变量，就是成员变量
                1、静态成员变量
                2、实例成员变量
         */
        final int a;  // a就是一个局部变量，因为它被定义在 main 方法内部，因此它的作用域仅限于 main 方法内
        a = 12;
        // a = 13;    // 第二次赋值，出错了

        final double r = 3.14;
        // r = 0.01;   // 道理同上

        final int[] arr_1 = {11,22,33};
        arr_1 [0] = 33;
        // final 修饰基本类型的变量，变量存储的数据不能被改变
        // final 修饰引用类型的变量，变量存储的地址不能改变，但地址所指向对象的内容是可以被改变的
    }

    public static void buy(final double z){
        // z = 0.1;     // 这里的逻辑是，其他方法在调用buy()的时候，会向其中传入z的值，而z的值无法在方法buy()内部被修改，因为已是final
    }
}
