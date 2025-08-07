package d3_util;

public class LoginDemo {
    public static void main(String[] args) {
        // 定义2个变量，一个是记住最终产生的随机验证码， 一个是记住可能用到的全部字符
        System.out.println(MyUtil.createCode(4));
    }
}
