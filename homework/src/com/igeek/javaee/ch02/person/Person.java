package com.igeek.javaee.ch02.person;

public class Person {
    private String name;
    private int age;
    private boolean gender;
    Person partner = null;

    public Person() {

    }

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


    public boolean marry(Person p) {
        if (this.gender = p.gender) {
            System.out.println("不能结婚的原因：");
            System.out.println("同性");
            return false;
        }
            if (this.gender = true && age < 24) {
                System.out.println("不能结婚的原因：");
                System.out.println("未达到结婚年龄，男<24");
                return false;

            }
            if(this.gender =false && age < 22){
                System.out.println("不能结婚的原因：");
                System.out.println("未达到结婚年龄，女<22");
                return false;
            }
            if (this.partner != null || p.partner != null) {
                System.out.println("不能结婚的原因：");
                System.out.println("某一方已婚");
                return false;
            }
            this.partner = p;
            p.partner = this;
            System.out.println("恭喜" + this.name + "和" + p.name + "结婚！");
             return true;
    }
}





