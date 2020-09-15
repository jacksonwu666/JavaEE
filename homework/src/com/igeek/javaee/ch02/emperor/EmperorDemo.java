package com.igeek.javaee.ch02.emperor;

import java.sql.SQLOutput;

public class EmperorDemo {
    private String name;
    private String time;
    private String achievement;
    private String describe;
    public EmperorDemo(){

    }

    public EmperorDemo(String name,String time,String achievement,String describe){
        this.name = name;
        this.time = time;
        this.achievement = achievement;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getAchievement() {
        return achievement;
    }

    public String getDescribe() {
        return describe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public void show(){
        System.out.println("皇帝名字："+name);
        System.out.println("在位时间："+time);
        System.out.println("政绩："+achievement);
        System.out.println("描述："+describe);
    }
    public static void main(String[] args) {
        System.out.println("构造有参构造传入参数");
        EmperorDemo emo = new EmperorDemo("秦始皇嬴政","前259年-前210年",
                "首次完成大一统","中国第一个称帝");
        emo.show();
        System.out.println("==========================");
        System.out.println("构造无参构造传入参数");
        EmperorDemo emo1 = new EmperorDemo();
        emo1.setName("秦始皇嬴政");
        emo1.setTime("前259年-前210年");
        emo1.setAchievement("首次完成大一统");
        emo1.setDescribe("中国第一个称帝");
        emo1.show();

    }

}

