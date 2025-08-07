package com.meta.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 菜品操作类，负责上架和浏览功能的实现
 */

public class FoodOperator {
    // 1.定义一个ArrayList集合对象，负责存储菜品对象
    private ArrayList<Food> foodlist = new ArrayList<>();
    // foodList = []

    // 2.开发功能：上架菜品功能
    public void addFood() {
        // 3.创建一个菜品对象，封装上架的菜品信息
        Food f = new Food();

        // 4.录入菜品信息进去
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入菜品的名称：");
        String name = sc.next();
        f.setName(name);

        System.out.println("请您输入菜品的价格：");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("请您输入菜品的评价：");
        String des = sc.next();
        f.setDesc(des);

        // 5.把菜品对象存入到集合中去
        foodlist.add(f);
        System.out.println("上架成功了一个菜品" + name);
    }

    // 6.展示菜品信息
    // foodlist = [f1, f2, ...] 是一个列表，里面装的是一个一个的food对象
    public void displayFood() {
        if (foodlist.size() == 0) {
            System.out.println("菜品列表为空，请您先添加菜品！");
            return;
        }
        for (int i = 0; i < foodlist.size(); i++) {
            Food fout = foodlist.get(i);
            System.out.println(fout.getName());
            System.out.println(fout.getPrice());
            System.out.println(fout.getDesc());
        }
    }

    // 负责展示操作界面
    public void start() {
        while (true) {
            System.out.println("请您选择功能：");
            System.out.println("1.上架菜品");
            System.out.println("2.展示菜品");
            System.out.println("3.退出系统");
            Scanner sc = new Scanner(System.in);
            System.out.println("请您选择您的操作：");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addFood();
                    break;
                case "2":
                    displayFood();
                    break;
                case "3":
                    System.out.println("再见！");
                    return;  // 结束当前方法的执行，并将控制权返回到调用这个方法的地方
                default:
                    System.out.println("你输入的命令不存在！");
            }
        }
    }
}
