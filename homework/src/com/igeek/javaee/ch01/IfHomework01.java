package com.igeek.javaee.ch01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class IfHomework01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第运算符");
         String str  = sc.next();
         if (str.equals("+")) {
             System.out.println("a+b的值为：" + a + b);
         }else
         {
             System.out.println("输入有误！结束运算");
         }

    }


}
