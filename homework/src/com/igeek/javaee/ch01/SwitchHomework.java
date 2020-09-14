package com.igeek.javaee.ch01;

import java.util.Scanner;

public class SwitchHomework {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入学员考试成绩：");
        int grade = sc.nextInt();
        switch(grade/10){
            case 10:
            case 9:
                System.out.println("A级");
                break;
            case 8:
                System.out.println("B级");
                break;
            case 7:
                System.out.println("C级");
                break;
            case 6:
                System.out.println("D级");
                break;
            default:
                System.out.println("不合格");
        }


        }
    }

