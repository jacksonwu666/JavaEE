package com.igeek.javaee.ch02.relation;

public class Test {
    public static void main(String[] args) {

        Goods good1 = new Goods("手机",8888.0,1);
        Goods good2 = new Goods("衣服",888.0,2);
        Goods good3 = new Goods("鞋子",1000.0,2);
        Goods[]goods ={good1,good2,good3};
        Order order1 = new Order("A111111",goods);
        User u1 = new User("张三");
//        User u2 = new User("李四");
        u1.addOrder(order1);



    }
}
