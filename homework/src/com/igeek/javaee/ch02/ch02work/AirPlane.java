package com.igeek.javaee.ch02.ch02work;

public class AirPlane implements ICanFly{

    @Override
    public void fly() {
        System.out.println("飞机会飞");
    }
}
