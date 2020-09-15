package com.igeek.javaee.ch02.person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("张三",25,true);
        Person person2 = new Person("李四",25,false);
        person1.marry(person2);
        Person person3 = new Person("王五",25,true);
        Person person4 = new Person("小张",25,true);
        person3.marry(person4);
        Person person5 = new Person("张六",21,true);
        Person person6 = new Person("李小姐",25,false);
        person5.marry(person6);
        Person person7 = new Person("张先生",26,true);
        Person person8 = new Person("刘小姐",21,false);
        person7.marry(person8);




    }
}
