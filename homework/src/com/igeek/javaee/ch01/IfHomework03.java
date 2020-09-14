package com.igeek.javaee.ch01;

import java.util.Scanner;

public class IfHomework03 {
    public static void main(String[] args) {
     Scanner sc = new  Scanner(System.in);
        System.out.println("请输入性别：");
        String sex = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入身高：");
        int height = sc.nextInt();
        if ((sex.equals("男"))&&(height>170)
                &&(age>=20&&age<=26)){
            System.out.println("男生可以入伍！");
        }else if((sex.equals("女"))&&(height>162)
                &&(age>=20&&age<=22))
        {
            System.out.println("女生可以入伍");
        }
        else{
            System.out.println("没有符合条件人入伍");
        }
    }
}
