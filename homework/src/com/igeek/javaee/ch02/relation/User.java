package com.igeek.javaee.ch02.relation;

import com.sun.org.apache.xpath.internal.operations.Or;

public class User {
    private String name;
    private Order order;
    public User() {
    }

    public User(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addOrder(Order order){
        System.out.println("用户姓名:"+name);
        order.showGoods();

    }
}
