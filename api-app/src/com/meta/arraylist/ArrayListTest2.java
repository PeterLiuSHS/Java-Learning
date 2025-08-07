package com.meta.arraylist;

import java.util.ArrayList;

/**
 * 目标： 掌握从集合容器中找数据并删除的技巧。
 * list.add("Casio");
 * list.add("SEIKO");
 * list.add("CITIZEN");
 * list.add("Grand Seiko");
 * list.add("RICOH");
 * list.add("SANYO");
 */

public class ArrayListTest2 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("Casio");
        list.add("SEIKO");
        list.add("CITIZEN");
        list.add("Grand Seiko");
        list.add("RICOHKING");
        list.add("RICOH");
        list.add("RICOHBOSS");
        list.add("RICOHBIG");
        list.add("SANYO");
        System.out.println(list);

        // 2.从集合中找出包含RICOH的数据并删除它
//        for (int i = 0; i < list.size(); i++) {
//            // 取出当前遍历到的数据
//            String brand = list.get(i);
//            // 判断这个数据是否包含RICOH
//            if (brand.contains("RICOH")) {
//                // 直接从集合中删除这个数据
//                list.remove(i);
//                i--; // 因为上面删掉了一个元素之后，后面的元素会往前移动一位，这个时候就要通过将index-1,然后外部循环再+1的时候，就还是那个被删掉的位置
//            }
//        }
//        System.out.println(list);

        // 3. 第二种方式，从后往前删除
        for (int i = list.size() - 1; i >= 0; i--) {
            String element = list.get(i);
            if (element.contains("RICOH")) {
                list.remove(i); // 倒着，从后往前删除，就不会出现删除之后，后面的元素往前补位的情况了
            }
        }
        System.out.println(list);
    }

}
