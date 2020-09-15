package com.igeek.javaee.ch02.relation;

public class Goods {
    private String goodName;
    private double goodPrice;
    private int goodNum;

    public Goods() {
    }

    public Goods(String goodName,
                 double goodPrice, int goodNum) {
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodNum = goodNum;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(int goodNum) {
        this.goodNum = goodNum;
    }
    public void showGoods(){
        System.out.println("货物名："+getGoodName());
        System.out.println("货物价格："+getGoodPrice());
        System.out.println("货物数量："+getGoodNum());
    }

   }

