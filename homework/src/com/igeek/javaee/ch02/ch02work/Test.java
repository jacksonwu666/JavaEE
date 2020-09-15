package com.igeek.javaee.ch02.ch02work;

public class Test {
    private ICanFly canFly;

    public Test() {
    }

    public Test(ICanFly canFly) {
        this.canFly = canFly;
    }

    public ICanFly getCanFly() {
        return canFly;
    }

    public void setCanFly(ICanFly canFly) {
        this.canFly = canFly;
    }
//makeFly()方法；
    public void makeFly(){
        canFly.fly();
    }

    public static void main(String[] args) {
    Test test = new Test();
    Bird bird = new Bird();
    AirPlane airPlane = new AirPlane();
    //test.setCanFly(bird);
    test.setCanFly(airPlane);
    test.makeFly();


    }
}
