package com.meta.arraylist;

public class Food {
    private String name;
    private double price;
    private String desc; // description 描述

    // 创建一个无参构造器
    public Food(){
    }

    // 创建一个有参构造器
    public Food(String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    // 分别设置get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
