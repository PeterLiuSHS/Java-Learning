package com.meta.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList的集合对象
        ArrayList<String> list = new ArrayList<String>();
        list.add("CASIO");
        list.add("CASIO");
        list.add("SEIKO");
        list.add("CITIZEN");
        System.out.println(list);

        // 2.往集合中的某个索引位置处添加一个数据
        list.add(2, "Grand Seiko");
        System.out.println(list);

        // 3.根据索引获取集合中某个索引处的值
        String rs = list.get(2);
        System.out.println(rs);

        // 4.获取集合的大小（返回集合中存储的元素的个数）
        int num = list.size();
        System.out.println(num);

        // 5. 删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(1));
        System.out.println(list);

        // 6.直接删除某个元素值，删除成功返回true，失败返回false
        // 如果有一个元素出现了两次，那么默认删除的是第一次出现的该数据
        System.out.println(list.remove("Rolex"));

        // 7.修改指定索引处的数据，修改后会返回原来的值给我们
        System.out.println(list.set(3, "CITIZEN VEGA"));
        System.out.println(list);
    }
}
