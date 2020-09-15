package com.igeek.javaee.ch02.relation;

public class Order {
    private String orderNum;
    private Goods[] goods;

    public Order() {
    }

    public Order(String orderNum, Goods[] goods) {
        this.orderNum = orderNum;
        this.goods = goods;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }

    public void showGoods(){
        System.out.println("商品订单号："+getOrderNum());
        System.out.println("============商品信息=============");
        for(int i=0;i<goods.length;i++){
            goods[i].showGoods();
            System.out.println("---------------------");
        }
    }
}
