package d3_util;

import java.util.Random;

// 实例方法需要创建对象来调用，此时对象只是为了调用方法而创造的，对象占用内存，这样会浪费内存
// 如果使用类方法，直接使用类名调用即可，调用方便，也可以节省内存
// 工具类没有创建对象的需求，因此建议将工具类的构造器进行私有，这样别人就无法创造工具类的类对象了


public class MyUtil {

    private MyUtil(){
    }

    public static String createCode(int n) {
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        // 定义一个循环产生每位随机字符
        for (int i = 0; i < n; i++) {
            // 随机一个字符范围内的索引
            int index = r.nextInt(data.length());   // data.length()是获取这个data String的长度，然后通过r.nextInt()获取随机值，从0开始，右侧坐标-1结束
            code += data.charAt(index);   // 通过获取到的坐标，去String里找到对应的element添加到code中去
        }
        return code;
    }
}
