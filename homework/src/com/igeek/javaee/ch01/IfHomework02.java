package com.igeek.javaee.ch01;

import java.util.Scanner;

public class IfHomework02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("请输入订票日期(格式xx.xx)：");
        Double date = sc.nextDouble();
        System.out.println("请输入订票价格：");
        Double  price = sc.nextDouble();
        if ((date>=1.01&&date<=1.03)||(date>=5.01
                &&date<=5.03)||(date>=10.01&&date<=10.07)){
            System.out.println("应付"+price+"元");

        }else{
            System.out.println("应付"+price*0.8+"元");
        }

    }

}
